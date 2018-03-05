package sg.edu.nus.iss.pmprs.business.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.exceptions.BusinessException;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsVehicleRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;
import sg.edu.nus.iss.pmprs.mobile.updatemember.AddVehicleRequest;
import sg.edu.nus.iss.pmprs.mobile.updatemember.AddVehicleResponse;
import sg.edu.nus.iss.pmprs.vo.MemberVo;

@Component
public class AddCarBl extends BusinessLogic<AddVehicleResponse> {
	@Autowired
	PmprsMemberRepository memberRepository;
	@Autowired
	PmprsVehicleRepository vehicleRepository;
	private AddVehicleRequest request;
	private String userId;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		PmprsMember member = null;
		if (this.getUserId() != null) {
			member = memberRepository.findByMemberUserId(this.getUserId());

		}
		AddVehicleResponse res = new AddVehicleResponse();
		// PmprsMember member = memberRepository.getOne(this.getUserId());

		if (member != null) {

			if (this.getRequest().getOperation()
					.equals(AddVehicleRequest.Operation.ADD.name())) {

				for (PmprsMemberVehicle vehicle : member.getMemberVehicle()) {
					if (vehicle
							.getIuNumber()
							.trim()
							.equalsIgnoreCase(
									this.getRequest().getCar().getIuNumber()
											.trim())) {
						throw new BusinessException("IU NUMBER ALREADY EXISTS");

					}
				}
				PmprsMemberVehicle e = new PmprsMemberVehicle();
				e.setIuNumber(this.getRequest().getCar().getIuNumber());
				e.setVehiclePlateNumber(this.getRequest().getCar()
						.getVehiclePlateNumber());
				e.setMember(member);
				vehicleRepository.save(e);
				vehicleRepository.flush();
				
				 List<PmprsMemberVehicle> addList =vehicleRepository.findByMember(member);
				 
				List<Vehicle> vehicles = new ArrayList<Vehicle>();
				convertVehcicleToPmprsMember(addList, vehicles);
				res.setVehicles(vehicles);
			} else if (this.getRequest().getOperation()
					.equals(AddVehicleRequest.Operation.LIST.name())) {
				List<PmprsMemberVehicle> v = member.getMemberVehicle();
				List<Vehicle> vehicles = new ArrayList<Vehicle>();
				convertVehcicleToPmprsMember(v, vehicles);
				res.setVehicles(vehicles);
			} else if (this.getRequest().getOperation()
					.equals(AddVehicleRequest.Operation.REMOVE.name())) {
				PmprsMemberVehicle e = new PmprsMemberVehicle();
				e.setIuNumber(this.getRequest().getCar().getIuNumber());
				e.setVehiclePlateNumber(this.getRequest().getCar()
						.getVehiclePlateNumber());
				//PmprsMemberVehicle v = new PmprsMemberVehicle();
				List<PmprsMemberVehicle> removeList=member.getMemberVehicle();
				for (PmprsMemberVehicle vehicle :removeList) {
					if (vehicle
							.getIuNumber()
							.trim()
							.equalsIgnoreCase(
									this.getRequest().getCar().getIuNumber()
											.trim())) {
						vehicleRepository.delete(vehicle);
						removeList.remove(vehicle);
						break;
					}
				}

				// member.getMemberVehicle().add(e);
				//PmprsMember mem = memberRepository.findByMemberUserId(this.getUserId());

				List<Vehicle> vehicles = new ArrayList<Vehicle>();
				convertVehcicleToPmprsMember(removeList, vehicles);
				res.setVehicles(vehicles);
			}

			setResult(res);
		} else {
			throw new BusinessException("Member not found");
		}
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

	public AddVehicleRequest getRequest() {
		return request;
	}

	public void setRequest(AddVehicleRequest request) {
		this.request = request;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void convertVehcicleToPmprsMember(List<PmprsMemberVehicle> mv,
			List<Vehicle> vehicles) {

		for (PmprsMemberVehicle v : mv) {
			Vehicle vehicle = new Vehicle();
			if (v.getId() != null)
				vehicle.setId(v.getId().toString());
			vehicle.setIuNumber(v.getIuNumber());
			vehicle.setVehiclePlateNumber(v.getVehiclePlateNumber());
			vehicles.add(vehicle);
		}
	}

}

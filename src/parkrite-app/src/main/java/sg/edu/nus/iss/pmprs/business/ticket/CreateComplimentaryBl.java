package sg.edu.nus.iss.pmprs.business.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsComplimentaryRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;


import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryVo;


@Component
public class CreateComplimentaryBl extends BusinessLogic<Boolean> {

	@Autowired 
	PmprsComplimentaryRepository cRespository;
	private ComplimentaryVo complimentaryVo;
	
	@Override
	protected void execute(CommonVo vo) {
		System.out.println("ComplimentaryBL excute");
		ComplimentaryVo comVo = (ComplimentaryVo) vo;
		PmprsComplimentary p = new PmprsComplimentary();
		p.setMemberId(comVo.getMemberId());
		p.setVehiclePlateNumber(comVo.getVehiclePlateNumber());
		p.setIuNumber(comVo.getIuNumber());
		p.setUserEmail(comVo.getUserEmail());
	
		
		p.setCarParkId(comVo.getCarParkId());
		p.setFromDate(comVo.getFromDate());
		p.setToDate(comVo.getToDate());
		
		p.setReasonId(comVo.getReasonId());
		p.setRemarks(comVo.getRemarks());
		cRespository.save(p);
		cRespository.flush();
	}


	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		//if(this.getComplimentary().getMemberId()==null)
		//throw new NoCarparkIdException();
	}

	public void setComplimentary(ComplimentaryVo complimentary) {
		this.complimentaryVo = complimentary;
	}
	
	public ComplimentaryVo  getComplimentary(){
		return this.complimentaryVo;
	}
}

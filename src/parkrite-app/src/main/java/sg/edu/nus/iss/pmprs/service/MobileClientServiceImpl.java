package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.booking.CheckBookingStatusBl;
import sg.edu.nus.iss.pmprs.business.booking.NewBokingBl;
import sg.edu.nus.iss.pmprs.business.carpark.AddFavouriteCarparkBl;
//import sg.edu.nus.iss.pmprs.business.carpark.NearByCarparkBl;
import sg.edu.nus.iss.pmprs.business.carpark.ViewFavouriteCarparkBl;
import sg.edu.nus.iss.pmprs.business.inbox.InboxMessageBl;
import sg.edu.nus.iss.pmprs.business.member.AddCarBl;
import sg.edu.nus.iss.pmprs.business.member.LoadMemberBl;
import sg.edu.nus.iss.pmprs.business.member.MemberRegistrationBl;
import sg.edu.nus.iss.pmprs.business.member.UpdateMemberBl;
import sg.edu.nus.iss.pmprs.business.mobiledashboard.GetDashboardInfoBl;
//import sg.edu.nus.iss.pmprs.dao.CarParkRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsInboxMessage;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.mobile.booking.CheckStatusResponse;
import sg.edu.nus.iss.pmprs.mobile.booking.PaymentRequest;
import sg.edu.nus.iss.pmprs.mobile.booking.PaymentResponse;
import sg.edu.nus.iss.pmprs.mobile.dashboard.DashboardResponse;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.FavouriteCarparkAddRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkResponse;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.ViewFavouriteCarparksReponse;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.mobile.updatemember.AddVehicleRequest;
import sg.edu.nus.iss.pmprs.mobile.updatemember.AddVehicleResponse;
import sg.edu.nus.iss.pmprs.mobile.updatemember.UpdateMemberResponse;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.ViewRewardsResponse;
import sg.edu.nus.iss.pmprs.vo.AddFavouriteCarparkVo;
import sg.edu.nus.iss.pmprs.vo.DashboardRequestVo;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.RedeemVo;
import sg.edu.nus.iss.pmprs.vo.booking.BookingRequestVo;
import sg.edu.nus.iss.pmprs.vo.booking.PaymentVo;
import sg.edu.nus.iss.pmprs.business.member.ChangePasswordBl;
import sg.edu.nus.iss.pmprs.business.payment.NewPaymentBl;
import sg.edu.nus.iss.pmprs.business.redeem.RedeemBl;
import sg.edu.nus.iss.pmprs.business.redeem.ViewsRewardsBl;
import sg.edu.nus.iss.pmprs.core.amazon.mq.QueueMessageSender;
import sg.edu.nus.iss.pmprs.core.exceptions.BusinessException;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

@org.springframework.stereotype.Service
@Transactional
public class MobileClientServiceImpl extends Service implements
		MobileClientService {
	@Autowired
	AddCarBl addcarBl;
  //  @Autowired
	//NearByCarparkBl carparkBl;
	@Autowired
	ChangePasswordBl changePasswordBl;
	@Autowired
	RedeemBl redeemBl;

	@Autowired
	MemberRegistrationBl bl;

	@Autowired
	CheckBookingStatusBl checkingBookingBl;
	@Autowired
	NewPaymentBl paymentBl;
	@Autowired
	NewBokingBl newBookingBl;
	@Autowired
	InboxMessageBl inboxMessageBl;
	@Autowired
	LoadMemberBl loadMemberBl;
	@Autowired
	GetDashboardInfoBl dashboardBl;
	@Autowired
	PmprsMemberRepository memberRepository;
	@Autowired
	ViewsRewardsBl viewRewardsBl;
	@Autowired
	AddFavouriteCarparkBl favouriteBl;
	@Autowired
	ViewFavouriteCarparkBl viewFavBl;

	@Autowired
	UpdateMemberBl memberBl;
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MobileClientServiceI#newBooking(sg.edu.nus
	 * .iss.pmprs.vo.booking.BookingRequestVo)
	 */
	public BookingResponse newBooking(BookingRequestVo bookingVo) {

		newBookingBl.setParamter(bookingVo);
		newBookingBl.process();
		return newBookingBl.getResult();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MobileClientServiceI#checkBookingStatus(
	 * java.lang.String)
	 */
	public CheckStatusResponse checkBookingStatus(String userId) {

		checkingBookingBl.setUserId(userId);
		checkingBookingBl.process();
		return checkingBookingBl.getResult();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MobileClientServiceI#register(sg.edu.nus
	 * .iss.pmprs.mobile.register.RegistrationRequest)
	 */
	public PmprsMember register(MemberRegisterVo vo) {
		bl.setParamter(vo);
		bl.process();
		bl.getResult();
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MobileClientServiceI#getDashboard(sg.edu
	 * .nus.iss.pmprs.vo.PmprsUserVo)
	 */
	public DashboardResponse getDashboard(DashboardRequestVo vo) {

		dashboardBl.setParamter(vo);
		dashboardBl.process();
		return dashboardBl.getResult();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MobileClientServiceI#getInboxMessage(sg.
	 * edu.nus.iss.pmprs.vo.PmprsUserVo)
	 */
	public List<PmprsInboxMessage> getInboxMessage(String userId) {

		inboxMessageBl.setStringParam(userId);
		inboxMessageBl.process();
		return inboxMessageBl.getResult();
	}

	public boolean checkUserByUserIdPassword(String userId, String password) {
		// TODO Auto-generated method stub
		PmprsMember m = memberRepository.findByMemberUserIdAndPassword(userId,
				password);
		if (m != null)
			return true;
		return false;
	}

	public LoginResponse loadMember(String memberUserId) {
		// TODO Auto-generated method stub
		loadMemberBl.setStringParam(memberUserId);
		loadMemberBl.process();

		return loadMemberBl.getResult();
	}

	public boolean changePassword(String userId, String oldPassword,
			String newPassword) {

		changePasswordBl.setNewPassword(newPassword);
		changePasswordBl.setOldPassword(oldPassword);
		changePasswordBl.setUserId(userId);
		changePasswordBl.process();
		return changePasswordBl.getResult();
	}

	public ViewRewardsResponse viewRewards(String userId) {
		// TODO Auto-generated method stub
		viewRewardsBl.setUserId(userId);
		viewRewardsBl.process();
		return viewRewardsBl.getResult();
	}

	public boolean redeem(RedeemVo vo) {

		redeemBl.setParamter(vo);
		redeemBl.process();
		return redeemBl.getResult();
	}

	@Autowired
	PmprsCarParkRepository carparkRepository;

	public boolean addFavouriteCarpark(String loginUser, FavouriteCarparkAddRequest request) {

		AddFavouriteCarparkVo vo = new AddFavouriteCarparkVo();
		Product carpark = null;
		try {
			
			carpark = carparkRepository.getOne(Integer.parseInt(request.getCarparkId()));

		} catch (Exception e) {
			throw new BusinessException("Invalid Carpark id");
		}
		vo.setCarpark(carpark);
		PmprsMember member = memberRepository.findByMemberUserId(loginUser);
		vo.setMember(member);
		favouriteBl.setParamter(vo);
		favouriteBl.setDelete(request.isDelete());
		favouriteBl.process();
		return favouriteBl.getResult();
	}

	public ViewFavouriteCarparksReponse viewFavouriteCarparks(String loginUser) {
		CommonVo vo = new CommonVo();
		vo.setLoggedInUserId(loginUser);
		// TODO Auto-generated method stub
		viewFavBl.setParamter(vo);
		viewFavBl.process();
		return viewFavBl.getResult();
	}

	
	public UpdateMemberResponse  modifyMember(MemberVo member)
	{
		 memberBl.setParamter(member);
		 memberBl.process();
		 return memberBl.getResult();
	}

	public NearByCarParkResponse nearByCarPark(NearByCarParkRequest request) {
		// TODO Auto-generated method stub
		
		//carparkBl.setRequest(request);
	//	carparkBl.process();
		//return carparkBl.getResult();
		return null;
	}

	public AddVehicleResponse addVehicle(AddVehicleRequest request,String userId) {
		// TODO Auto-generated method stub
		logger.info(userId);
		addcarBl.setRequest(request);
addcarBl.setUserId(userId);
addcarBl.process();

		return addcarBl.getResult();
	}

	public PaymentResponse submitPayment(PaymentRequest requestObj) {
		// TODO Auto-generated method stub
		paymentBl.setParamter(new PaymentVo(requestObj));
		paymentBl.process();
		return paymentBl.getResult();
	}
}

package sg.edu.nus.iss.pmprs.service;

import java.util.List;

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
import sg.edu.nus.iss.pmprs.vo.DashboardRequestVo;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.RedeemVo;
import sg.edu.nus.iss.pmprs.vo.booking.BookingRequestVo;

public interface MobileClientService {

	public abstract BookingResponse newBooking(BookingRequestVo bookingVo);

	public abstract CheckStatusResponse checkBookingStatus(
			String userId);

	public abstract PmprsMember register(MemberRegisterVo vo);

	public abstract DashboardResponse getDashboard(DashboardRequestVo vo);

	public abstract List<PmprsInboxMessage> getInboxMessage(String userId);
	public boolean checkUserByUserIdPassword(String userId,String password);
	public LoginResponse loadMember(String memberUserId);

	public boolean changePassword(String userId, String oldPassword, String newPassword);

	public  ViewRewardsResponse viewRewards(String username);

	public  boolean redeem(RedeemVo vo);

	
	public ViewFavouriteCarparksReponse viewFavouriteCarparks(String loginUser);
	public UpdateMemberResponse  modifyMember(MemberVo member);
	public  NearByCarParkResponse nearByCarPark(NearByCarParkRequest request);
	public  AddVehicleResponse addVehicle(AddVehicleRequest request,String userID);

	public  PaymentResponse submitPayment(PaymentRequest requestObj);

	public  boolean addFavouriteCarpark(String loginUser,FavouriteCarparkAddRequest requestObj);
}
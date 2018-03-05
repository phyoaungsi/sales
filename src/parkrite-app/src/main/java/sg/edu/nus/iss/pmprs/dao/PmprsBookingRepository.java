package sg.edu.nus.iss.pmprs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;



public interface PmprsBookingRepository  extends JpaRepository<Order,Integer> {

	Order findByInvRef(String invRef);
	
	@Query("select u from Order u")
	List<Order> findByCarParkIdAndStatusId(int carparkId,int statusId);
	@Query("select u from Order u ")
	List<Order> findByCarParkId(int carparkId);
	@Query("select u from Order u ")
	List<Order> findByCarParkIdAndCreatedTime(int carparkId,Date d);
	@Query("select u from Order u")
	List<Order> findByCarParkIdAndCreatedTimeAndStatusId(int carParkId,Date d,int statusId);
	
	
	@Query("select u from Order u ")
	List<Order> getTodayBookings(Date from,Date to,int carParkId);
	
	@Query("select u from Order u")
	List<Order> getLatestBookingsByMember(PmprsMember member,Date fromTime);

	
}

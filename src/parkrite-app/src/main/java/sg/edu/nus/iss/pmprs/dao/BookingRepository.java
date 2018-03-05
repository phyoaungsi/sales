package sg.edu.nus.iss.pmprs.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.BookCarPark;

/**
 * Specifies methods used to obtain and modify person related information
 * which is stored in the database.
 * @author Petri Kainulainen
 */
public interface BookingRepository extends JpaRepository<BookCarPark, Long> {
	
	 List<BookCarPark> findByCarparkIdAndBookinStatus(String carparkId,String bookingStatus);
	 List<BookCarPark> findByCarparkId(String carparkId);
	 List<BookCarPark> findByCarparkIdAndCreatedTime(String carparkId,Date d);
	 List<BookCarPark> findByCarparkIdAndCreatedTimeAndBookinStatus(String carparkId,Date d,String bookingStatus);

}

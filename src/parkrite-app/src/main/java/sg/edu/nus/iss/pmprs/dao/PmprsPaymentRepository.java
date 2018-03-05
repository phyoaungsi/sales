package sg.edu.nus.iss.pmprs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.edu.nus.iss.pmprs.entity.PmprsPayment;

public interface PmprsPaymentRepository extends JpaRepository<PmprsPayment ,Integer>  {

	PmprsPayment findByPaymentRefNumber(String paymentRefNumber);
}

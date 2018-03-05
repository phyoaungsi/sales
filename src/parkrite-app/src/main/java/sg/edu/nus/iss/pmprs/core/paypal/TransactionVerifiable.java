package sg.edu.nus.iss.pmprs.core.paypal;

public interface TransactionVerifiable {
	
	public TrxStatus checkTransaction(String transactionRefNumber);

}

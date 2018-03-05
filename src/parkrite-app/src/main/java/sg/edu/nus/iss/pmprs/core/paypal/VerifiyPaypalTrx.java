package sg.edu.nus.iss.pmprs.core.paypal;

import org.apache.log4j.Logger;

import com.paypal.api.payments.Capture;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

public class VerifiyPaypalTrx implements TransactionVerifiable {

	public TrxStatus checkTransaction(String transactionRefNumber) {
		// TODO Auto-generated method stub
		OAuthTokenCredential tokenCredential = new OAuthTokenCredential(
				"Ac7pJhC3-shugP37ocNMWsR-Lk3XECvxFOjkPCOtgAAsi5DU-YYWMcC3Jf_y", "EAAXaBCkPfl9nGfoGusaNIhNFxBcGmkZK_EKM1FgY5dC_ecYV3W7bnw42xUU");

		String accessToken;
		try {
			accessToken = tokenCredential.getAccessToken();
			Capture capture = Capture.get(accessToken, transactionRefNumber);
		    Logger log=Logger.getLogger(this.getClass());
		    log.info(capture.getState());
		} catch (PayPalRESTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}

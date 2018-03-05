package sg.edu.nus.iss.pmprs.mobile.viewrewards;

import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;
import sg.edu.nus.iss.pmprs.mobile.CommonResponse;

public class ViewRewardsResponse  extends CommonResponse {

	private List<Reward> rewards;
	private String statusCode;
	private String statusMessage;
	private String faultString;


	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public List<Reward> getRewards() {
		return rewards;
	}

	public void setRewards(List<Reward> rewards) {
		this.rewards = rewards;
	}

	public String getFaultString() {
		return faultString;
	}

	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
}

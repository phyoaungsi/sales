package sg.edu.nus.iss.pmprs.vo.ticket;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class PromotionReasonVo extends CommonVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5589179626828083877L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int id;

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public int getId() {

		return id;
	}
	
}

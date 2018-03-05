package sg.edu.nus.iss.pmprs.web.actions.ticket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;





import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;







import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.service.ComplimentaryService;
import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.service.PromotionReasonService;
import sg.edu.nus.iss.pmprs.service.RedemptionService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;
import sg.edu.nus.iss.pmprs.vo.ticket.RedemptionVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.RedemptionForm;





@Action(
		value="redemptionaction", 
	    	results={
				@Result(name="success", location="/content/ticket/Redemption.jsp"),
				@Result(name="fail", location="/content/ticket/Redemption.jsp"),
		}
		)


public class RedemptionAction extends CommonAction  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7321451797489304310L;


	Logger logger = Logger.getLogger(this.getClass());


	@Autowired
	@Qualifier("redemptionServiceImpl")
	RedemptionService redeemservice;

	RedemptionForm model;

	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService service;

	@Autowired
	@Qualifier("promotionReasonServiceImpl")
	PromotionReasonService servicereason;
	
	
	private List<PromotionReasonVo> reasons ;
	
	@Autowired
	@Qualifier("complimentaryServiceImpl")
	ComplimentaryService compservice;
	
	
	@Autowired
	CarparkService carparkservice;
	
			private Boolean search;
			private String searchBy;
			private String nric;
			private Boolean giveredemption;
		
			private String name;
			private Integer id;
			MemberVo members;
			private String carparkId;
			private String carparkName;
			
			boolean iserror = false;
			Collection<String> messages = new ArrayList<String>();
		   
			
			
			public String execute() {
				//Server Side Validation ......
			
				getReasons();
				getCarparks();
				
				if (getSearch() != null){ 
						members = service.searchMemberbyNric("nric", getNric());
						if (members != null){
							model.setNric(members.getNric());
							model.setUserName(members.getName());
							model.setDob(members.getBirthDate());
							model.setMemberId(members.getId());
							model.setUserEmail(members.getEmail());
							
							return SUCCESS;
					}
				}
				
				if (getGiveredemption() !=null ){
						
						checkvalidation();
					
						if ( iserror == true ) {
							super.setActionErrors(messages);
							return "fail";
						}
						
						else {
							model.getVehiclePlateNumber();
							RedemptionVo vo = new RedemptionVo();
						
							vo.setMemberId(model.getMemberId());
							vo.setRemarks(model.getRemarks());
							vo.setFromDate(model.getFromDate());
							vo.setToDate(model.getToDate());
							vo.setReasonId(model.getReasonId());
							vo.setCarParkId(Integer.parseInt(model.getCarparkId()));
							
							try{		
							vo.setAmount(Double.parseDouble(model.getAmount().toString()));
							}
							catch(Exception ex){
								messages.add("Please input valid format on Redemption Amount.");
								setActionErrors(messages);
								return "fail";
							}
							
							
							try{
							redeemservice.createRedemption(vo);
							}
							catch(Exception ex){
								messages.add("Redemption ticket can not create succcessfully! Please input valid format.");
								setActionErrors(messages);
								return "fail";
							}
							model = new RedemptionForm();
							this.setNric("");
							messages.add("Successfully sent Redemption ticket.");
							setActionMessages(messages);
							return SUCCESS;
						}
				
				}
				return SUCCESS;
		}
			
		public void checkvalidation(){
			
			if (model.getMemberId() == null ||  model.getMemberId() < 1){
				messages.add("Member NRIC and Name is required !");
				iserror = true;
			}
			
			if (model.getFromDate() == null ){
				messages.add("Valid From Date is required !");
				iserror = true;
			}
			
			if (model.getToDate() == null ){
				messages.add("Valid To Date is required !");
				iserror = true;
			}
			
			if (model.getCarparkId() == null ||  model.getCarparkId() == "-1"){
				messages.add("Car Park Name is required !");
				iserror = true;
			}
			
			if (model.getReasonId() == null ||  model.getReasonId() < 1){
				messages.add("Reason Name is required !");
				iserror = true;
			}
			
			if (model.getAmount() == null ||  model.getAmount() < 1){
				messages.add("Redemption amount is required !");
				iserror = true;
			}
			
			
		}
	
		public MemberVo getMembers() {
			return members;
		}
	
		public void setMembers(MemberVo members) {
			this.members = members;
		}
	
		public Boolean getSearch() {
			return search;
		}
	
		public void setSearch(Boolean search) {
			this.search = search;
		}
	
		public String getSearchBy() {
			return searchBy;
		}
	
		public void setSearchBy(String searchBy) {
			this.searchBy = searchBy;
		}
	
		public String getNric() {
			return nric;
		}
	
		public void setNric(String nric) {
			this.nric = nric;
		}
	
		public List<PromotionReasonVo> getReasons() {
			reasons = servicereason.getPromotionReasons();
			return reasons;
		}

		public List<ProductVo> getCarparks() {
			List<ProductVo> carparks = carparkservice.getAllCarparks();
			return carparks;
		}

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}

		public String getCarparkId() {
			return carparkId;
		}

		public void setCarparkId(String carparkId) {
			this.carparkId = carparkId;
		}

		public String getCarparkName() {
			return carparkName;
		}

		public void setCarparkName(String carparkName) {
			this.carparkName = carparkName;
		}

	
	public RedemptionForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}


	public void setModel(RedemptionForm model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

	public Boolean getGiveredemption() {
		return giveredemption;
	}

	public void setGiveredemption(Boolean giveredemption) {
		this.giveredemption = giveredemption;
	}
}

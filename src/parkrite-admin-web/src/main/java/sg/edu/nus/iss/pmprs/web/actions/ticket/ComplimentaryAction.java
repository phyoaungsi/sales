package sg.edu.nus.iss.pmprs.web.actions.ticket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.service.ComplimentaryService;
import sg.edu.nus.iss.pmprs.service.PromotionReasonService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryVo;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.ComplimentaryForm;



@Action(value = "complimentaryaction", results = {
		@Result(name = "success", location = "/content/ticket/Complimentary.jsp"),
		@Result(name="fail", location="/content/ticket/Complimentary.jsp")

})

public class ComplimentaryAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5698224237920010080L;
	
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
			private Boolean givecomplimentary;
			private ComplimentaryForm model;
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
						System.out.println("getSearch");
						members = service.searchMemberbyNric("nric", getNric());
						
						if (members != null){
							System.out.println("get Birth DATE = " + members.getBirthDate());
							model.setNric(members.getNric());
							model.setUserName(members.getName());
							model.setDob(members.getBirthDate());
							model.setMemberId(members.getId());
							model.setUserEmail(members.getEmail());
							
							return SUCCESS;
					}
				}
				
				if (getGivecomplimentary() !=null ){
						
						checkvalidation();
					
						if ( iserror == true ) {
							super.setActionErrors(messages);
							return "fail";
						}
						
						else {
							model.getVehiclePlateNumber();
							ComplimentaryVo vo = new ComplimentaryVo();
							vo.setMemberId(model.getMemberId());
							vo.setRemarks(model.getRemarks());
							vo.setFromDate(model.getFromDate());
							vo.setToDate(model.getToDate());
							vo.setReasonId(model.getReasonId());
							vo.setCarParkId(Integer.parseInt(model.getCarparkId()));
							
							try{
							compservice.createComplimentary(vo);
							}
							catch(Exception ex){
								messages.add("Complimentary ticket can not create succcessfully! Please input valid format.");
								setActionErrors(messages);
								return "fail";
							}
							model = new ComplimentaryForm();
							this.setNric("");
							messages.add("Successfully sent complimentary ticket.");
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
			else{
				try{
				Integer carparkid =  Integer.parseInt( model.getCarparkId());
				}
				catch(Exception ex){
					messages.add("Choose Car park ID is required !");
					iserror = true;
				}
			}
			
			if (model.getReasonId() == null ||  model.getReasonId() < 1){
				messages.add("Reason Name is required !");
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
	
		public ComplimentaryForm getModel() {
			return model;
		}

		public void setModel(ComplimentaryForm model) {
			this.model = model;
		}

		public Boolean getGivecomplimentary() {
			return givecomplimentary;
		}

		public void setGivecomplimentary(Boolean givecomplimentary) {
			this.givecomplimentary = givecomplimentary;
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
}

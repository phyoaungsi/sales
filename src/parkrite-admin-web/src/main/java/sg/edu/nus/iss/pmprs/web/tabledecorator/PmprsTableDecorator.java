package sg.edu.nus.iss.pmprs.web.tabledecorator;

import org.displaytag.decorator.TableDecorator;

import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.dashboard.DashBoardVo;
import sg.edu.nus.iss.pmprs.web.form.CarparkownerForm;
import sg.edu.nus.iss.pmprs.web.form.CarparkownersearchTable;

public class PmprsTableDecorator extends TableDecorator {

	
	public String getMemberIdLink()
	{	MemberVo lObject= (MemberVo)getCurrentRowObject();
		int lIndex= getListIndex();
		return "<a href=\"editMemberForm.do?memberId=" + lObject.getId() + "\">" + lObject.getMemberUserId() + "</a>";
	}
	
	public String getCarparkIdLink()
	{	CarParkVo lObject= (CarParkVo)getCurrentRowObject();
		int lIndex= getListIndex();
		return "<a href=\"editCarparkForm.do?model.id=" + lObject.getCarparkId() + "\">" + lObject.getCarparkId() + "</a>";
	}
	
	public String getUserIdLink()
	{	PmprsUser lObject= (PmprsUser)getCurrentRowObject();
		int lIndex= getListIndex();
		return "<a href=\"editUserForm.do?model.userId=" + lObject.getUserName() + "\">" + lObject.getUserName() + "</a>";
	}
	
	public String getDashboardDetail()
	{	DashBoardVo lObject= (DashBoardVo)getCurrentRowObject();
		int lIndex= getListIndex();
		return "<a href=\"bookingDetails.do?carparkId=" + lObject.getCarparkId() + "\">Details</a>";
	}
	
	
	public String getParkritemerchantid(){
		CarparkownersearchTable cpoOject= (CarparkownersearchTable)getCurrentRowObject();
		int lIndex = getListIndex();
		return "<a href=\"maintaincarparkownerform.do?merchantid=" + cpoOject.getCarparkid()+ "\">" + cpoOject.getParkritemerchantid() + "</a>";
			
	}
	
	public String getParkritemerchantidforcarpark(){
		
		CarparkownersearchTable cpoOject= (CarparkownersearchTable)getCurrentRowObject();
		
		return "<a href=\"carparkcreateform.do?merchantid=" + cpoOject.getCarparkid()+ "\">" + cpoOject.getParkritemerchantid() + "</a>";
	}
	
}

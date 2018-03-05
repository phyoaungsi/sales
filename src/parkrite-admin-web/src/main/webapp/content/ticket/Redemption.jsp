<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>


<html>
<head>
<!-- 
 <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
	<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
	<link rel="stylesheet" href="/resources/demos/style.css">
	<script src="<s:url value="/js/jquery.ui.datepicker.js"/>"></script>
 -->
	


<link href="<s:url value="/css/carparkowner.css"/>" rel="stylesheet">
<title>Redemption Ticket</title>
	<script>

	
	$(function() {
		$("#fromdatepicker").datepicker(
			{		 
			}		
		
		);
	});
	
	$(function() {
		$("#todatepicker").datepicker(
			{
			}		
		);
	});
	
</script>
</head>
<body>

	<s:form class="form-horizontal" action="redemptionaction" >
 
 	<table class="carparkform-table">
		<tr><td>
	
		<table class="carparkform-col1">
	   		<s:textfield name="nric" label="Member NRIC "  /> <s:submit value="Search" name="search" />
	   		<s:textfield name="model.userName" label="Member Name "  readonly="true" />
	   		<s:textfield name="model.dob" label="DOB "  readonly="true" />
	   	
	   		<s:hidden name="model.memberId"></s:hidden>
	   		<s:hidden name="model.userEmail"></s:hidden>
		</table>
			
		</td>
			<td>
			<table class="carparkform-col2">
				
			<s:select label="Carpark Name" name="model.carparkId" 
        	headerValue="--- Please Select ---" headerKey="-1" 
        	list="carparks" cssClass="form-control"  listKey="carparkId" listValue="carparkName"  />
        	
			<s:textfield name="model.fromDate"  label="Valid from"  id="fromdatepicker"    />
			<s:textfield name="model.toDate"  label="Valid to"  id="todatepicker" />
			<s:textfield name="model.amount"  label="Redemption Amount($)"   />
			<s:select label="Redemption Reason" name="model.reasonId" 
        	headerValue="--- Please Select ---" headerKey="-1" listKey="id" listValue="name"
        	list="reasons" cssClass="form-control"  />
			
			<s:textarea name="model.remarks" label="Remark" class="Remark"/>

			<tr><td >
					<table><s:submit value="Give Redemption Ticket" name="giveredemption"/></table>
	   		</td><td>
	   	
	   		</td>
	   		</tr>
		</table> 
	   		 </td></tr>
	   </table>
	   		

	</s:form> 

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>

<link href="<s:url value="/css/carparkowner.css"/>" rel="stylesheet">
<title>Car Park Owner Creation</title>
</head>
<body>
	
	<s:form class="form-horizontal" action="createcarparkowner" >
 
 	<table class="carparkform-table">
		<tr><td>
	
		<table class="carparkform-col1">
	   		<s:textfield name="model.parkriteMerchantid" label="Parkrite Merchant ID * "  />
	   		<s:textfield name="model.email" label="CPO Email * " />
	   		<s:hidden name="model.password"  /> 
	   		<s:textfield name="model.name"  label ="Full Name * " />
			<s:textfield name="model.nric"  label ="NRIC"/>
			<s:textfield name="model.contactno"  label ="Contact No"/>
			<s:textfield name="model.designation"  label ="Designation"/>
		</table>
			
		</td>
		
			<td>
			<table class="carparkform-col2">
			<s:textfield name="model.companyname"  label ="Company Name * " />
			<s:textarea name="model.address"   label ="Address * " />
			<s:textfield name="model.postalcode"  label ="Postal Code * " />
			<s:textfield name="model.officephoneno"  label ="Office Number * " />
			<s:textarea name="model.remark" label="Remark" class="carparform-textarea"/>
	 
			<tr><td >
					
				<table><s:submit /></table>
	   			</td><td>
	   	
	   		</td>
	   		</tr>
		</table> 
	   		 </td></tr>
	   </table>
	   		

	</s:form> 

</body>
</html>
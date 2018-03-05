<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<s:url value="/css/user.css"/>" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create User</title>
</head>
<body>
<s:if test="username!=null">

</s:if>
<s:form class="form-horizontal" >
 
 		<s:hidden name="model.id" />
 			<s:textfield name="model.userId"  label ="User ID"/>
			<s:password name="model.password"  label ="Password"/>
			<s:select name="model.roleId" list="model.roles" label="Role"/>
 			<s:textfield name="model.email"  label ="Email"/>
	   		<s:textfield name="model.name" label="Full Name" />
	   		<s:textfield name="model.nric" label="NRIC (eg.S1234567A)" />
			<s:textfield name="model.company" label="Company" />
	   	<s:textfield name="model.desination" label="Designation" />
	   		<s:select label="Gender"
       name="model.gender"
       headerValue="Select One"
       list="#{'01':'Male', '02':'Female'}"
       value="01"
       required="true"/>
	   		<s:textarea name="model.address"  label ="Address"/>
		 <!-- <s:textfield name="model.birthDate"  label ="Date of Birth" id="dob"/> -->	
			<s:textfield name="model.homeNumber"  label ="Home Number"/>
			<s:textfield name="model.mobileNumber"  label ="Mobile Number"/>
			<s:textfield name="model.postalCode"  label ="Postal Code"/>
			<s:submit action="createUser"  />
		
	   		
</s:form> 
</body>
</html>
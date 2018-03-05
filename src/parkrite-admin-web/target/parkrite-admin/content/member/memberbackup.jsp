<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<s:if test="username!=null">
<title>Maintain Member</title>
</s:if>

<s:else>
<title>Member Creation</title>
</s:else>
 <script>
$(function() {
$("#dob").datepicker();
});
</script>
</head>
<body>
<s:if test="username!=null">

</s:if>
<s:form class="form-horizontal" >
 
 	<s:hidden name="model.id" />
	   		<s:textfield name="model.name" label="Full Name" />
	   		<s:textfield name="model.nric" label="NRIC (eg.S1234567A)" />
	   	
	   		<s:select label="Gender"
       name="model.gender"
       headerValue="Select One"
       list="#{'01':'Male', '02':'Female'}"
       value="01"
       required="true"/>
	   		<s:textfield name="model.address"  label ="Address"/>
			<s:textfield name="model.birthDate"  label ="Date of Birth" id="dob"/>
			<s:textfield name="model.homeNumber"  label ="Home Number"/>
			<s:textfield name="model.mobileNumber"  label ="Mobile Number"/>
			<s:textfield name="model.email"  label ="Email"/>
			<s:textfield name="model.memberUserId"  label ="Member ID"/>
		
			<s:textfield name="model.postalCode"  label ="Postal Code"/>
			
			<table>
			<tr><td >
				<table>
	   			<s:submit action="createMember"  /></table>
	   		</td><td>
	   		
	   		<s:if test="model.id!=null">
	   		<table>
	   		 <s:submit value="Update" action="updatemember"/></table>
	   		</s:if>
	   		 </td></tr>
	   </table>
	   		
</s:form> 
</body>
</html>
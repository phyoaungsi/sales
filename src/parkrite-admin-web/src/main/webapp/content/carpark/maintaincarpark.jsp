<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Maintain Car Park</title>
</head>
<body>

<s:form action="updatecarpark">
<tr><td><label class="label col-lg-2 control-label" >Car Park Owner:</label></td><td><s:property value="model.companyName"/></td></tr>

 <s:hidden name="model.id" />
   <s:textfield  name="model.carparkId" label="Car Park ID" />
   <s:textfield name="model.name" label="Car Park Name" />
   <s:textfield name="model.supervisorName"  label ="Supervisor Name"/>
   <s:textfield name="model.companyName"  label ="Company"/> 
   <s:textfield name="model.contactNo"  label ="Contact Number"/>
   <s:textfield name="model.parkingSlot"  label ="Parking Slot"/>
       <s:textfield name="model.bookingFee"  label ="Booking Fee"/>
    
     <s:textfield name="model.minimumHourFee"  label ="Minimum Hour Fee"/>
   <s:textfield name="model.address"  label ="Address"/>
   <s:textfield name="model.postalCode"  label ="Postal Code"/>
    <s:textfield name="model.remarks"  label ="Remarks"/>


       		<table>
				<tr><td >
	   				<table><s:submit value="Update" action="updatecarpark"/></table>
	   			</td><td>
	   		
	   		
	   		<table>
	   		 <s:submit value="Delete" action="deletecarpark"/></table>
	  
	   		</td>
	   		</tr>
		</table> 
</s:form> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Car Park</title>
</head>
<body>

<s:form action="createcarpark">

 <s:select label="Car Park Owner Id"
		
		list="carparkOwners" 
		name="model.carParkOwnerId" />
 <s:hidden name="model.id" />
   <s:textfield  name="model.productId" label="Product ID" />
   <s:textfield name="model.name" label="Name" />
   <s:textfield name="model.description"  label ="Product Description"/>
   <s:textfield name="model.websitelink"  label ="websitelink"/> 
   <s:textfield name="model.price"  label ="Price"/>
   <s:textfield name="model.quantity"  label ="Quantity"/>
    <s:textfield name="model.instock"  label ="Instock"/>
 
     <s:textfield name="model.priceLocal"  label ="Price (MMK)"/>
    <s:textfield name="model.remarks"  label ="Remarks"/>

  <s:submit/>
       
</s:form> 
</body>
</html>
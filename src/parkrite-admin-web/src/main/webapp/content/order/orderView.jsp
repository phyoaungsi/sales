<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create New Order</title>

<script>

$( document ).ready(function() {
	var tableData=<s:property  escapeHtml="false" value="jsonString" /> ;
	
    console.log( "ready!" );
	$('#selectedProduct').tabulator({
    height:"311px",
	data:tableData, //set initial table data
    columns:[
        {title:"Sr.", field:"serial"},
        {title:"Stock Id", field:"id",visible:"false"},
        {title:"Stock Name", field:"name", sorter:"number"},
       
        {title:"Unit Price", field:"price"},
        {title:"Quantity", field:"qty"},
        {title:"Total Price", field:"total", align:"center"},
		],
	});


	
	

	
});



var selected = [];

function removeRow(id)
{
	$('#'+id).remove();
	
}
var counter=0;

</script>
</head>
<body>

<s:form action="createOrder">
<tr>
<td> <label> Buyer</label></td>
 <td> <s:property value="model.selectedUser" /></td>
 </tr>
 <s:hidden name="model.id" />
   <s:textfield  name="model.invRef" label="Invoice No" />
  
   <s:textfield name="model.buyer" label="Name" />

   <s:textfield name="model.address"  label ="address"/> 
   <s:textfield name="model.total"  label ="Grand Total"/>
   <s:textfield name="model.discount"  label ="discount"/>
    <s:textfield name="model.deliverDate"  label ="Date of Delivery"/>
    
     <s:textfield name="model.orderStatus"  label ="Order Status"/>
     <s:textfield name="model.paymentStatus"  label ="Payment Status"/>
      <s:textfield name="model.paymentType"  label ="Payment Type"/>
    
    <s:textfield name="model.remarks"  label ="Remarks"/>
<tr><td >
</td></tr>
  <s:submit/>
       
</s:form> 
<div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title">Panel title</h3>
  </div>
  <div class="panel-body">
<div id="selectedProduct"> </div>


</div>
</div>
<script>

</script>


</body>
</html>
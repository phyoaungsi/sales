<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Stock</title>
</head>
<body>
<script>
var sgd_rate=0;
$(document).ready(function () {
    $('#createcarpark_model_price').change(function () {
    	
    	var numb =sgd_rate*$('#createcarpark_model_price').val() 
    	numb=numb.toFixed(2);
    	$('#createcarpark_model_priceLocal').val(numb);
    });
    
 $('#createcarpark_model_deliveryPrice').change(function () {
    	
    	var numb =sgd_rate*$('#createcarpark_model_deliveryPrice').val() 
    	numb=numb.toFixed(2);
    	$('#createcarpark_model_deliveryPriceLocal').val(numb);
    });
 
 $('#getcontent').click(function (event) {
	 event.preventDefault();
 	var href=$('#createcarpark_model_weblink').val() ;
 	$.ajax({
 	   url:href,
 	   type:'GET',
 	   success: function(data){
 		   alert(data);
 	       $('#prod').html($(data).html());
 	   }
 	});
 	
 });
 $( "#createcarpark_model_size" ).autocomplete({
     source: sizeList
   });
 var colorList = [
                  "BLACK","WHITE","CYAN","BLUE","YELLOW","PINK","RED","GRAY","SILVER","GOLD","ORANGE","MAGNETA","VIOLET","SKY BLUE","DARK BLUE","WHITE GRAY","MILK WHITE"
                     ];
 $( "#createcarpark_model_color" ).autocomplete({
     source: colorList
   });
    $.getJSON( "http://free.currencyconverterapi.com/api/v5/convert?q=SGD_MMK&compact=y", function( data ) {
  	  var items = [];
        
         sgd_rate=data.SGD_MMK.val;
         
  	});
});



</script>
<s:form action="createcarpark">


 <s:hidden name="model.id" />
   <s:textfield  name="model.productId" label="Product ID" />
   <s:textfield name="model.name" label="Name" />
   <s:textarea name="model.description" cols="50" rows="5" label ="Product Description"/>
   <s:textfield name="model.weblink"  label ="web site link"/> <td><button id="getcontent">Get Content</button></td>
   <s:textfield name="model.price"  label ="Buy Price"/>
   <s:textfield name="model.priceLocal"  label ="Buy Price (MMK)"/>
   <s:textfield name="model.quantity"  label ="In-Stock Quantity"/>
  <s:textfield name="model.sellPriceLocal"  label ="Sell Price (MMK)"/>
      <s:textfield name="model.deliveryPrice"  label ="Transportation Charges"/>
   <s:textfield name="model.deliveryPriceLocal"  label ="Transportation Charges(MMK)"/>

   <s:textfield name="model.color"  label ="Color"/>
   <s:textfield name="model.size"  label ="Size"/>
   <s:textfield name="model.weight"  label ="Weight"/>
    <s:textfield name="model.remarks"  label ="Remarks"/>

  <s:submit/>
       
</s:form> 
<div id="prod" ></</div>
</body>
</html>
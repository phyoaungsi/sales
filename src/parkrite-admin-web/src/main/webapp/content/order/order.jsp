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
	
	var tableData = [
   
]
    console.log( "ready!" );
	$('#selectedProduct').tabulator({
    height:"311px",
	data:tableData, //set initial table data
    columns:[
        {title:"Sr.", field:"serial"},
        {title:"Stock Id", field:"id",visible:"false"},
        {title:"Stock Name", field:"name", sorter:"number"},
       
        {title:"Unit Price", field:"price"},
        {title:"Quantity", field:"qty", editor:"input"},
        {title:"Total Price", field:"total", align:"center", bottomCalc:"sum"},
		],

		
		cellEdited:function(cell){
	        //data - the updated table data
			 // alert(cell.getValue());
	         var row= cell.getRow();
	        var price= row.getData().price;
	        var quantity=cell.getValue();
	        var total_=price*quantity;
             row.update({"total": total_});
	          $("#selectedProduct").tabulator("setData");
	          $("#selectedProduct").tabulator("setSort", "id", "asc");
	      	$("#createOrder_model_total").val(results.bottom.total+tmp.total);
	    },
	    
		rowAdded:function(row){
	        //row - row component
	        console.log(row.getData());
	        
			$.ajax({
			    url: "<s:url namespace='/ajax' action='editStockAction' />",
			    data: '{"data":['+JSON.stringify(row.getData())+']}',
			    dataType: 'json',
			    contentType: 'application/json',
			    type: 'POST',
			    async: true,
			    success: function (res) {
			        console.log(res.data.length);
			        for (var i = 0; i < res.data.length; i++) {
			            console.log(" " + res.data[i].name + "-" + res.data[i].id + "-" + res.data[i].active + "-    " + res.data[i].date);
			        }
			    }
			});
			var tmp=row.getData();
			
			var results = $("#selectedProduct").tabulator("getCalcResults");
			var total=results.bottom.total+tmp.total;
			$("#createOrder_model_total").val(results.bottom.total+tmp.total);
	    },
	});


	
	
	$("#selectedProduct").tabulator({
	    cellEdited:function(cell){
	        //data - the updated table data
	        alert("hello");
	    },
	});
	

	
});



var selected = [];

function removeRow(id)
{
	$('#'+id).remove();
	
}
var counter=0;
function saveChange()
{

	    counter=0;
		$('table#stockList input[type=checkbox]').each(function() {
	   if ($(this).is(":checked")) {
	       selected.push($(this).attr('value'));
	       var jsonstr=$(this).attr('value');
	       
	       obj=JSON.parse(jsonstr);
	       counter++;
	   //    $('#productSelection').append('<tr id="stock'+counter+'"><td>'+counter+'</td><td>'+obj.name+'</td><td>'+obj.price+'</td><td><input type=text name=model.quantity.'+counter+' /></td><td onclick="removeRow(\'stock'+counter+'\')">Remove</td></tr>')
	   totalPrice=1*obj.price;   
	   $('#selectedProduct').tabulator("addRow", {id:counter, name:obj.name, qty:"1", price:obj.price, total:totalPrice});
	   }
	});
	
	
	//  $('#selectedProduct').tabulator("addRow", {id:2, name:"Jonanthan", qty:"1", price:"23", total:12});
}
$( "#saveChange" ).click(function() {
	
	$('table#stockList input[type=checkbox]').each(function() {
	   if ($(this).is(":checked")) {
	       selected.push($(this).attr('value'));
	       var json=$(this).attr('value');
	       alert(json);
	   }
	});
	});
</script>
  <script type="text/javascript">
            $(function () {
                $('#createOrder_model_deliverDate').datepicker();
            });
        </script>
</head>
<body>

<s:form action="createOrder">

 <s:select cssClass="form-control" label="Buyer"
		
		list="selectUsers" 
		name="model.selectedUser" />
 <s:hidden name="model.id" />
   <s:textfield  name="model.invRef" label="Invoice No" />
   <s:textfield name="model.buyer" label="Name" />
   <s:textfield name="model.address"  label ="address"/> 
   <s:textfield name="model.total"  label ="Grand Total"/>
   <s:textfield name="model.discount"  label ="discount"/>
   <s:textfield name="model.deliverDate"  label ="Date of Delivery"/>
   <s:select cssClass="form-control" label="Order Status" list="orderStatusList" name="model.orderStatus" />
   <s:select cssClass="form-control" label="Payment Status" list="paymentStatusList" name="model.paymentStatus" />
   <s:select cssClass="form-control" label="Payment Type" list="paymentTypeList" name="model.paymentType" />
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
<div  id="selectedProduct"> </div>


</div>
</div>
<script>

</script>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalLong">
  Launch demo modal
</button>
<!-- Modal -->
<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
<table class="table" id="stockList">
<s:iterator value="stocks" id="stock" status="comboMealsStatus">
  <tr>
  
      <td><s:property value="#stock.name"/></td> <td><s:property value="#stock.price"/></td><td><input type="checkbox" name="buying" value='{"name":"<s:property value="#stock.name"/>" ,"price":"<s:property value="#stock.price"/>"}'> </td>

  </tr>
</s:iterator>
</table>
 </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" id="saveChange" data-dismiss="modal" onClick="saveChange()" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>
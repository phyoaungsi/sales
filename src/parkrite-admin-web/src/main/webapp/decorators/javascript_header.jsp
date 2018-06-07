<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<s:url id="news" action="news" namespace="/news" />
<script>

$(function() {

		$( "input[type=submit],button" )

			.addClass('btn btn-success')

			.click(function( event ) {

				//event.preventDefault();

			});
		$( "input[type=text],input[type=password]" ).addClass('form-control');
		$( "form" ).addClass('form-horizontal');
		$( "label" ).addClass('col-lg-2 control-label');
		$( "#homebtn" )

			.click(function( event ) {

				event.preventDefault();
				
				window.location.href="<s:url action="welcome" namespace="/welcome"/>";

			});

		$("#topsearch").button({

			icons: {

				primary: "ui-icon-search"

			}	

		}).click(function( event ) {

				//event.preventDefault();
$('#searchfrm').submit();
			});
		
		
		
				var listItems = $("#errorTmp li");
				listItems.each(function(idx, li) {
				    var product = $(li);
		            var message=product.text();
				    // and the rest of your code
				    var dom='<div class="alert bg-danger" role="alert"><em class="fa fa-minus-circle mr-2"></em>'+
								message+' <a href="#" class="float-right"><em class="fa fa-remove"></em></a></div>';
				    $("#errorPlaceHolder").append(dom);
				});
				
				
				    var listItems = $("#msgTmp li");
					listItems.each(function(idx, li) {
					    var product = $(li);
			            var message=product.text();
					    // and the rest of your code
					    var dom='<div class="alert bg-success" role="alert"><em class="fa fa-check-circle mr-2"></em> '+
									message+' <a href="#" class="float-right"><em class="fa fa-remove"></em></a></div>';
					    $("#msgPlaceHolder").append(dom);
					});

	});


		
var sizeList = [
                "XXS","XS","S","M","L","XL","XXL","1","2","3","4","5","6","7","8","9","10"
                   ];

</script>
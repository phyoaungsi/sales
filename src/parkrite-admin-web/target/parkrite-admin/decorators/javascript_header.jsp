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

	});



</script>
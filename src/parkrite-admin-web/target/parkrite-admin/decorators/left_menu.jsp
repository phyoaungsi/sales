<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div id="leftmenu" style="width:160px;position:absolute;left:5px;">
<s:url id="news" action="news" namespace="/news" />
<script>

$(function() {
	$( "#menu" ).menu();
});

// grab the initial top offset of the navigation 
	var sticky_navigation_offset_top = $('#leftmenu').offset().top+40;

	//var sticky_navigation_offset_top = 200;
	// our function that decides weather the navigation bar should have "fixed" css position or not.
	var sticky_navigation = function(){
		var scroll_top = $(document).scrollTop(); // our current vertical position from the top
                   if(scroll_top==0)
                    {scroll_top=document.body.scrollTop;}

		//alert(scroll_top);
		// if we've scrolled more than the navigation, change its position to fixed to stick to top, otherwise change it back to relative
		if (scroll_top > sticky_navigation_offset_top) { 

			$('#leftmenu').css({ 'position': 'fixed', 'top':0 });
		} else {

			$('#leftmenu').css({ 'position': 'absolute','top':100 }); 
		}   
	};
	
	// run our function on load
	sticky_navigation();
	
	// and run it again every time you scroll
	$(window).scroll(function() {

		 sticky_navigation();
	});
	
	
		
		
		
	
</script>


</div>
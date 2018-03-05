<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%

response.setHeader("Access-Control-Allow-Origin","*");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><decorator:title></decorator:title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Access-Control-Allow-Origin" content="*" />
	<s:include value="common_head.jsp" />
	<s:include value="javascript_header.jsp" />
	  

  <decorator:head></decorator:head>
</head>
<body>
<div style="width:100%;height:50px;background:black;color:white;font-size:15pt;text-align:center;vertial-align:middle">

<b>Parkrite Parking Reservation System</b> 

</div>welcome
Login as <s:property value="loginUserId"/>
<br/>


<s:include value="left_menu.jsp"/>

  <script>
    $(function() {
    
    	$('submit').button();
    
     $("#clipwraplistright").hover(
			function () {
			//alert('over');
			var i=$("#map-video").height();
			//alert(i);
			if(i > 300){
			$("#clipwraplistright").css('overflow-y','scroll');
			}
			},
			function () {
			//alert('flow');
			$("#clipwraplistright").css('overflow','hidden');
			}
		);
		
		
      $('#slides').slidesjs({
        width: 940,
        height: 348,
        callback: {
          loaded: function(number) {
            // Use your browser console to view log
           // console.log('SlidesJS: Loaded with slide #' + number);

            // Show start slide in log
            $('#slidesjs-log .slidesjs-slide-number').text(number);
          },
          start: function(number) {
            // Use your browser console to view log
           // console.log('SlidesJS: Start Animation on slide #' + number);
          },
          complete: function(number) {
            // Use your browser console to view log
           // console.log('SlidesJS: Animation Complete. Current slide is #' + number);

            // Change slide number on animation complete
            $('#slidesjs-log .slidesjs-slide-number').text(number);
          }
        }
      });
    });
   
  </script>

  <div id="ambientimage" style="opacity:0;position:absolute;width:90%;height:80%;z-index:-1;background-size:100%;background-image:url('');background-repeat:no-repeat;background-position:center"></div>
  


<div id="container" >
<div id="header">


</div>

<div id="conent">
<div class="right_col">
<div id="clipwraplistright" style="width:350px;height:500px;overflow:hidden"><div id=map-video class='clip-container-right thumbnail-panel'>
<script>
setInterval(listenlist,1000);

function listenlist(){

var len=$('#map-video-list > li').size();

if(len>0)
{
   $('#imgloading').hide();

}
}


</script>
<ul id="map-vid"src/main/webapp/decorators/welcome.jsp"eo-list"></ul></div></div>
<!--
<div style="margin-top:0px;background:red;position:relative" class="db2">
<div class="bd2_top" style="margin-top:0px;background:green" >
<div class="bd2_top_content">&nbsp;</div>
</div>

<div class="db2_content">
<h3 class="ui-state-default ui-corner-top" style=""> Latest Movies</h3>
<div class="db2_content_container">

<br>
<br>
Latest movie<br>
list </div>
</div>
<div class="bd2_bot">
<div class="bd2_bot_content">&nbsp;</div>
</div>
</div> -->

</div>

<div class="left_col">
<div class="db1" style="width:700px;height:100%">
<div class="db1_title" >
<h3><decorator:title/></h3>
</div>
<div class="db1_content">
<div class="db1_container">


<decorator:body />




</div>
</div>
</div>
</div>
<div id="footer" >
<div id="copyright">  </div>
<div id="designby"></div>
<div id="bottom_menu"> </div>
</div>
</div>
</div>


<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-41478730-1', 'whereismyanmar.net');
  ga('send', 'pageview');

</script>
<div align=center></a></div></body>

</html>
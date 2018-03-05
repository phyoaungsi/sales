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
<link rel="stylesheet" type="text/css" href="<s:url value="/css/style.css"/>" />
<link rel="stylesheet" href="<s:url value="/css/eggplant/jquery-ui-1.10.3.custom.min.css"/>" />



<script src="<s:url value="/js/jquery-1.9.1.min.js"/>"></script>
	<script src="<s:url value="/js/jquery.ui.core.js"/>"></script>
	<script src="<s:url value="/js/jquery.ui.widget.js"/>"></script>
	<script src="<s:url value="/js/jquery.ui.button.js"/>"></script>
	<script src="<s:url value="/js/jquery.slides.min.js"/>"></script>
	<script src="<s:url value="/js/jquery.ui.menu.min.js"/>"></script>
       <script src="<s:url value="/js/json2.js"/>"></script>
<script src="<s:url value="/js/jquery.cookie.js"/>"></script>
	<s:include value="javascript_header.jsp" />
	  <style>
 
    #slides {
      display: none
    }

    #slides .slidesjs-navigation {
      margin-top:3px;
    }

    #slides .slidesjs-previous {
      margin-right: 5px;
      float: left;
    }

    #slides .slidesjs-next {
      margin-right: 5px;
      float: left;
    }

    .slidesjs-pagination {
      margin: 6px 0 0;
      float: right;
      list-style: none;
    }

    .slidesjs-pagination li {
      float: left;
      margin: 0 1px;
    }

    .slidesjs-pagination li a {
      display: block;
      width: 13px;
      height: 0;
      padding-top: 13px;
      background-image: url(../css/slidejs/img/pagination.png);
      background-position: 0 0;
      float: left;
      overflow: hidden;
    }

    .slidesjs-pagination li a.active,
    .slidesjs-pagination li a:hover.active {
      background-position: 0 -13px
    }

    .slidesjs-pagination li a:hover {
      background-position: 0 -26px
    }

    #slides a:link,
    #slides a:visited {
      color: #333
    }

    #slides a:hover,
    #slides a:active {
      color: #9e2020
    }

    .navbar {
      overflow: hidden
    }
  </style>
<style>
    #slides {
      display: none
    }

    .container {
      margin: 0 auto
    }

    /* For tablets & smart phones */
    @media (max-width: 767px) {
      body {
        padding-left: 20px;
        padding-right: 20px;
      }
      .container {
        width: auto
      }
    }

    /* For smartphones */
    @media (max-width: 480px) {
      .container {
        width: auto
      }
    }

    /* For smaller displays like laptops */
    @media (min-width: 768px) and (max-width: 979px) {
      .container {
        width: 724px
      }
    }

    /* For larger displays */
    @media (min-width: 1200px) {
      .container {
        width: 1170px
      }
    }
.slider_container{

background-image:url('../images/Jewellery_Market,_Yangon,_Myanmar.jpg');
background-repeat:no;;
background-size:100% 100%


}

  </style>
  <decorator:head></decorator:head>
</head>
<body  background="http://www.whereismyanmar.net/gomovie/images/umbrella.jpg">


<br/>


<s:include value="left_menu.jsp"/>

<!--
<div style="width:100%;text-align:center;padding:5px" class="slider_container">
  <div class="container" style="width:700px;height:300px;background:white;padding:5px">
    <div id="slides">
     <div> <table> <tr>
     
     <td><img src="../images/demo/1b.jpg" alt="Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/"/>
     </td>
     
     <td>

     <img height=90 width=150  src="../images/demo/p1.jpg" ></img><br/>
   
     <img  height=90 width=150 src="../images/demo/p3.jpg" ></img><br/>
     <img height=90 width=150 src="../images/demo/p4.jpg" ></img><br/>
      </td>
     </tr></table>
     
     </div>
      <img width=700px height=300px src="../images/demo/1a.jpg" alt="Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/"/>
      <img  width=700px height=300px src="../images/demo/2.jpg" alt="Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/"/>
      <img  width=700px height=300px src="../images/demo/3.jpg" alt="Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/"/>
      <img  width=700px height=300px src="../images/demo/4.jpg" alt="Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/"/>
     <a href="#" class="slidesjs-previous slidesjs-navigation"><i class="icon-chevron-left icon-large"></i></a>
      <a href="#" class="slidesjs-next slidesjs-navigation"><i class="icon-chevron-right icon-large"></i></a>
    </div>
    <div id="slidesjs-log" >Slide <span class="slidesjs-slide-number">1</span> of 4</div>
  </div>
</div>
-->
  <script>
    $(function() {
    
    
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
<div id="clipwraplistright" style="width:650px;height:500px;overflow:hidden"><div id=map-video class='clip-container-right thumbnail-panel'>
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
<img id="imgloading1" style="margin-left:50px" src="<s:url value="/images/378.gif"/>" /><ul id="map-video-list"></ul></div></div>
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
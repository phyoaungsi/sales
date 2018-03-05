<?xml version="1.0" encoding="UTF-8" ?>



<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<title><decorator:title></decorator:title></title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
"src/main/webapp/decorators/main.jsp"
<link rel="stylesheet" type="text/css" href="<s:url value="/css/style.css"/>" />

<link rel="stylesheet" href="<s:url value="/css/themes/le-frog/jquery.ui.all.css"/>" />

       <script src="<s:url value="/js/json2.js"/>"></script>
<script src="<s:url value="/js/jquery-1.9.1.min.js"/>"></script>
<script src="<s:url value="/js/jquery-ui-1.9.2.custom.js"/>"></script>

	<s:include value="javascript_header.jsp"/>

<decorator:head></decorator:head>

</head>

<body>
<s:form id="searchfrm" action="/search/search.do" namespace="/" method="post">
<s:include value="search_bar.jsp"/>
</s:form>
<br>
<br/>

<s:include value="left_menu.jsp"/>


<div id="container" >

<div id="header">





</div>



<div id="conent">

<div class="right_col">


</div>





</div>

<div class="left_col">

<div class="db1" style="width:700px">

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

<div id="copyright"> whereismyanmar.net </div>

<div id="designby">admin@whereismyanmar.net</a></div>

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
<div align=center>whiereismyanmar.net <a href='http://www.mmdrama.com/'>2013</a></div></body>



</html>
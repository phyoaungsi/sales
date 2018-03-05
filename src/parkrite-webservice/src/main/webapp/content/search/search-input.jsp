<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="s" uri="/struts-tags" %>

   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<script type="text/javascript" src="http://quest.whereismyanmar.net/js/search.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script language="javascript" type="text/javascript">
$(document).ready(function(){

search('<s:property value="keyword"/>');

$('#topsearch').unbind('click');

$('#topsearch').click(function(event){
event.preventDefault();

search($('#masthead-search-term').val());
}) 

});



</script>
<title>Search results for :<s:property value="keyword"/></title>

</head>

<body>

<div class="clip-container">
<s:if test="%{keyword != null}">
<img id="loading" src="<s:url value="/images/ajax-loader.gif"/>" />

</s:if>
<ul>
<s:iterator value="movies" status="rowstatus">
   <s:url id="testUrlId" namespace="/display" action="showmovie">
                  <s:param name="id" value="%{uuid}"></s:param>           
      </s:url>
  <s:url id="image.url" action="download" namespace="/">
      <s:param name="fileName" value="%{thumbnail}"/>
      </s:url>

  <li class="clip-result">

      
<div id="thumbnail"> <img width=140px height=84px src="http://www-01.ibm.whereismyanmar.net/images/<s:property value="thumbnail" />" /></div>
      <div class="" style="width:150px;text-transform: capitalize; text-shadow: -2px 2px 3px;">             
      <s:a href="%{testUrlId}">
      &nbsp;<s:property value="title"/>
     
      </s:a>
      </div>
      
       <div id="description"><%-- <div class="desc-item"><s:property value="description"/></div> --%>
       <a href="<%=request.getContextPath() %>/viewmap.htm?|<s:property value="map.lattitude"/>|<s:property value="map.longitude"/>|<s:property value="map.zoomLevel"/>"><img src="<%=request.getContextPath() %>/images/04_maps.png" width="30px" height="30px"/></a>
       </div>
  
  </li>
</s:iterator>

</ul>

</div>


</body>

</html>
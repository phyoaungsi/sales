<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

   

        <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
<script src="<s:url value="/js/googlemap/ui.googlemap.js"/>"></script>

<title><s:property value="movie.title" escape="true" /></title>
<script>
$(document).ready(function(){

$('#mapdiv').videomap({lat:<s:property value="movie.map.lattitude"/>,lng:<s:property value="movie.map.longitude"/>});
 //$('#mapdiv').slideToggle(0, function() {
// Animation complete.
//});


});
</script>
 <style>
#mapdiv{

height: 300px;
background: #ccc;
border: 1px solid #000;
}
</style>
</head>

<body>

<div>

<s:property value="movie.embed" escape="false" />

</div>
<div style="height:50px;width:100%;visible:block">
<div style="float:left;width:200px">

</div>
<div style="float:left;width:200px">
<a href="http://www.youtube.com/watch?v=<s:property value="movie.thumbnail"/>" >View on youtube </a>
</div>
</div>
<div id="mapdiv" style="width:100%">


</div>




<table>

<s:iterator value="nearByMoives" status="rowstatus">

   <s:url id="testUrlId" namespace="/display" action="showmovie">

                  <s:param name="id" value="%{uuid}"></s:param>           

      </s:url>

  <s:url id="image.url" action="download" namespace="/">

      <s:param name="fileName" value="%{thumbnail}"/>

      </s:url>

  <tr class="movieresult">

   

      <td class="movieitem">

      <div class="" style="width:100%;text-transform: capitalize; text-shadow: -2px 2px 3px;">             

      <s:a href="%{testUrlId}">

      &nbsp;<s:property value="title"/>

     

      </s:a>

      </div>

      <div id="thumbnail" style="width:90%"> <img align="left" style="margin:4px" width=320px height=180px src="http://www-01.ibm.whereismyanmar.net/images/<s:property value="thumbnail" />" /><s:property value="description"/></div>

       <div id="description">

     

       </div>

       </td>

   

  </tr>

</s:iterator>

</table>

</body>

</html>
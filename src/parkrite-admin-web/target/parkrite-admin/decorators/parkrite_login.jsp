<?xml version="1.0" encoding="UTF-8" ?>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> -->


<!DOCTYPE html>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%response.setHeader("Access-Control-Allow-Origin","*");%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

   <title><decorator:title></decorator:title></title>
  
	<s:include value="common_head.jsp" />
	<s:include value="javascript_header.jsp" />
	  
    <!-- Bootstrap core CSS -->
    <link href="<s:url value="/css/bootstrap.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<s:url value="/css/signin.css"/>" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="<s:url value="/js/ie8-responsive-file-warning.js"/>"></script><![endif]-->
    <script src="<s:url value="/js/ie-emulation-modes-warning.js"/>"></script>

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="<s:url value="/js/ie10-viewport-bug-workaround.js"/>"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"/>"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"/>"></script>
    <![endif]-->
  </head>

  <body>

   <div class="container">
           <decorator:body></decorator:body>
          </div>

         

        </div>

      </div>

    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="<s:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<s:url value="/js/docs.min.js"/>"></script>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Car Park Owner </title>
</head>
<body>
<s:form class="form-horizontal" action="carparkcreateform" >
	<s:select label="Search By"
       name="searchBy"
       headerValue="Select One"
       list="#{'01':'Parkrite Merchant ID', '02':'Company Name'}"
       value="02"
       required="true"/>
	   		<s:textfield name="keyword" label="Keyword" />
	   		<s:submit value="Search"/>
	  </s:form>
  			<br/>
  			

  <display:table class="table table-striped table-hover " export="false"  id="data"
                    name="cpolist" decorator="sg.edu.nus.iss.pmprs.web.tabledecorator.PmprsTableDecorator">
  <display:column property="parkritemerchantidforcarpark" title="Parkite Merchant ID" sortable="false"   />
  <display:column property="companyname" title="Company Name" sortable="false"  />
  <display:column property="name" title="CPO Name" sortable="false"   />
 </display:table>

</body>
</html>
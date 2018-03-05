<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search User</title>
</head>
<body>
<s:form class="form-horizontal" action="searchuserform" >
 
 	<s:select label="Search By"
       name="searchBy"
       headerValue="Select One"
       list="#{'01':'User Id', '02':'User Name', '03':'NRIC'}"
       required="true"/>
	   		<s:textfield name="keyword" label="Keywoard" />
	   		<s:submit value="Search" name="search"/>
	   		</s:form>
  			<br/>
  			
  			<display:table class="table table-striped table-hover " export="false"  id="data"
                    name="users" decorator="sg.edu.nus.iss.pmprs.web.tabledecorator.PmprsTableDecorator">
            <display:column property="userIdLink" title="User ID" sortable="false"   />
            <display:column property="name" title="User Name" sortable="false"   />
            <display:column property="gender" title="Gender" sortable="false"  />
           
            <display:column property="nric" title="NRIC"
                    sortable="false"  />
            <!--<display:column property="status" title="Status" sortable="false"  />-->
                    
        </display:table>

</body>
</html>
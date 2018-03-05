<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Member Creation</title>
</head>
<body>
  <display:table class="table table-striped table-hover " export="false"  id="data"
                    name="members" decorator="sg.edu.nus.iss.pmprs.web.tabledecorator.PmprsTableDecorator">
                    
            <display:column property="memberIdLink" title="Member ID" sortable="false"   />
            <display:column property="name" title="Member Name" sortable="false"   />
            <display:column property="gender" title="Gender" sortable="false"  />
           
            <display:column property="nric" title="NRIC"
                    sortable="false"  />
            <display:column property="status" title="Status" sortable="false"  />
                    
        </display:table>

</body>
</html>
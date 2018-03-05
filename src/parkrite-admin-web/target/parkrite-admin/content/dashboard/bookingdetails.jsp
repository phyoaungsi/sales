<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://displaytag.sf.net" prefix="display" %>
        <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
  <display:table class="table table-striped table-hover " export="false"  id="data"
                    name="list" decorator="sg.edu.nus.iss.pmprs.web.tabledecorator.PmprsTableDecorator">
            <display:column property="vehicleNumber" title="Vehicle Number" sortable="false"   />
            <display:column property="bookingRefNumber" title="Booking Reference Number" sortable="false"   />
            <display:column property="bookingDate" title="Date" sortable="false"   />
            <display:column property="bookedFromTime" title="From" sortable="false"  />
           
            <display:column property="bookedToTime" title="To"
                    sortable="false"  />
                            
        </display:table>
</body>
</html>
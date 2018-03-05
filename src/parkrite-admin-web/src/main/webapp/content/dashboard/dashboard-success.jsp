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
            <display:column property="carparkId" title="Carpark ID" sortable="false"   />
            <display:column property="companyName" title="Company Name" sortable="false"   />
            <display:column property="carparkName" title="Carpark Name" sortable="false"  />
           
            <display:column property="totalSlot" title="Total Slot"
                    sortable="false"  />
            <display:column property="occupiedSlot" title="Occupancy" sortable="false"  />
            
            <display:column property="availableSlot" title="Available" sortable="false"  />
            <display:column property="noOfBookToday" title="No of Booked Today"
                    sortable="false"  />
            <display:column property="currentBooking" title="Current Bookings" sortable="false"  />
             <display:column property="dashboardDetail" title="Details" sortable="false"  />
                    
        </display:table>
       
</body>
</html>
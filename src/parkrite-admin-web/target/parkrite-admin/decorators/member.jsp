<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

 <ul class="nav nav-sidebar">
            <li class="active"><s:a  namespace="/member" action="createMemberForm">Create Member </s:a></li>
            <li> <s:a  namespace="/member" action="searchmemberform">Maintain Member </s:a></li>
            <li><s:a  namespace="/member" action="searchmemberform">Search Member </s:a></li>        
          </ul>
        

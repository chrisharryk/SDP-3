<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<spring:url value="./styles/index.css" var="indCss" />
<link href="${indCss}" rel="stylesheet" />
<title>Home Page</title>
</head>
<body>
<center><h2 class="heading">Welcome..</h2></center>
<h3>select user type</h3>

<input type="button" value="Profile"  onclick="window.location='cmpprof.jsp'" />
<input type="button" value="jobs" onclick="window.location='addjob.jsp'"/>
Username : 
<h2 style="color:white"><span>${loggedInUser_userName}</span></h2>

<a href="${pageContext.servletContext.contextPath}/logout" style="color:gold">Logout</a>
</body>
</html>
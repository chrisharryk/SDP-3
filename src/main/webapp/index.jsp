<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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

<input type="button" value="Student"  onclick="window.location='stdlgn.jsp'" />
<input type="submit" value="Company" onclick="window.location='cmplgn.jsp'"/>
<h2>ello</h2>
</body>
</html>
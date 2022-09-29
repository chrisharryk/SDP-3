<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addjob">

Username :<input type="text" value="${loggedInUser_userName}" name="postuser" disabled="disabled"/></br>
Location<input type ="text" placeholder="location" name="location"/>
Description<input type ="text" placeholder="description" name="description"/>
Qualification<input type ="text" placeholder="qualification" name="qualification"/>
Responsibilities<input type ="text" placeholder="responsibilities" name="responsibilities"/>


<input type="submit" value="Add">


</form>
</body>
</html>
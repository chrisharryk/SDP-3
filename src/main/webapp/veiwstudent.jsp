<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h1 {
   border: 5px solid black;
  margin: 2%;
  padding: 10%;
  color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>veiw students</title>
</head>
<body>
<h1 >Veiw Students</h1>
<%@ page import="com.mrs.code.Main" %>
<%@ page import="java.util.List" %>
<%@ page import="com.mrs.pojo.Student" %>
<%
Main m=new Main();

List<Student> l=(List)m.getAllstudents();

%>
<table>
  <tr>
    <th>ID</th>
    
    
  </tr>

<% for(Student p: l){ %>
  <tr>
    <td><%=p.getCollegeID() %></td>
  </tr>
<%  } %>
</table>


</body>
</html>
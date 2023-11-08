<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>View Customers Details</h1>
<h2>Details as Submitted as follows:</h2>
<%-- <h4>Customer ID : ${cid}</h4>
<h4>Customer Name : ${cname}</h4>
<h4>Customer Email : ${cemail}</h4> --%>
<form action="getdetails" method="post">
Search for <input type="number" name="cid">
<input type="submit" value="Submit">
 </form>
</body>
</html>
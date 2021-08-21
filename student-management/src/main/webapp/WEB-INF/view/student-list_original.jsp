<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyApp</title>
</head>
<body>
	<h1 align="center">My Application</h1>
	<div align="center">
	<form action="showAddStudentPage">
	
	<input type="submit" value="Add">
	</form>

		<table border="1">
			<thead>
				<tr>
					<td>ID</td>
					<td>NAME</td>
					<td>MOBILE</td>
					<td>COUNTRY</td>
				</tr>
			</thead>
			<tr>
				<!-- Model Attribute :students -->
				<c:forEach var="student" items="${students}">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.mobile}</td>
						<td>${student.country}</td>
					</tr>
					<br />
				</c:forEach>
		</table>
	</div>
</body>
</html>
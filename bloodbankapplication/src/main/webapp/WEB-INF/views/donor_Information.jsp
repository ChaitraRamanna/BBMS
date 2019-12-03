<%@page import="com.bloodbankapplication.model.DonorDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Donor Home</title>
<style>
table {
	margin-left: 10%;
	margin-right: 10%;
	align: center;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 15px;
}

th {
	background-color: black;
	color: white;
	text-align: left;
}

table tr:nth-child(odd) {
	background-color: grey;
}
</style>
</head>
<body>
	<h3>Welcome ${key.firstName}! </h3>
	<h4>Status: ${key.status}</h4>
<br/>
<br/>
<br/>
<br/>
	<table>
	<tr>
			<td>DonorId</td>
			<td>${key.id}</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${key.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${key.lastName}</td>
		</tr>
		<tr>
			<td>Blood Group</td>
			<td>${key.bloodGroup}</td>
		</tr>
		<tr>
			<td>Haemoglobin level</td>
			<td>${key.heamoglobin}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${key.gender}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${key.age}</td>
		</tr>
		<tr>
			<td>E-mail</td>
			<td>${key.email}</td>
		</tr>
		<tr>
			<td>Contact Number</td>
			<td>${key.contactNumber}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${key.address}</td>
		</tr>
	</table>
	<a href="./">HOME PAGE</a>
</body>
</html>
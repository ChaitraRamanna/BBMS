<%@page import="java.util.List"%>
<%@page import="com.bloodbankapplication.model.DonorDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Donors List</title>
<style type="text/css">
h2{
color:red;
text-align:center;
}
</style>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<h2>ASHA BLOOD BANK</h2>
Here we give you the details of our donors!<br>
<body>
<table class="table table-bordered table-striped">

		<th>Donor ID</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		 <th>Blood Group</th>
		 <th>Haemoglobin Level</th>
		 <th>Age</th>
		 <th>E-mail</th>
		 <th>Contact Number</th>
		 <th>Address</th>
		 
		  
<% List<DonorDetails> details = (List<DonorDetails>)request.getAttribute("donorDetails");
for(DonorDetails detail:details)
{
    %>	
		
		
			<tr>
				<td><%=detail.getId() %></td>
				<td><%=detail.getFirstName()%></td>
				<td><%=detail.getLastName()%></td>
				<td><%=detail.getGender()%></td>
				<td><%=detail.getBloodGroup()%></td>
				<td><%=detail.getHeamoglobin()%></td>
				<td><%=detail.getAge()%></td>
				<td><%=detail.getEmail()%></td>
				<td><%=detail.getContactNumber()%></td>
				<td><%=detail.getAddress()%></td>
				
<%} %>				

			</tr>
	
	</table>
	<a href="./">HOME PAGE</a>
</body>
</html>
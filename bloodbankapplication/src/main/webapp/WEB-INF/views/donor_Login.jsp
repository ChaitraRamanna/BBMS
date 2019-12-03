<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">


h1{
color:red;
text-align:center;
}

</style>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>
<form action="./signIn" method="post">
<h1>ASHA BLOOD BANK</h1>
	<table class="table table-bordered table-striped">
		<tr>
			<td>Enter your id</td>

			<td><input type="text" name="id" required></td>
		</tr>

		<tr>
			<td>Enter your password</td>

			<td><input type="password" name="password" required></td>

		</tr>
	</table>
	<input type = "submit" value = "Login">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
<style type="text/css">
h1{
color:red;
text-align:center;
}
h3{
color:blue;
text-align:center;
}
</style>
</head>
<body>
<h1>ASHA BLOOD BANK</h1>
<h3>Thank you for choosing our Blood Bank</h3>
<form action="./requestsignIn" method="post">
	<table>
		<tr>
			<td>Enter your id</td>

			<td><input type="text" name="id" required="required"></td>
		</tr>

		<tr>
			<td>Enter your password</td>

			<td><input type="password" name="password" required="required"></td>

		</tr>
	</table>
	<input type = "submit" value = "Login">
	</form>
</body>
</html>
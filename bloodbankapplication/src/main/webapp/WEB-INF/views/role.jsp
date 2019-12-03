<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ASHA BLOOD BANK</title>
<style type="text/css">
h1{
color:red;
text-align:center;
}
h3{
color:green;
text-align:center;
}

</style>
</head>
<body>
	<form action="./roleSubmit" method="post">
		<h1>ASHA BLOOD BANK</h1>
		<h3>SELECT THE ROLE</h3>
		<br>
		<table>
			<tr>
				<td>Select role</td>

				<td><select name="role">

						<option value="donor">Donor</option>

						<option value="requestor">Requestor</option>
						


				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>

				<td></td>
				<td></td>
				<td><input type="reset" value="reset"></td>
			</tr>
		</table>
		</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
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
	<h1>ASHA BLOOD BANK</h1>
	<form action="./registrationsubmit" method="post">

		<table class="table table-bordered table-striped">



			<tr>
				<td>Enter first name</td>

				<td><input type="text" name="firstName" required></td>
			</tr>
			<tr>
				<td>Enter last name</td>

				<td><input type="text" name="lastName" required></td>
			</tr>

			<tr>
				<td>Enter password</td>

				<td><input type="password" name="password" required></td>

			</tr>
			<tr>
				<td>Enter your age</td>

				<td><input type="text" name="age" required></td>
			</tr>

			<tr>
				<td>Enter address</td>

				<td><input type="text" name="address" required></td>
			</tr>
			<tr>
				<td>Contact number</td>

				<td><input type="text" name="contactNumber" required></td>
			</tr>
			<tr>
				<td>Gender</td>

				<td><input type="radio" name="gender" value="male"> Male</td>
				<td><input type="radio" name="gender" value="female"> Female</td>

			</tr>
			<tr>
				<td>Enter email</td>

				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Enter blood group</td>

				<td><input type="text" name="bloodGroup" required></td>
			</tr>
			<tr>
				<td>Select role</td>

				<td><select name="role">

						<option value="donor">Donor</option>

						<option value="requestor">Requestor</option>


				</select></td>
			</tr>
			<tr>
				<td>Enter haemoglobin content</td>

				<td><input type="text" name="heamoglobin" required></td>
			</tr>

			<input type="hidden" value="submitted" name="status">

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
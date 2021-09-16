<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guru Registration Form</title>

<script>
	function publishAndStore() {
		var firstName = document.getElementById('firstName').value;
		var lastName = document.getElementById('lastName').value;
		var email = document.getElementById('email').value;
		var password = document.getElementById('password').value;
		
		var about = document.getElementById('about').value;
		var birthYear = document.getElementById('birthYear').value;

		var postData = 'firstName=' + firstName;
		postData += '&lastName=' + lastName;
		postData += '&email=' + email;
		postData += '&password=' + password;

		var ajaxRequest = new XMLHttpRequest();
		ajaxRequest.open('POST', 'http://localhost:9000/users');
		ajaxRequest.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		String userId = ajaxRequest.send(postData);
	}
</script>
</head>
<body>
	<h1>Mobile Registration Form</h1>
	<form action="welcome" method="post">
		<table style="with: 50%">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName"  /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"  /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
					<td>Publish Message</td>
					<td><input type="text" name="message" /></td>
				</tr>
		</table>
		<input type="button" value="Submit" onclick="publishAndStore()" />
	</form>
</body>
</html>
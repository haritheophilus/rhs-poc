<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guru Registration Form</title>

<script type="text/javascript">
function createAlert() {
	alert("You clicked the button! "");
	}
	function publishAndStore() {
		var message = document.getElementById('message').value;
		var postData = 'message=' + message;

		var ajaxRequest = new XMLHttpRequest();
		ajaxRequest.open('POST', 'http://localhost:9001/msgserv/');
		ajaxRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		String userId = ajaxRequest.send(postData);
		alert("DB "+userId);
	}
</script>
</head>
<body>

	
	<form action="" method="post">
		<%
		if (request.getAttribute("messageId") != null) {
		%>
		<p><h1>
			<font color="blue">Persisted the message-- </font><font color="red">+ ${message} --id:  ${messageId}</font>
			<br>
			<font color="blue">And Published to Event Hub </font>
		</h1></p>
		<input type="submit" value="Clear&GoBack"/>
		<%
		} else {
		%>
		<table style="with: 50%">
		
			<tr><h1>
				<td>Publish Message</td>
				<td><input type="text" name="message" /></td>
			</h1></tr>
			<tr></tr>
		</table>

		<input type="Submit" value="Submit" />
		<%
		}
		%>
	</form>
</body>
</html>
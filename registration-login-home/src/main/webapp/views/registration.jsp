<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Form</h1>
	<form method = "POST" action = "save-user">
		Username:<input id="username" name="username"/><br>
		Name:<input id="name" name="name"/><br>
		Email Id:<input id="email" name="email"/><br>
		Password:<input id="password" name="password" type="password"/><br>
		City:<input id="city" name="city"/><br>
			<br>
			<br>
			<input type="submit" value="Register" onclick="goreg()"/>
		
	</form>
	<script>
		function goreg(){
		alert("Registered !!!!  Go To Login :)");
		window.location.href="/";
		}
	</script>
</body>
</html>
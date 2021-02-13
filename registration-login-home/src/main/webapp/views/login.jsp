<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>


	<div>
		<form action="/login" method="post">
			<div>
				User Name:<input type="text" name="username">
			</div>
			<br>
			<br>
			<c:if test="${not empty error}">
				<div>
					<h6>${error}</h6>
				</div>
			</c:if>
			<div>
				Password:<input type="text" name="password">
			</div>
			<br>
			<br>
			<div>
				<input type="submit" name="Login">
			</div>
			<br>
			<br>
			<div>
				<input type="button" value="Register" onclick="goToRegister()">
			</div>
			<br>
			<br>
		</form>
	</div>
	
	<script type="text/javascript">
		function goToRegister(){
		window.location.href="/register";
		}
	</script>
</body>
</html>
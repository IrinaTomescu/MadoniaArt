<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/login.css" />
<script type="text/javascript" src="js/login.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MadoniaArt | Login</title>
</head>
<body>
	<div>
		<c:import url="navbar.jsp" />
	</div>
	<form action="LoginServlet" method="post">
		<div class="login-wrap">
			<h2>Login</h2>

			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username" placeholder="username">
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"
						placeholder="password" required></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="checkbox" name="remember">Remember me
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Login"></td>

				</tr>

				<a href="register.jsp">
					<p>Don't have an account? Register</p>
				</a>

			</table>

		</div>


	</form>
<jsp:include page="footer.jsp" />
</body>
</html>

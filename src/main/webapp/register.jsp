<%--
  Created by IntelliJ IDEA.
  User: irina
  Date: 7/28/2016
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/login.css" />
<script type="text/javascript" src="js/login.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MadoniaArt | Register</title>
</head>
<body>
	<div>
		<c:import url="navbar.jsp" />
	</div>
	<form action="RegisterServlet" method="post">
		<div class="login-wrap">
			<h2>Register</h2>

			<table>
				<tr>
					<td>Email address:</td>
					<td><input type="text" name="username" placeholder="username">
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"
						placeholder="password" required></td>
				</tr>
				<tr>
					<td>Retype password:</td>
					<td><input type="password" name="password"
						placeholder="password" required></td>
				</tr>

				<tr>
					<td><input type="submit" value="Register"></td>

				</tr>


			</table>

		</div>


	</form>
	<jsp:include page="footer.jsp" />
</body>
</html>

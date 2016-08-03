<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="includes/css/main.css" />

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>MadoniaArt</title>
</head>
<body>

	<div id="wrapper">
		<div id="contaier">

			<div>
				<jsp:include page="navbar.jsp" />
			</div>


			<div class="col-md-8">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/100x180-acrilic-pe-panza.jpg"
					alt="100x180-acrilic-pe-panza" width="700px" height="320px">

			</div>

			<div class="col-md-4">

				<div class="caption">
					<a
						href="http://www.art-mine.com/artistpage/falcan_iulia__lavinia.aspx">
						<h3>Agora Gallery - Chelsea,NY Exhibition</h3>
					</a>
					<p>I hope that my paintings aptly share my ideas with the world
						and inspire people to focus on the simple things.</p>

				</div>
			</div>

			<div>
				<div class="socialmedia-buttons smw_center col-md-6">
					<a href="https://www.facebook.com/IuliaLaviniaFalcan/"
						rel="nofollow" target="_blank"><img width="32" height="32"
						src="includes/pics/facebook.png" alt="Facebook" title="Facebook"
						class="scale"></a>
				</div>

				<div class="socialmedia-buttons smw_center col-md-6">
					<a href="https://www.facebook.com/IuliaLaviniaFalcan/"
						rel="nofollow" target="_blank"><img width="32" height="32"
						src="includes/pics/instagram.png" alt="Instagram" title="Instagram"
						class="scale"></a>
				</div>

			</div>

			<div class="col-xs-6 col-md-4">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/AKDD23C60A_97DC_451F_BBE9_7B329AC4E478_1.jpg"
					alt="100x180-acrilic-pe-panza">
			</div>

			<div class="col-xs-6 col-md-4">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/AKCAD3D685_14B7_4717_8954_788D03ECF574_1.jpg"
					alt="100x180-acrilic-pe-panza">
			</div>

			<div class="col-xs-6 col-md-4">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/AK68D32004_45CE_4434_A605_4920F504931D_1.jpg"
					alt="100x180-acrilic-pe-panza">
			</div>
			<div class="col-xs-6 col-md-4">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/13524401_614321742075481_3453959912641776508_n.jpg"
					alt="100x180-acrilic-pe-panza">
			</div>
			<div class="col-xs-6 col-md-4">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/AK9F708FCE_A01A_406F_B365_E032D869BE86_1.jpg"
					alt="100x180-acrilic-pe-panza">
			</div>
			<div class="col-xs-6 col-md-4">
				<img id="poza" class="thumbnail img-responsive"
					src="includes/pics/AK700D234E_2A42_4138_99B3_5D2B574933A7.jpg"
					alt="100x180-acrilic-pe-panza">
			</div>


		</div>
		
		<div id="footer">

			<jsp:include page="footer.jsp" />

		</div>
	</div>
	
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	
</body>

</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="img/favicon.png">
<title>JobNet</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/assets/css/animate.min.css" rel="stylesheet">
<link href="resources/font/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/font/css/font-awesome.css" rel="stylesheet">
<link href="resources/assets/css/timeline.css" rel="stylesheet">
<script src="resources/assets/js/jquery.1.11.1.min.js"></script>
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
<script src="resources/assets/js/custom.js"></script>
<!--[if lt IE 9]> <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script> <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> <![endif]-->
</head>
<body class="welcome-page animated fadeIn">
	<div class="row row-welcome">
		<div class="login-page">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<img src="resources/img/prism.png" class="user-avatar">
					<h1>JobNet</h1>
					<form action="checkLogin" method="post" role="form" class="frm animated flipInX">
						<div class="form-content">
							<div class="form-group">
								<input class="form-control input-underline input-lg"
									placeholder="Username" type="text" name="email">
							</div>
							<div class="form-group">
								<input class="form-control input-underline input-lg"
									placeholder="Password" type="password" name="password">
							</div>
						</div>
						<button class="btn btn-warning btn-lg">Log in</button>
						<a href="#" class="btn btn-warning btn-lg btn-frm">Register</a>
					</form>
					<form role="form" class="frm hidden">
						<div class="form-content">
							<div class="form-group">
								<input class="form-control input-underline input-lg"
									placeholder="Email" type="text">
							</div>
							<div class="form-group">
								<input class="form-control input-underline input-lg"
									placeholder="Username" type="text">
							</div>
							<div class="form-group">
								<input class="form-control input-underline input-lg"
									placeholder="Password" type="password">
							</div>
						</div>
						<a href="#" class="btn btn-warning btn-lg btn-frm">Log in</a>
						<button type="submit" class="btn btn-warning btn-lg">Register</button>
					</form>
				</div>
			</div>
			<div class="row welcome-full animated fadeInLeft users-row">
				<div class="row-body hidden-xs hidden-sm">
					<div class="welcome-users-inner">
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/bush.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/clition.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/obama.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/trump.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/g.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/f.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/e.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/d.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/c.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/b.jpg"
								class="img-rounded">
							</a>
						</div>
						<div class="welcome-user">
							<a href="profile.html"> <img src="resources/img/avatar/a.jpg"
								class="img-rounded">
							</a>
						</div>
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="container">
					<p></p>
					<div class="footer-links">
						<a href="#">Terms of Use</a> | <a href="#">Privacy Policy</a> | <a
							href="#">Developers</a> | <a href="#">Contact</a> | <a href="#">About</a>
					</div>
					Copyright � Company - All rights reserved
					<p></p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
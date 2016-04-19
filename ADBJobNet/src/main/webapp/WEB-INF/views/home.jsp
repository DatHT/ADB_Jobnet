<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
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
<title>Demo</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/assets/css/animate.min.css" rel="stylesheet">
<link href="resources/font/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/font/css/font-awesome.css" rel="stylesheet">
<link href="resources/assets/css/timeline.css" rel="stylesheet">
<link href="resources/assets/css/material.css" rel="stylesheet">
<script src="resources/assets/js/jquery.1.11.1.min.js"></script>
<script src="resources/bootstrap/js/bootstrap.min.js"></script>
<script src="resources/assets/js/custom.js"></script>


<!--[if lt IE 9]> <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script> <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script> <![endif]-->
</head>
<body class="animated fadeIn">
	<nav class="navbar navbar-default navbar-fixed-top navbar-principal">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/login"> <b>JobNet</b>
				</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<div class="col-md-5 col-sm-4">
					<form class="navbar-form">
						<div class="form-group" style="display: inline;">
							<div class="input-group" style="display: table;">
								<input class="form-control" name="search"
									placeholder="Search..." autocomplete="off" type="text">
								<span class="input-group-addon" style="width: 1%;"> <span
									class="glyphicon glyphicon-search"></span>
								</span>
							</div>
						</div>
					</form>
				</div>

				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="profile.html">
							${sessionScope.USER.name} <img
							src="resources/img/avatar/article.jpg" class="img-nav">
					</a></li>
					<li><a href="home.html"><i class="fa fa-bars"></i>&nbsp;Home</a></li>
					<li><a href="messages.html"><i class="fa fa-comments"></i></a></li>
					<li><a href="notifications.html"><i class="fa fa-globe"></i></a></li>
					<li><a href="search.html"><i class="fa fa-users"></i></a></li>
					<li><a href="about.html"><i class="fa fa-info-circle"></i></a></li>
					
					<li><a href="#" class="nav-controller"><i
							class="fa fa-user"></i></a></li>
					<li><a href="logout"><i class="fa fa-sign-out"></i></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container" style="margin-top: 66px;">
		<div class="row">
			<div class="col-md-10">
				<div class="panel">
					<div class="cover-photo">
						<div class="fb-timeline-img">
							<img src="resources/img/avatar/jobs21.jpg" alt="">
						</div>
						<div class="fb-name">
							<h2>
								<a href="#">${sessionScope.USER.name}</a>
							</h2>
						</div>
					</div>
					<div class="panel-body">
						<div class="profile-thumb">
							<img src="resources/img/avatar/article.jpg" alt="">
						</div>
						<a href="#" class="fb-user-mail">${sessionScope.USER.email}</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10">
				<div class="row">
					<div class="col-md-10">
						<div class="row">
							<div class="col-md-10">
								<div class="panel profile-info">
									<form action="postStatus" method="get" role="form">
										<textarea name="status" class="form-control input-lg p-text-area" rows="2"
											placeholder="Which Job you want to share?"></textarea>

										<div class="attachment-block clearfix">
											<div class="group">
												<input type="text" name="jobName" required> <span
													class="highlight"></span> <span class="bar"></span> <label>Name</label>
											</div>

											<div class="group">
												<input type="text" name="jobDes" required> <span class="highlight"></span>
												<span class="bar"></span> <label>Job Description</label>
											</div>
											<div class="group">
												<input type="text" name="numOfHire" required> <span class="highlight"></span>
												<span class="bar"></span> <label>Number Of Hiring</label>
											</div>
										
										</div>
									<div class="panel-footer">
										<button class="btn btn-warning pull-right">Post</button>
										<ul class="nav nav-pills">
											<li><a href="#"><i class="fa fa-map-marker"></i></a></li>
											<li><a href="#"><i class="fa fa-camera"></i></a></li>
											<li><a href="#"><i class="fa fa-film"></i></a></li>
											<li><a href="#"><i class="fa fa-microphone"></i></a></li>
										</ul>
									</div>
									</form>
									
								</div>
							</div>

							<c:set var="list" value="${LISTPOST}" />
							<c:if test="${not empty list}">
								<c:forEach var="dto" items="${list}">
									<div class="col-md-10">
										<div class="box box-widget">
											<div class="box-header with-border">
												<div class="user-block">
													<img class="img-circle" src="resources/img/job/user.png"
														alt="User Image"> <span class="username"><a
														href="#">${dto.personName}</a></span> <span class="description">Shared
														publicly - ${dto.post.timeShare}</span>
												</div>
												<div class="box-tools">
													<button type="button" class="btn btn-box-tool"
														data-toggle="tooltip" title=""
														data-original-title="Mark as read">
														<i class="fa fa-circle-o"></i>
													</button>
													<button type="button" class="btn btn-box-tool"
														data-widget="collapse">
														<i class="fa fa-minus"></i>
													</button>
													<button type="button" class="btn btn-box-tool"
														data-widget="remove">
														<i class="fa fa-times"></i>
													</button>
												</div>
											</div>
											<div class="box-body">
												<p>${dto.post.description}</p>
												<div class="attachment-block clearfix">
													<img class="attachment-img"
														src="resources/img/job/job-opt.jpg" alt="Attachment Image">
													<div class="attachment-pushed">
														<h4 class="attachment-heading">
															<a href="#">${dto.post.jobname}</a>
														</h4>
														<div class="attachment-text">
															${dto.post.jobDesciption}... <a href="#">more</a>
														</div>
													</div>
												</div>
												<button type="button" class="btn btn-default btn-xs">
													<i class="fa fa-share"></i> Share
												</button>
												<button type="button" class="btn btn-default btn-xs">
													<i class="fa fa-thumbs-o-up"></i> Like
												</button>
												<span class="pull-right text-muted">${dto.post.totalLike} likes
													0 comments</span>
											</div>
											<div class="box-footer box-comments">
												<div class="box-comment">
													
												</div>
												
											</div>
											<div class="box-footer">
												<form action="#" method="post">
													<img class="img-responsive img-circle img-sm"
														src="resources/img/avatar/article.jpg" alt="Alt Text">
													<div class="img-push">
														<input class="form-control input-sm"
															placeholder="Press enter to post comment" type="text">
													</div>
												</form>
											</div>
										</div>
									</div>
								</c:forEach>
							</c:if>


						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<div class="chat-sidebar focus">
		<div class="list-group text-left">
			<p class="text-center visible-xs">
				<a href="#" class="hide-chat btn btn-success">Hide</a>
			</p>
			<p class="text-center chat-title">Online users</p>
			<a href="messages.html" class="list-group-item"> <i
				class="fa fa-check-circle connected-status"></i> <img
				src="resources/img/avatar/bush.jpg" class="img-chat img-thumbnail"> <span
				class="chat-user-name">Jeferh Smith</span>
			</a> <a href="messages.html" class="list-group-item"> <i
				class="fa fa-times-circle absent-status"></i> <img
				src="resources/img/avatar/clition.jpg" class="img-chat img-thumbnail">
				<span class="chat-user-name">Dapibus acatar</span>
			</a> <a href="messages.html" class="list-group-item"> <i
				class="fa fa-check-circle connected-status"></i> <img
				src="resources/img/avatar/bush.jpg" class="img-chat img-thumbnail"> <span
				class="chat-user-name">Antony andrew lobghi</span>
			</a> <a href="messages.html" class="list-group-item"> <i
				class="fa fa-check-circle connected-status"></i> <img
				src="resources/img/avatar/clition.jpg" class="img-chat img-thumbnail">
				<span class="chat-user-name">Maria fernanda coronel</span>
			</a>
		</div>
	</div>
	<footer class="welcome-footer">
		<div class="container">
			<p></p>
			<div class="footer-links">
				<a href="#">Terms of Use</a> | <a href="#">Privacy Policy</a> | <a
					href="#">Developers</a> | <a href="#">Contact</a> | <a href="#">About</a>
			</div>
			Copyright © Company - All rights reserved
			<p></p>
		</div>
	</footer>
</body>
</html>
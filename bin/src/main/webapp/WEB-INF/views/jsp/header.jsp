<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- <link rel="stylesheet" type="text/css" href="../css/header.css"> -->
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
<style>
    <%@include file="/WEB-INF/views/css/header.css" %>
</style>


    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">

	<div class="container">
		<a class="navbar-brand" href="#"><img
			src='<spring:url value="/images/logo.png"/>'
			title="Về trang chủ FSoft" height="50px" width="180px"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item">


					<div class="container-3">
						<input type="search" id="search" placeholder="Search..." />
						
					</div>

				</li>

				<li class="nav-item"><a class="nav-link" href="#">Trang
						Chủ
				</a></li>
				
				<li class="nav-item"><a class="nav-link" href="#">FeedBack</a>
				</li>

				<li class="nav-item active"><a class="nav-link" href="#">Đăng nhập</a></li>
				
			</ul>
		</div>
	</div>
</nav>
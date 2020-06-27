<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style><%@include file="/WEB-INF/views/css/register.css"%></style>
<link
	href="<c:url value='/WEB-INF/views/css/material-design-iconic-font.min.css'/>"
	rel="stylesheet" media="all">
<link
	href="<c:url value='/WEB-INF/views/css/font-awesome.min.css'/>"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link
	href="<c:url value='/WEB-INF/views/css/select2.min.css'/>"
	rel="stylesheet" media="all">

<link
	href="<c:url value='/WEB-INF/views/css/daterangepicker.css'/>"
	rel="stylesheet" media="all">



</head>
<body>
<<<<<<< HEAD

=======
<button><li class="breadcrumb-item"><a href="/logout">Đăng xuất</a></li></button>
>>>>>>> 34ad48a938715197b4a644362ac8b7111c5fdc5a
<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h2 class="title">Đăng Ký</h2>
					<form method="POST">
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<label class="label">Email</label> <input
										class="input--style-4" type="email" name="email">
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<label class="label">full name</label> <input
										class="input--style-4" type="text" name="full_name">
								</div>
							</div>

						</div>
						<div class="row row-space">

							<div class="col-2">
								<div class="input-group">
									<label class="label">Phone Number</label> <input
										class="input--style-4" type="text" name="phone">
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<label class="label">Password</label> <input class="input--style-4"
										type="password" name="password" value="" size="30" />
								</div>
							</div>
						</div>
						<div class="row row-space">

							<div class="col-2">
								<div class="input-group">
									<label class="label">Giới tính</label>
									<div class="p-t-10">
										<label class="radio-container m-r-45">Nam <input
											type="radio" checked="checked" name="gender" value="Nam"> <span
											class="checkmark"></span>
										</label> <label class="radio-container">Nữ <input
											type="radio" name="gender" value="Nữ"> <span class="checkmark"></span>
										</label>
									</div>
								</div>
							</div>

							<div class="col-2">
								<div class="input-group">
									<label class="label">Tình trạng</label>
									<div class="rs-select2 js-select-simple select--no-search">
										<select name="subject">
<%--											<option disabled="disabled" selected="selected">Chức vụ</option>--%>
											<option value="TEACHER">Giảng viên</option>
											<option value="STUDENT" selected>Học viên</option>

										</select>
										<div class="select-dropdown"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="row row-space">

							<div class="input-group">
								<label class="label">Địa chỉ</label> <input
									class="input--style-4" type="diachi" name="diachi">
							</div>


						</div>
						<div class="p-t-15">
							<button class="btn btn--radius-2 btn--blue" type="submit">Đăng ký</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
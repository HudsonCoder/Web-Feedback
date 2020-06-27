<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">

<title>Trang chủ - Thêm Lớp Học</title>

<!-- Font Awesome Icons -->
<link rel="stylesheet"
	href="/resources/plugins/fontawesome-free/css/all.min.css">
<!-- IonIcons -->
<link rel="stylesheet"
	href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/resources/dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
<style type="text/css">
input:invalid {
	color: red;
}
</style>
<style type="text/css">
#myBtn {
	display: none;
	position: fixed;
	bottom: 20px;
	right: 30px;
	z-index: 99;
	font-size: 18px;
	border: none;
	outline: none;
	background-color: red;
	color: white;
	cursor: pointer;
	padding: 15px;
	border-radius: 4px;
}

#myBtn:hover {
	background-color: #555;
}

input






:not



 



(
:placeholder-shown



 



)
{
border-color






:



 



hsl






(0
,
76%,
50%);;
}

/* Show green borders when valid */
input:valid {
	border-color: hsl(120, 76%, 50%);
}
/*------------------------*/
</style>
</head>

<body class="hold-transition sidebar-mini">
	<div class="wrapper">
		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="/admin"
					class="nav-link">Home</a></li>
			</ul>

		</nav>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a href="/admin" class="brand-link"> <img
				src="/resources/dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
				class="brand-image img-circle elevation-3" style="opacity: .8">
				<span class="brand-text font-weight-light">Quản Lý Feedback</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user panel (optional) -->
				<div class="user-panel mt-3 pb-3 mb-3 d-flex">
					<div class="image">
						<img src="/images/fpt-software-logo.png"
							class="img-circle elevation-2" alt="User Image">
					</div>
					<div class="info">
						<a href="/admin" class="d-block">Nhóm 10 - Admin</a>
					</div>
				</div>

				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">


						<li class="nav-item has-treeview menu-open"><a href="/admin"
							class="nav-link active"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Quản lý lớp học <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="/admin" class="nav-link">
										<i class="far fa-circle nav-icon"></i>
										<p>Xem danh sách lớp học</p>
								</a></li>


								<li class="nav-item"><a href="/admin/addclasses"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>Thêm lớp học</p>
								</a></li>
							</ul></li>



						<li class="nav-item has-treeview menu-open"><a href=""
							class="nav-link active"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Quản lý khoá học <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">

								<li class="nav-item"><a href="/admin/courses"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>Xem danh sách khoá học</p>
								</a></li>
								<li class="nav-item"><a href="/admin/addcourses"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>Thêm khoá học</p>
								</a></li>
							</ul></li>

						<li class="nav-item has-treeview menu-open"><a href="#"
							class="nav-link active"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Quản lý feedback <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">

								<li class="nav-item"><a href="/admin/viewfeedback"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>Xem tất cả feedback</p>
								</a>
								<li class="nav-item"><a href="/admin/editfeedback"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>Sửa form feedback</p>

								</a></li>
							</ul></li>

						<li class="nav-item has-treeview menu-open"><a href="#"
							class="nav-link active"> <i
								class="nav-icon fas fa-tachometer-alt"></i>
								<p>
									Quản lý tài khoản <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="/admin/account"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>Xem danh sách tài khoản</p>
								</a></li>
							</ul></li>

					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->


		<!-- Main content -->
		<div id="content-wrapper">
			<div class="content-wrapper">
				<!-- Content Header (Page header) -->
				<div class="content-header">
					<div class="container-fluid">
						<div class="col-sm-12">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="/logout">Đăng xuất</a></li>
								<li class="breadcrumb-item active">Admin</li>
							</ol>
						</div>
					</div>
				</div>
				<div class="container-fluid">

					<!-- Breadcrumbs-->
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Quản lý lớp học</a></li>
						<li class="breadcrumb-item active">Overview</li>

					</ol>


					<!-- DataTables Example -->
					<div class="card mb-3">
						<div class="card-header">
							<i class="fas fa-table"></i> Bảng quản lý lớp học
						</div>

						<div class="card-body">
							<form id="update" action="" method="post"
								onsubmit="return check()">
								<h3>Thêm lớp học</h3>
								<div class="form-group">
									<label for="usr">Mã lớp:</label> <input value="${malop}"
										readonly name="malop" type="text" class="form-control"
										id="usr">
								</div>
								<div class="form-group">
									<label for="pwd">Tên lớp:</label> <input name="tenlop"
										class="form-control" id="tenlop" type="text" required
										pattern="^[a-z Ạ-ỹ A-Z 0-9_\. ]{4,102}$"
										title="Tên lớp không được để trống và ít nhất 4 chữ số và không có ký tự đặc biệt" />
								</div>
								<div class="row row-space">
									<div class="col-6">
										<div class="form-group">
											<label >Tên giảng viên </label> <br> <select class="form-control"
												name="teacher">
												<c:forEach items="${teachers}" var="teacher">
													<option value="${teacher.email}">${teacher.tkHovaTen}
														(${teacher.email})</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="col-6">
										<div class="form-group">
											<label>Tên khoá học </label> <br> <select name="maKH" class="form-control"> 
												<c:forEach items="${khoahocs}" var="kh">
													<option value="${kh.khMa}">${kh.khTen}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</div>
								<div class="form-group">
									<label>Danh sách sinh viên</label>

									<table class="table table-bordered" id="dataTable" width="100%"
										cellspacing="0">
										<thead>
											<tr>

												<th>Select</th>
												<th>Tên Học Sinh</th>
												<th>Email</th>
												<th>Địa Chỉ</th>
												<th>Số Điện Thoại</th>
											</tr>
										</thead>
										<tfoot>
											<tr>

												<th>Select</th>
												<th>Tên Học Sinh</th>
												<th>Email</th>
												<th>Địa Chỉ</th>
												<th>Số Điện Thoại</th>
											</tr>
										</tfoot>
										<tbody>
											<c:forEach items="${students}" var="student"
												varStatus="count">
												<tr>

													<td>
														<div class="custom-control custom-checkbox">
															<input name="students" type="checkbox"
																class="custom-control-input" value="${student.email}"
																id="students${count.count}"> <label
																class="custom-control-label"
																for="students${count.count}"></label>
														</div>
													</td>
													<td>${student.tkHovaTen}</td>
													<td>${student.email}</td>
													<td>${student.tkDiaChi}</td>
													<td>${student.tkSdt}</td>

												</tr>
											</c:forEach>

										</tbody>
									</table>

								</div>

								<br>
								<center>
									<button type="submit" class="btn btn-primary">Tạo lớp</button>
								</center>


							</form>
						</div>

					</div>

				</div>


			</div>
			<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Nhóm 10 - Hệ thống quản lý Feedback cho các khóa học
							nội bộ tại Fsoft HCM</span>
					</div>
				</div>
			</footer>


		</div>
	</div>
	<!-- ./wrapper -->

	<!-- REQUIRED SCRIPTS -->

	<!-- jQuery -->
	<script src="/resources/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE -->
	<script src="/resources/dist/js/adminlte.js"></script>

	<!-- OPTIONAL SCRIPTS -->
	<script src="/resources/plugins/chart.js/Chart.min.js"></script>
	<script src="/resources/dist/js/demo.js"></script>
	<script src="/resources/dist/js/pages/dashboard3.js"></script>


	<script type="text/javascript" charset="utf8"
		src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>

	<script>
		$(function() {
			$("#dataTable").dataTable();
		})
		function check() {
			var tenlop = document.getElementById("tenlop").value;
			if (tenlop == "") {
				alert("Vui lòng nhập tên lớp!");
				return false;
			}

			var students = document.getElementsByName('students');
			for (var i = 0; i < students.length; i++) {
				if (students[i].checked === true) {
					return true;

				}
			}

			return false;
		}
	</script>
	<script>
		//Get the button
		var mybutton = document.getElementById("myBtn");

		// When the user scrolls down 20px from the top of the document, show the button
		window.onscroll = function() {
			scrollFunction()
		};

		function scrollFunction() {
			if (document.body.scrollTop > 20
					|| document.documentElement.scrollTop > 20) {
				mybutton.style.display = "block";
			} else {
				mybutton.style.display = "none";
			}
		}

		// When the user clicks on the button, scroll to the top of the document
		function topFunction() {
			document.body.scrollTop = 0;
			document.documentElement.scrollTop = 0;
		}
	</script>
</body>
</html>

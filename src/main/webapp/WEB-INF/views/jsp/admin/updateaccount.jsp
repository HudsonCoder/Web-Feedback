<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">

<title>Trang chủ - Quản Lý Tài Khoản</title>

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

input:not (:placeholder-shown ) {
	border-color: hsl(0, 76%, 50%);;
}

/* Show green borders when valid */
input:valid {
	border-color: hsl(120, 76%, 50%);
}
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
								<li class="nav-item"><a href="" class="nav-link"> <i
										class="far fa-circle nav-icon"></i>
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
								</a></li></li>

						<li class="nav-item"><a href="/admin/editfeedback"
							class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Sửa form feedback</p>
						</a></li>
						</li>
					</ul>
					</li>

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
						<li class="breadcrumb-item"><a href="#">Quản lý tài khoản</a></li>
						<li class="breadcrumb-item active">Overview</li>

					</ol>

					<!-- DataTables Example -->
					<div class="card mb-3">

						<p style="margin: 8px;">${messenger}</p>
						<form class="container" id="update" method="post"
							action="/admin/editaccount" onsubmit="return checkData()">
							<h3>Cập nhật tài khoản</h3>

							<div class="form-group">
								<label for="usr">Email:</label> <input name="email" readonly
									type="text" value="${taikhoan.email}" class="form-control"
									id="usr" required />
							</div>

							<div class="form-group">
								<label>Họ và tên:</label> <input name="ten"
									value="${taikhoan.tkHovaTen}" id="ten" class="form-control"
									required />
							</div>

							<div class="form-group">
								<label for="dt">Địa chỉ:</label> <input name="diachi"
									value="${taikhoan.tkDiaChi}" class="form-control" id="dt"
									required />
							</div>

							<div class="form-group">
								<label for="sd">Số điện thoại:</label> <input name="sdt"
									value="${taikhoan.tkSdt}" class="form-control" id="sd" required
									pattern="(09|03|07|08|05)+([0-9]{8})"
									title="Số điện thoại phải là số và có 10 số, Bắt đàu từ đuôi 08/09/03/07/05" />
							</div>

							<label>Giới tính:</label>
							<div class="radio">
								<label><input type="radio" value="Nữ" name="gioitinh"
									checked>Nữ</label>
							</div>
							<div class="radio">
								<label><input type="radio" value="Nam" name="gioitinh">Nam</label>
							</div>

							<center>
								<button type="submit" class="btn btn-primary">Cập nhật</button>
							</center>


						</form>
					</div>


				</div>



			</div>
			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Nhóm 10 - Hệ thống quản lý Feedback cho các khóa học
							nội bộ tại Fsoft HCM</span>
					</div>
				</div>
			</footer>


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
		<a class="scroll-to-top rounded" href="#page-top"> <i
			class="fas fa-angle-up"></i>
		</a>
	</div>

	<script>
		var elements = document.getElementsByName('gioitinh');
		for (var i = 0; i < elements.length; i++) {
			if (elements[i].value === "${taikhoan.tkGioiTinh}") {
				elements[i].checked = true;
			}
		}

		function checkData() {
			var ten = document.getElementById("ten").value;
			var diachi = document.getElementById("dt").value;
			var phone = document.getElementById("sd").value;
			var vnf_regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;
			if (ten == "") {
				alert("Vui lòng nhập họ và tên người dùng!");
				return false;
			}

			if (diachi == "") {
				alert("Vui lòng nhập địa chỉ!");
				return false;
			}
			if (phone !== '') {
				if (vnf_regex.test(phone) == false) {
					alert('Số điện thoại của bạn không đúng định dạng! Ví dụ (Phải là 10 số và bắt đầu từ đuôi 09/03/07/08/05)');
					return false;
				}
			} else {
				alert('Bạn chưa điền số điện thoại!');
				return false;
			}
			alert('Sửa tài khoản thành công!');

			return true;
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
	<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>

</body>
</html>

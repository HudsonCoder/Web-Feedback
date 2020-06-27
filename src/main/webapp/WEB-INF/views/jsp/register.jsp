<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
<%@include file="/WEB-INF/views/css/register.css"%>
</style>
<link
	href="<c:url value='/WEB-INF/views/css/material-design-iconic-font.min.css'/>"
	rel="stylesheet" media="all">
<link href="<c:url value='/WEB-INF/views/css/font-awesome.min.css'/>"
	rel="stylesheet" media="all">
<!-- Font special for pages-->
<link
	href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Vendor CSS-->
<link href="<c:url value='/WEB-INF/views/css/select2.min.css'/>"
	rel="stylesheet" media="all">

<link href="<c:url value='/WEB-INF/views/css/daterangepicker.css'/>"
	rel="stylesheet" media="all">


</head>
<body>

	<button>
		<li class="breadcrumb-item"><a href="/logout">Đăng xuất</a></li>
	</button>

	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
		<div class="wrapper wrapper--w680">
			<div class="card card-4">
				<div class="card-body">
					<h2 class="title">Đăng Ký</h2>

					<form method="post" action="/register"
						onsubmit="return checkData()">
						<div class="row row-space">
							<div class="col-2">
								<div class="input-group">
									<label class="label">Email</label> <input
										class="input--style-4" type="email" id="email" name="email" required title="Bạn phải nhập đúng định dạng email Vd:example@example.com"/>
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<label class="label">full name</label> <input
										class="input--style-4" type="text" id="full_name"
										name="full_name" required 
										pattern="^{3,1200}$"
										title="Tên lớp không được để trống và ít nhất 3 ký tự chữ và không có ký tự đặc biệt và chữ số"/>
								</div>
							</div>

						</div>
						<div class="row row-space">

							<div class="col-2">
								<div class="input-group">
									<label class="label">Phone Number</label> <input
										class="input--style-4" type="text" id="phone" name="phone"
										required pattern="(09|03|07|08|05)+([0-9]{8})"
										title="Số điện thoại phải là số và có 10 số, Bắt đàu từ đuôi 08/09/03/07/05" />
								</div>
							</div>
							<div class="col-2">
								<div class="input-group">
									<label class="label">Password</label> <input
										class="input--style-4" type="password" name="password"
										id="password" value="" size="30" required 
										pattern="^{6,100}$"
										title="password không được dưới 6 ký tự và phải là số"/>
								</div>
							</div>
						</div>
						<div class="row row-space">

							<div class="col-2">
								<div class="input-group">
									<label class="label">Giới tính</label>
									<div class="p-t-10">
										<label class="radio-container m-r-45">Nam <input
											type="radio" checked="checked" name="gender" value="Nam">
											<span class="checkmark"></span>
										</label> <label class="radio-container">Nữ <input type="radio"
											name="gender" value="Nữ"> <span class="checkmark"></span>
										</label>
									</div>
								</div>
							</div>

							<div class="col-2">
								<div class="input-group">
									<label class="label">Tình trạng</label>
									<div class="rs-select2 js-select-simple select--no-search">
										<select name="subject" >
											
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
									class="input--style-4" id="diachi" type="diachi" name="diachi">
							</div>


						</div>
						<div class="p-t-15">
							<button class="btn btn--radius-2 btn--blue" type="submit">Đăng
								ký</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script>
		function validateEmail(email) {
			var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
			return re.test(email);
		}

		function checkData() {
			var email = document.getElementById('email').value;
			var diachi = document.getElementById('diachi').value;
			var full_name = document.getElementById('full_name').value;
			var password = document.getElementById('password').value;
			var phone = document.getElementById('phone').value;
			var vnf_regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;

			var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

			if (email == "" || diachi == "" || full_name == "" || phone == "") {
				alert('Vui lòng không để trống!');
				return false;
			}
			if (re.test(email) == false) {
				alert('Bạn nhập không đúng định dạng email!\nExample@gmail.com');
				email.focus; 
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

			if (password.length < 6) {
				alert('Password không được dưới 6 kí tự!');
				return false;
			}
			if (password.length > 20) {
				alert('Password không được quá 20 ký tự!');
				return false;
			}
			alert("Bạn đã Đăng ký tài khoản thành công");
			return true;
		}
	</script>
</body>
</html>
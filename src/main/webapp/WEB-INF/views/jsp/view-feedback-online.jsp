<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">

<title>Xem feedback</title>

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
		<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
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
</style>
</head>

<body class="hold-transition sidebar-mini">
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-4">
				<img src="/images/logo.png" height="100" width="150">
			</div>
			<div class="col-sm-8" style="padding: 30px;">
				<div class="row">
					<div class="col-sm-6">
						</div>
					<div class="col-sm-6" style="padding-bottom: 8px;">
						<div class="col-sm-4"></div>
						<div class="col-sm-8 menu-container">
							<a href="/" style="margin-right: 8px;">Trang chủ</a> <a href="/"
								style="margin-right: 8px;">Feedback</a> <a href="/logout"
								style="margin-right: 8px;">Đăng xuất</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="wrapper">

		<!-- Main content -->
		<div id="content-wrapper">


			<div class="container">

				<!-- DataTables Example -->
				<div class="card mb-3">

					<div class="card-body">
						<div class="table-responsive">
						<button>
								<a href="/">Quay lại</a>
							</button>
							<h3>Xem feedback online</h3>
							<table class="table table-bordered" id="dataTable"
								style="width: 100%" style="cellspacing=0">
								<thead>
									<tr>
										<th>STT</th>
										<th>Câu hỏi</th>
										<th>Thống kê những Câu trả lời Feeback</th>

									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>${cauhois[0].noiDung}</td>
										<td>
											<table class="table table-bordered" id="dataTable"
												style="width: 100%" style="cellspacing=0">
												<thead>
													<tr>
														<th>STT</th>
														<th>Câu trả lời</th>
													</tr>
												</thead>
												<tbody>

													<c:forEach items="${onlines}" var="online"
														varStatus="count">
														<tr>
															<td>${count.count}</td>
															<td>${online.ctCauHoi1}</td>

														</tr>
													</c:forEach>

												</tbody>
											</table>
										</td>
									</tr>
									<tr>
										<td>2</td>
										<td>${cauhois[1].noiDung}</td>
										<td>
											<table class="table table-bordered" id="dataTable"
												style="width: 100%" style="cellspacing=0">
												<thead>
													<tr>
														<th>STT</th>
														<th>Câu trả lời</th>
													</tr>
												</thead>
												<tbody>

													<c:forEach items="${onlines}" var="online"
														varStatus="count">
														<tr>
															<td>${count.count}</td>

															<td>${online.ctCauHoi2}</td>
														</tr>
													</c:forEach>

												</tbody>
											</table>
										</td>
									</tr>
									<tr>
										<td>3</td>
										<td>${cauhois[2].noiDung}</td>
										<td>
											<canvas id="myChart1"></canvas>
										</td>
									</tr>
									<tr>
										<td>4</td>
										<td>${cauhois[3].noiDung}</td>
										<td>
											<canvas id="myChart2"></canvas>
										</td>
									</tr>
									<tr>
										<td>5</td>
										<td>${cauhois[4].noiDung}</td>
										<td>
											<canvas id="myChart3"></canvas>
										</td>
									</tr>
									<tr>
										<td>6</td>
										<td>${cauhois[5].noiDung}</td>
										<td>
											<canvas id="myChart4"></canvas>
										</td>
									</tr>

								</tbody>

							</table>
							<button onclick="topFunction()" id="myBtn" title="Go to top">Top</button>



						</div>
					</div>

				</div>

			</div>
			<button>
				<a href="/">Quay lại</a>
			</button>

			<footer class="sticky-footer">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Nhóm 10 - Hệ thống quản lý Feedback cho các khóa học
							nội bộ tại Fsoft HCM</span>
					</div>
				</div>
			</footer>

		</div>

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
		
		 <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>

		<script>
		$(function(){
		    $("#dataTable").dataTable();
		  })
var mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
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

		<script>
        var ctx1 = document.getElementById('myChart1').getContext('2d');
        var myPieChart1 = new Chart(ctx1, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[0].getData()},
                    backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"]
                }],

                // These labels appear in the legend and in the tooltips when hovering different arcs
                labels: [
                    '1 Sao',
                    '2 Sao',
                    '3 Sao',
                    '4 Sao',
                    '5 Sao'
                ]
            }
        });

        var ctx2 = document.getElementById('myChart2').getContext('2d');
        var myPieChart2 = new Chart(ctx2, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[1].getData()},
                    backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"]
                }],

                // These labels appear in the legend and in the tooltips when hovering different arcs
                labels: [
                    '1 Sao',
                    '2 Sao',
                    '3 Sao',
                    '4 Sao',
                    '5 Sao'
                ]
            }
        });

        var ctx3 = document.getElementById('myChart3').getContext('2d');
        var myPieChart3 = new Chart(ctx3, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[2].getData()},
                    backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"]
                }],

                // These labels appear in the legend and in the tooltips when hovering different arcs
                labels: [
                    '1 Sao',
                    '2 Sao',
                    '3 Sao',
                    '4 Sao',
                    '5 Sao'
                ]
            }
        });

        var ctx4 = document.getElementById('myChart4').getContext('2d');
        var myPieChart4 = new Chart(ctx4, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[3].getData()},
                    backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9","#c45850"]
                }],

                // These labels appear in the legend and in the tooltips when hovering different arcs
                labels: [
                    '1 Sao',
                    '2 Sao',
                    '3 Sao',
                    '4 Sao',
                    '5 Sao'
                ]
            }
        });

    </script>
	</div>
</body>
</html>

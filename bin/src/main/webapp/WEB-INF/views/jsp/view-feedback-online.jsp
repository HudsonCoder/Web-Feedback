<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
    <script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
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
                    <input type="text" class="form-control" id="search" placeholder="Search...">
                </div>
                <div class="col-sm-6" style="padding-bottom: 8px;">
                    <div class="col-sm-4">
                    </div>
                    <div class="col-sm-8 menu-container">
                        <a href="/" style="margin-right: 8px;">Trang chủ</a>
                        <a href="/" style="margin-right: 8px;">Feedback</a>
                        <a href="/logout" style="margin-right: 8px;">Đăng xuất</a>
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
                        <h3>Xem feedback online</h3>

                        <table class="table table-bordered" id="dataTable" width="100%"
                               cellspacing="0">
                            <thead>
                            <tr>
                                <th>STT</th>
                                <th>${cauhois[0].noiDung}</th>
                                <th>${cauhois[1].noiDung}</th>
                            </tr>
                            </thead>
                            <tfoot>
                            <tr>
                                <th>STT</th>
                                <th>${cauhois[0].noiDung}</th>
                                <th>${cauhois[1].noiDung}</th>
                            </tr>
                            </tfoot>

                            <tbody>

                            <c:forEach items="${onlines}" var="online" varStatus="count">
                                <tr>
                                    <td>${count.count}</td>
                                    <td>${online.ctCauHoi1}</td>
                                    <td>${online.ctCauHoi2}</td>
                                </tr>
                            </c:forEach>

                            </tbody>
                        </table>

                        <br>

                        <div class="row">
                            <div class="col-sm-6">
                                <canvas id="myChart1"></canvas>
                                <center>
                                    <p>${cauhois[2].noiDung}</p>
                                </center>
                            </div>
                            <div class="col-sm-6">
                                <canvas id="myChart2"></canvas>
                                <center>
                                    <p>${cauhois[3].noiDung}</p>
                                </center>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <canvas id="myChart3"></canvas>
                                <center>
                                    <p>${cauhois[4].noiDung}</p>
                                </center>
                            </div>
                            <div class="col-sm-6">
                                <canvas id="myChart4"></canvas>
                                <center>
                                    <p>${cauhois[5].noiDung}</p>
                                </center>
                            </div>
                        </div>

                    </div>
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

    <script>
        var ctx1 = document.getElementById('myChart1').getContext('2d');
        var myPieChart1 = new Chart(ctx1, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[0].getData()},
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

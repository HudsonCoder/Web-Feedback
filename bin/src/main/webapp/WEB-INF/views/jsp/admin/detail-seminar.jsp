<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <title>Trang chủ - Xem feedback</title>

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
        <a href="index3.html" class="brand-link"> <img
                src="/resources/dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
                class="brand-image img-circle elevation-3" style="opacity: .8">
            <span class="brand-text font-weight-light">Quản Lý Lớp Học</span>
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
                    <a href="#" class="d-block">Nhóm 10 - Admin</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column"
                    data-widget="treeview" role="menu" data-accordion="false">


                    <li class="nav-item has-treeview menu-open"><a href="#"
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
                        </ul>
                    </li>

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
                            </a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-item has-treeview menu-open"><a href="#"
                                                                   class="nav-link active"> <i
                            class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            Quản lý feedback <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                        <ul class="nav nav-treeview">

                            <li class="nav-item"><a href="/admin/viewfeedback" class="nav-link"> <i
                                    class="far fa-circle nav-icon"></i>
                                <p>Xem tất cả feedback</p>
                            </a></li>

                            <li class="nav-item"><a href="/admin/editfeedback"
                                                    class="nav-link"> <i class="far fa-circle nav-icon"></i>
                                <p>Sửa form feedback</p>
                            </a></li>
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
                            <li class="nav-item"><a href="/admin/account" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Xem danh sách tài khoản</p>
                            </a></li>
                        </ul>
                    </li>

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
                        <i class="fas fa-table"></i> Bảng quản feedback
                    </div>

                    <div class="card-body">
                        <div class="table-responsive">
                            <h3>Xem feedback seminar</h3>

                            <table class="table table-bordered" id="dataTable" width="100%"
                                   cellspacing="0">
                                <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>${cauhois[0].noiDung}</th>
                                    <th>${cauhois[1].noiDung}</th>
                                    <th>${cauhois[2].noiDung}</th>
                                    <th>${cauhois[3].noiDung}</th>
                                    <th>${cauhois[4].noiDung}</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>STT</th>
                                    <th>${cauhois[0].noiDung}</th>
                                    <th>${cauhois[1].noiDung}</th>
                                    <th>${cauhois[2].noiDung}</th>
                                    <th>${cauhois[3].noiDung}</th>
                                    <th>${cauhois[4].noiDung}</th>
                                </tr>
                                </tfoot>

                                <tbody>

                                <c:forEach items="${seminars}" var="seminar" varStatus="count">
                                    <tr>
                                        <td>${count.count}</td>
                                        <td>${seminar.ctCauHoi1}</td>
                                        <td>${seminar.ctCauHoi2}</td>
                                        <td>${seminar.ctCauHoi3}</td>
                                        <td>${seminar.ctCauHoi4}</td>
                                        <td>${seminar.ctCauHoi5}</td>
                                    </tr>
                                </c:forEach>

                                </tbody>
                            </table>

                            <div class="row">
                                <div class="col-sm-6">
                                    <canvas id="myChart1"></canvas>
                                    <center>
                                        <p>${cauhois[5].noiDung}</p>
                                    </center>
                                </div>
                                <div class="col-sm-6">
                                    <canvas id="myChart2"></canvas>
                                    <center>
                                        <p>${cauhois[6].noiDung}</p>
                                    </center>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-6">
                                    <canvas id="myChart3"></canvas>
                                    <center>
                                        <p>${cauhois[7].noiDung}</p>
                                    </center>
                                </div>
                                <div class="col-sm-6">
                                    <canvas id="myChart4"></canvas>
                                    <center>
                                        <p>${cauhois[8].noiDung}</p>
                                    </center>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-6">
                                    <canvas id="myChart5"></canvas>
                                    <center>
                                        <p>${cauhois[9].noiDung}</p>
                                    </center>
                                </div>
                                <div class="col-sm-6">
                                    <canvas id="myChart6"></canvas>
                                    <center>
                                        <p>${cauhois[10].noiDung}</p>
                                    </center>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-6">
                                    <canvas id="myChart7"></canvas>
                                    <center>
                                        <p>${cauhois[11].noiDung}</p>
                                    </center>
                                </div>
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

        var ctx5 = document.getElementById('myChart5').getContext('2d');
        var myPieChart5 = new Chart(ctx5, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[4].getData()},
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

        var ctx6 = document.getElementById('myChart6').getContext('2d');
        var myPieChart6 = new Chart(ctx6, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[5].getData()},
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

        var ctx7 = document.getElementById('myChart7').getContext('2d');
        var myPieChart7 = new Chart(ctx7, {
            type: 'pie',
            data: {
                datasets: [{
                    data: ${data[6].getData()},
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

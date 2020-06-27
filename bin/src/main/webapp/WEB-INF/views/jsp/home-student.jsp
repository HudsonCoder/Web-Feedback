<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

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

<div class="container">
    <div class="page-header">
        <h4>Danh sách các lớp đánh giá</h4>
    </div>
    <ul class="list-group">

        <c:forEach items="${lops}" var="lop">
            <li class="list-group-item">

                <div class="row">
                    <div class="col-sm-10">
                        <div style="font-size: 20px;">${lop.tenLop}</div>
                        <div>
                            GV:
                            <c:forEach items="${lop.listGV}" var="gv">
                                ${gv}
                            </c:forEach>
                        </div>
                    </div>

                    <div class="col-sm-2 btn-group">
                        <a href="/feedback?type=ONLINE&malop=${lop.maLop}">Online</a>
                        <a href="/feedback?type=OFFLINE&malop=${lop.maLop}">Offline</a>
                        <a href="/feedback?type=SEMINAR&malop=${lop.maLop}">Seminar</a>
                    </div>
                </div>
            </li>
        </c:forEach>

    </ul>
</div>

</body>
</html>
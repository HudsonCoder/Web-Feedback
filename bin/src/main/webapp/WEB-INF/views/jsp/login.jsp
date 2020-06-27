<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        <%@include file="/WEB-INF/views/css/login.css" %>
    </style>
    <!-- <link rel="stylesheet" type="text/css" href="../css/login.css"> -->
    <title>Log in</title>
    <link
            href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
            rel="stylesheet" id="bootstrap-css">
    <script
            src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script
            src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link
            href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700"
            rel="stylesheet">
    <link
            href="//fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700"
            rel="stylesheet">
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
</head>

<body>

<jsp:include page="header.jsp"></jsp:include>

<br>
<br>
<br>
<br>
<br>
<br>

<div class="header-w3l">
    <h1>Hệ thống quản lý Feedback tại Fsoft HCM</h1>
</div>
<div class="main-w3layouts-agileinfo">
    <div class="wthree-form">
        <form class="form-login" action="" method="post"
              onsubmit="return login()">

            <h2>Đăng Nhập Ngay</h2>
            <div class="form-sub-w3">
                <input id="username" name="username"
                       type="text" placeholder="Tên tài khoản">
                <div class="icon-w3">
                    <i class="fa fa-user" aria-hidden="true"></i>
                </div>
            </div>
            <div class="form-sub-w3">
                <input id="password" name="password"
                       type="password" placeholder="Mật khẩu">
                <div class="icon-w3">
                    <i class="fa fa-unlock-alt" aria-hidden="true"></i>
                </div>
            </div>
            <div class="aitssendbuttonw3ls">

                <a href="/register">
                    <input id="btn-login" class="btn btn-primary" type="submit"
                           value="Đăng nhập"> <input class="btn btn-primary"
                                                     type="button" value="Đăng Ký"></a>
            </div>
            <label>${messenger}</label>
        </form>
    </div>
</div>

<script>
    function validateEmail(email) {
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
    }

    function login() {
        var email = document.getElementById("username").value;
        var password = document.getElementById("password").value;

        if (!validateEmail(email)) {
            alert('Bạn nhập không đúng định dạng email!');
            return false;
        } else if (password.length < 6) {
            alert('Mật khẩu phải trên 6 kí tự!');
            return false;
        }

        return true;
    }
</script>
</body>

</html>
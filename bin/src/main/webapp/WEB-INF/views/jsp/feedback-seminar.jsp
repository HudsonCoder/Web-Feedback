<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>seminal</title>
    <link rel='stylesheet prefetch' href='https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css'>
<%--    <link rel="stylesheet" type="text/css" href="feedback-seminal.css">--%>
    <style>
        <%@include file="/WEB-INF/views/css/feedback-seminal.css" %>
    </style>
    <style type="text/css">
        body {
            /*background: url(back.jpg);*/
            background: url(<spring:url value="/images/back.jpg"/> );
        }
    </style>

</head>
<body>
<button><li class="breadcrumb-item"><a href="/logout">Đăng xuất</a></li></button>
<form id="bottom" action="feedback/seminar" method="post" onsubmit="return check()">


    <div class="top">
<%--        <img src="<logo.jpg>">--%>
        <img src="<spring:url value="/images/logo.jpg"/>">
        <h2>Phản hồi khoá học Seminar 2020</h2>
        
				
			</div>
			<div class="office-form-subtitle heading-1">
			<h5>Phản hồi của bạn được đánh giá cao và sẽ giúp chúng tôi
					cải thiện hoạt động đào tạo của chúng tôi cho các khóa học tốt hơn trong tương lai.<br>Cảm ơn rất nhiều cho sự hợp tác tuyệt vời của bạn.
					<br> Lưu ý: quy mô chấm điểm là
					từ 1 (kém nhất)-5 (tốt nhất)</h5>
    </div>
    
    <br>
    <h5>1. Tên tài khoản *</h5>
    <input type="text" name="" class="in" value="${email}" readonly>
    <h5>2. ${cauhois[0].noiDung} *</h5>
    <input type="text" name="cauhoi1" class="in">
    <h5>3. ${cauhois[1].noiDung} *</h5>
    <input type="text" name="cauhoi2" class="in">

    <h5>4. ${cauhois[2].noiDung} *</h5>
    <input type="text" name="cauhoi3" class="in">

    <h5>5. ${cauhois[3].noiDung} *</h5>
    <input type="text" name="cauhoi4" class="in">

    <h5>6. ${cauhois[4].noiDung} *</h5>
    <div>


			<input type="radio" value="1" name="cauhoi5">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi5"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi5"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi5">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi5">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
		<h5>7. ${cauhois[5].noiDung} *</h5>
		<div>

			<input type="radio" value="1" name="cauhoi6">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi6"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi6"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi6">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi6">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>8. ${cauhois[6].noiDung} *</h5>

	
	<div>

			<input type="radio" value="1" name="cauhoi7">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi7"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi7"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi7">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi6">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>9. ${cauhois[7].noiDung} *</h5>

	<div>

			<input type="radio" value="1" name="cauhoi8">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi8"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi8"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi8">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi8">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>10. ${cauhois[8].noiDung} *</h5>

	<div>

			<input type="radio" value="1" name="cauhoi9">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi9"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi9"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi9">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi9">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>11. ${cauhois[9].noiDung} *</h5>
   
    <div class="stars">
        <div>
            <input class="star star-5" id="star-5" type="radio" value="5" name="cauhoi10"/>
            <label class="star star-5" for="star-5"></label>
            <input class="star star-4" id="star-4" type="radio" value="4" name="cauhoi10"/>
            <label class="star star-4" for="star-4"></label>
            <input class="star star-3" id="star-3" type="radio" value="3" name="cauhoi10"/>
            <label class="star star-3" for="star-3"></label>
            <input class="star star-2" id="star-2" type="radio" value="2" name="cauhoi10"/>
            <label class="star star-2" for="star-2"></label>
            <input class="star star-1" id="star-1" type="radio" value="1" name="cauhoi10"/>
            <label class="star star-1" for="star-1"></label>
        </div>
    </div>
    <h5>12. ${cauhois[10].noiDung} *</h5>
    <div class="stars2">
        <div>
            <input class="star star-55" id="star-55" type="radio" value="5" name="cauhoi11"/>
            <label class="star star-55" for="star-55"></label>
            <input class="star star-44" id="star-44" type="radio" value="4" name="cauhoi11"/>
            <label class="star star-44" for="star-44"></label>
            <input class="star star-33" id="star-33" type="radio" value="3" name="cauhoi11"/>
            <label class="star star-33" for="star-33"></label>
            <input class="star star-22" id="star-22" type="radio" value="2" name="cauhoi11"/>
            <label class="star star-22" for="star-22"></label>
            <input class="star star-11" id="star-11" type="radio" value="1" name="cauhoi11"/>
            <label class="star star-11" for="star-11"></label>
        </div>

    </div>

    <h5>13. ${cauhois[11].noiDung} *</h5>

    <div class="stars3">
        <div>
            <input class="star star-5a" id="star-5a" type="radio" value="5" name="cauhoi12"/>
            <label class="star star-5a" for="star-5a"></label>
            <input class="star star-4a" id="star-4a" type="radio" value="4" name="cauhoi12"/>
            <label class="star star-4a" for="star-4a"></label>
            <input class="star star-3a" id="star-3a" type="radio" value="3" name="cauhoi12"/>
            <label class="star star-3a" for="star-3a"></label>
            <input class="star star-2a" id="star-2a" type="radio" value="2" name="cauhoi12"/>
            <label class="star star-2a" for="star-2a"></label>
            <input class="star star-1a" id="star-1a" type="radio" value="1" name="cauhoi12"/>
            <label class="star star-1a" for="star-1a"></label>
        </div>
    </div>


    <hr>
    <input value="${malop}" name="malop" style="display: none;">
    <button type="submit">Submit</button>

</form>

<a href="http://lea.verou.me/2011/08/accessible-star-rating-widget-with-pure-css/"></a>

<script>
    function check() {

        for (var j = 5; j <= 12; j++) {
            var elements = document.getElementsByName("cauhoi" + j);
            var isCheck = false;

            for (var i = 0; i < elements.length; i++) {
                if (elements[i].checked === true) {
                    isCheck = true;
                }
            }

            if (!isCheck) {
                alert('Bạn phải nhập đầy đủ!');
                return false;
            }
        }

        return true;
    }
</script>

</body>
</html>
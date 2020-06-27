<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Phản hồi khoá học Online 2020</title>
<style><%@include file="/WEB-INF/views/css/feedback-online.css"%></style>
<%--	<link rel="stylesheet" type="text/css" href="feedback-online.css">--%>
<style type="text/css">
        body {
            /*background: url(back.jpg);*/
            background: url(<spring:url value="/images/back.jpg"/> );
        }
        
    </style>

</head>
<body>
<button><li class="breadcrumb-item"><a href="/logout">Đăng xuất</a></li></button>
<button ><a href="/">Quay lại</a> </button>
	<form action="feedback/online" method="post" id="bottom"
		onsubmit="return check()">


		<div class="top">
<%--        <img src="<logo.jpg>">--%>
        <img src="<spring:url value="/images/logo.jpg"/>">
        <h1>Phản hồi khoá học Online 2020</h1>
        
				
			</div>
			<div class="office-form-subtitle heading-1">
			<h5>Phản hồi của bạn được đánh giá cao và sẽ giúp chúng tôi
					cải thiện hoạt động đào tạo của chúng tôi cho các khóa học tốt hơn trong tương lai.<br>Cảm ơn rất nhiều cho sự hợp tác tuyệt vời của bạn.
					<br> Lưu ý: quy mô chấm điểm là
					từ 1 (kém nhất)-5 (tốt nhất)</h5>
    </div>
    

		<br>
		<h5>1. Tên tài khoản *</h5>
		<input type="text" class="in" value="${email}" readonly>
		<h5>2. ${cauhois[0].noiDung} *</h5>
		<input type="text" name="cauhoi1" class="in" required title="Dữ Liệu không được để trống"/>
		<h5>3. ${cauhois[1].noiDung} *</h5>
		<input type="text" name="cauhoi2" class="in" required title="Dữ Liệu không được để trống"/>

		<h5>4. ${cauhois[2].noiDung} *</h5>
		<div>
			<input type="radio" value="1" name="cauhoi3">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi3"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi3"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi3">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi3">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
		<h5>5. ${cauhois[3].noiDung} *</h5>
		<div>
			<input type="radio" value="1" name="cauhoi4">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi4"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi4"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi4">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi4">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
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
			<input value="true" id="radio-yes" type="radio" name="cauhoi7">
			<label for="radio-yes">Yes</label> <input value="false" id="radio-no"
				type="radio" name="cauhoi7"> <label for="radio-no">No</label>
		</div>

		<input value="${malop}" name="malop" style="display: none;"><br>
		<hr>

		<button type="submit">Submit</button>

	</form>

	<script>
		function check() {

			for (var j = 3; j <= 7; j++) {
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
			 alert("Bạn đã Thực hiện Feedback thành công");
			return true;
		}
	</script>

</body>
</html>
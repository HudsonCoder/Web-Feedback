<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Offline</title>
	<style><%@include file="/WEB-INF/views/css/feedback-offline.css"%>
		
	</style>
<%--	<link rel="stylesheet" type="text/css" href="feedback-offline.css">--%>
	<style type="text/css">
		body{
			background: url(<spring:url value="/images/back.jpg"/> );
		}
	</style>
</head>
<body>
<button><li class="breadcrumb-item"><a href="/logout">Đăng xuất</a></li></button>
<form id="bottom" method="post" action="/feedback/offline" onsubmit="return check()">

	
	<div class="top">
			<img src="<spring:url value="/images/logo.jpg"/>">
			<h2>Phản hồi khoá học offline 2020</h2>
				
			
		</div>
		<div class="office-form-subtitle heading-1">
				<h5>Phản hồi của bạn được đánh giá cao và sẽ giúp chúng tôi
					cải thiện hoạt động đào tạo của chúng tôi cho các khóa học tốt hơn trong tương lai.<br>Cảm ơn rất nhiều cho sự hợp tác tuyệt vời của bạn.
					<br> Lưu ý: quy mô chấm điểm là
					từ 1 (kém nhất)-5 (tốt nhất)</h5>
			</div>
	
	
	<h5>1. Tên tài khoản *</h5>
	<input type="text" name="" class="in" value="${email}" readonly>
	<h5>2. ${cauhois[0].noiDung} *</h5>
	<input type="text" name="cauhoi1"class="in">
	<h5>3. ${cauhois[1].noiDung} *</h5>
	<input type="text" name="cauhoi2" class="in">

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

	<div>

			<input type="radio" value="1" name="cauhoi10">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi10"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi10"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi10">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi10">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>12. ${cauhois[10].noiDung} *</h5>

	<div>

			<input type="radio" value="1" name="cauhoi11">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi11"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi11"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi11">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi11">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>13. ${cauhois[11].noiDung} *</h5>

	<div>

			<input type="radio" value="1" name="cauhoi12">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi12"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi12"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi12">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi12">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>14. ${cauhois[12].noiDung} *</h5>

	<div>

			<input type="radio" value="1" name="cauhoi13">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi13"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi13"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi13">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi13">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>15. ${cauhois[13].noiDung} *</h5>
		<div>

			<input type="radio" value="1" name="cauhoi14">	<label for="ratingAccessibilityLabel.8-number-rating-5">1</label> <input
				type="radio" value="2" name="cauhoi14"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">2</label><input type="radio"
				value="3" name="cauhoi14"> 	<label for="ratingAccessibilityLabel.8-number-rating-5">3</label><input type="radio" value="4"
				name="cauhoi14">	<label for="ratingAccessibilityLabel.8-number-rating-5">4</label> <input type="radio" value="5" name="cauhoi14">	<label for="ratingAccessibilityLabel.8-number-rating-5">5</label>
		</div>
	<h5>16. ${cauhois[14].noiDung} *</h5>
	<input type="radio" name="cauhoi15" value="true"> Yes
	<input type="radio" name="cauhoi15" value="false"> No
	<hr>
	<input value="${malop}" name="malop" style="display: none;">
	<button>Submit</button>

</form>

<script>
	function check() {

		for (var j=3; j<=15; j++){
			var elements = document.getElementsByName("cauhoi" + j);
			var isCheck = false;

			for (var i = 0; i<elements.length; i++){
				if (elements[i].checked === true){
					isCheck = true;
				}
			}

			if (!isCheck){
				alert('Bạn phải nhập đầy đủ!');
				return false;
			}
		}

		return true;
	}
</script>

</body>
</html>
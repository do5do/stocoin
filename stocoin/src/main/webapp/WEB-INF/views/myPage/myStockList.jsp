<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/stocoin/resources/css/myPage.css">
	<script type="text/javascript">
		$(function() {
			function logOut() {
				location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
						+ "${ss.getIP()}" + "/stocoin/logout";
			}

			// tab active control
			$('#tab1').addClass('active');
			var curUrl = window.location.href;
			var sliceUrl = curUrl.split("?")[1].split("&")[0].split("=")[1];
			$('#tab2').addClass('active');
			var curUrl = window.location.href;
			var sliceUrl = curUrl.split("?")[1].split("&")[0].split("=")[1];


			if (sliceUrl == null || sliceUrl == 1) {
				$('#tab' + sliceUrl).addClass("active");
			} else if (sliceUrl == 2) {
				$('.tabs li').removeClass('active');
				$('#tab' + sliceUrl).addClass("active");
			} else {
				$('.tabs li').removeClass('active');
				$('#tab' + sliceUrl).addClass("active");
			}
		})
	</script>
</head>
<body>
	<div class="my_assets">
			<a class="assets_name" href="/stocoin/myPage/myCoinList">코인</a>
			<a class="assets_name" href="/stocoin/myPage/myStockList">주식</a>
	</div>	
	<ul class="tabs">
		<li id="tab1">
			<a class="tab" href="/stocoin/myPage/myStockList">채결/미채결</a>
		</li>
		<li id="tab2">
			<a class="tab" href="/stocoin/myPage/stockTradeList">주식잔고</a>
		</li>		
	</ul>
	<div class="Container">
	        <table class="transaction">
	            <thead>
	              <tr>
	                <th>주문정보</th>
	                <th>주문수량</th>
	                <th>주문가격</th>
	                <th>채결수량</th>
	                <th>체결가격</th>
	                <th>원 주문번호</th>
	                <th>가격 구분</th>
	                <th>정정수량</th>
	                <th>취소수량</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td><span>매도</span><br>서울식품</td>
	                <td>1주</td>
	                <td>414원</td>
	                <td>1주</td>
	                <td>414원</td>
	                <td>-</td>
	                <td>시간외단일가</td>
	                <td>0</td>
	                <td>0</td>
	              </tr>
	              <tr>
	                <td><span>매도</span><br>삼성</td>
	                <td>1주</td>
	                <td>72900원</td>
	                <td>1주</td>
	                <td>72900원</td>
	                <td>-</td>
	                <td>보통</td>
	                <td>0</td>
	                <td>0</td>
	              </tr>
	            </tbody>
	        </table>
	    </div>
		<div class="input_box center">
			<input class="btn btn-outline-primary col-3" value="정보수정" onclick="location.href='/stocoin/member/updateForm'" />
			<input id="logout" class="btn btn-outline-primary col-3" value="로그아웃" onclick="logOut()" />
		</div>
</body>
</html>
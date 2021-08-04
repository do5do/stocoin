<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/myPage.css">
<script type="text/javascript">
	var types = 'my';
	
	$(function () {
		$('.disp').load('/stocoin/exclude2/myCoinList');
	});
	
	// 5초 간격으로 interval
	setInterval(myTimer, 5000);
	function myTimer() {
		if (types == 'my')
			$('.disp').load('/stocoin/exclude2/myCoinList');
	}

	function tab(type) {
		types = type;
		$('.disp').load('/stocoin/exclude2/'+type+'CoinList');
		$('.tabs li').removeClass('active');
		$('.' + type + 'List').addClass('active');
	}
	
	
	function logOut() {
		location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
				+ "${ss.getIP()}" + "/stocoin/logout";
	}
</script>
</head>
<body>
	<ul class="myPage_tabs">
		<li class="active"><a href="/stocoin/myPage/myCoinList">코인</a></li>
		<li><a href="/stocoin/myPage/myStockList">주식</a></li>
	</ul>
	<ul class="tabs">
		<li class="myList active"><a onclick="tab('my')">보유현황</a></li>
		<li class="tradeList"><a onclick="tab('trade')">거래내역</a></li>		
	</ul>
	<section class="disp"></section>
    
	<div class="input_box center">
		<input type="button" class="btn btn-outline-primary col-2" value="정보수정" onclick="location.href='/stocoin/member/updateForm'" />
		<input type="button" id="logout" class="btn btn-outline-primary col-2" value="로그아웃" onclick="logOut()" />
	</div>
</body>
</html>

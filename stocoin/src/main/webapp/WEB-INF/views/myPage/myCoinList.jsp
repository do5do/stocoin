<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings"
	scope="page" />
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<script type="text/javascript">
		function logOut() {
			location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
					+ "${ss.getIP()}" + "/stocoin/logout";
		}
	</script>
		<div class="container col-8 board">
		<ul class="tabs">
			<li id="1">
				<a class="tab" href="/stocoin/myPage/coinTradeList">코인 거래 내역</a>
			</li>
			<li id="2">
				<a class="tab" href="/stocoin/myPage/stockTradeList">주식 거래 내역</a>
			</li>	
			<li id="3">
				<a class="tab" href="#">문의 내역</a>
			</li>	
		</ul>
	</div>
	<div class="input_box center">
		<input class="btn btn-outline-primary col-3"
			onclick="location.href='/stocoin/member/updateForm'" value="정보수정">
		<input class="btn btn-outline-primary col-3" onclick="logOut()"
			id="logout" value="로그아웃">
	</div>
</body>
</html>
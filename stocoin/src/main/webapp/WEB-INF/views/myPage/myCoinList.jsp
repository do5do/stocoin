<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/stocoin/resources/css/myPage.css">
	<script type="text/javascript">
		function logOut() {
			location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
					+ "${ss.getIP()}" + "/stocoin/logout";
		}
		
		function tab() {
			$('.disp').load('/stocoin/exclude2/coinTradeList');
			$('.tabs li').removeClass('active');
			$('.tradeList').addClass('active');
		}
	</script>
</head>
<body>
	<ul class="myPage_tabs">
		<li class="active">
			<a href="/stocoin/myPage/myCoinList">코인</a>
		</li>
		<li>
			<a href="/stocoin/myPage/myStockList">주식</a>
		</li>
	</ul>
	<ul class="tabs">
		<li class="myList active">
			<a href="/stocoin/myPage/myCoinList">보유현황</a>
		</li>
		<li class="tradeList">
			<a onclick="tab()">거래내역</a>
		</li>		
	</ul>
	<section class="disp">
		<div class="container col-8 middle">
			<div class="total_box">
				<div class="total_top">
					<p class="money_text">총 보유자산</p>
					<p class="total_money">2,980<span> 원</span></p>
				</div>
				<div class="total_bottom display_flex">
					<div class="left">
						<p>총 수익률</p>
						<p>총 매수금액</p>
					</div>
					<div class="right">
						<p>+3.6%</p>
						<p>2,980원</p>
					</div>
				</div>
			</div>
			<ul class="card_list">
				<li class="card_item">
					<div class="content display_flex">
						<p class="name">도지 (DOGE)</p>
						<div class="right">
							<p class="end_price">832 원</p>
							<span class="time">전일대비</span> 
							<span class="color_blue">-4.16%</span>
						</div>
					</div>
					<div class="content_body display_flex">
						<div class="left">
							<p>평가손익</p>
							<p>수익률</p>
							<p>보유잔고</p>
							<p>평균금액</p>
							<p>매수금액</p>
							<p>평가금액</p>
						</div>
						<div class="right">
							<p>-168원</p>
							<p>+1.28%</p>
							<p>3.592 <span>DOGE</span></p>
							<p>834원</p>
							<p>834원</p>
							<p>832원</p>
						</div>
					</div>
				</li>
			</ul>
		</div>
    </section>
	<div class="input_box center">
		<input type="button" class="btn btn-outline-primary col-2" value="정보수정" onclick="location.href='/stocoin/member/updateForm'" />
		<input type="button" id="logout" class="btn btn-outline-primary col-2" value="로그아웃" onclick="logOut()" />
	</div>
</body>
</html>

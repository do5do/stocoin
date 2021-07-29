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
			var sliceUrl = curUrl.slice(37);
			$('.tabs li').removeClass('active');
			$('#' + sliceUrl).addClass("active");
			$('#tab2').addClass('active');

		})
	</script>
</head>
<body>
<div class="container col-8 middle">
		<div class="my_assets">
			<a class="assets_name" href="/stocoin/myPage/myCoinList">코인</a>
			<a class="assets_name" href="/stocoin/myPage/myStockList">주식</a>
		</div>	
		<ul class="tabs">
			<li id="tab1">
				<a class="tab" href="/stocoin/myPage/myCoinList">거래내역</a>
			</li>
			<li id="tab2">
				<a class="tab" href="/stocoin/myPage/coinTradeList">보유현황</a>
			</li>		
		</ul>
		<div class="TotalBox">
			<table class="Total-table">
				<colgroup>
					<col width="">
					<col width="20%">
					<col width="15%">
					<col width="20%">
					<col width="15%">
				</colgroup>
				<tbody>
					<tr>
						<td rowspan="2" class="fir-td">
							<p class="total-text">총 보유자산</p>
							<p class="total-number">2,956 <small>원</small>
							</p>
						</td>
						<td>-총 수익률</td>
						<td class="num">-1.24%</td>
						<td>-총 매수금액</td>
						<td class="num">2,992원</td>
					</tr>
					<tr>
						<td>-총 수익률</td>
						<td class="num">-1.24%</td>
						<td>-총 매수금액</td>
						<td class="num">2,992원</td>
					</tr>
				</tbody>
			</table>
		</div>
	<div class="TotalBox">
		<div class="card-wrap">
			<ul class="card-list">
				<li class="card-item">
					<div class="coin_content_assets display_flex">
						<p class="coin_name">도지(DOGE)</p>
						<div class="coin_content_header_right right">
							<p>832원</p>
							<span class="assets_coin_time">전일대비</span> 
							<span class="assets_coin_percent_color">-4.16%</span>
						</div>
					</div>
					<div class="coin_content_body display_flex">
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
							<p>1.28%</p>
							<p>3.592 <span>DOGE</span></p>
							<p>834원</p>
							<p>834원</p>
							<p>832원</p>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
</div>
<div class="input_box center">
	<input class="btn btn-outline-primary col-3" value="정보수정" onclick="location.href='/stocoin/member/updateForm'"/>
	<input id="logout" class="btn btn-outline-primary col-3" value="로그아웃" onclick="logOut()" />
</div>
</body>
</html>
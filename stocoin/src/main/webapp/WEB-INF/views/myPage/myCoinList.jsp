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
		$(function() {
			// tab active control
			$('#tab1').addClass('active');
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
			<a class="tab" href="/stocoin/myPage/myCoinList">거래내역</a>
		</li>
		<li id="tab2">
			<a class="tab" href="/stocoin/myPage/coinTradeList">보유현황</a>
		</li>		
	</ul>
	<div class="Container">
	        <table class="transaction">
	            <thead>
	              <tr>
	                <th>거래일시</th>
	                <th>자산</th>
	                <th>거래구분</th>
	                <th>거래수량</th>
	                <th>체결가격</th>
	                <th>거래금액</th>
	                <th>수수료</th>
	                <th>정산금액</th>
	                <th>상태</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td>2021-07-01 17:05:04</td>
	                <td>리플 XRP/KRW</td>
	                <td>매수</td>
	                <td>3.8876 XRP</td>
	                <td>769.5</td>
	                <td>2.992 KRW</td>
	                <td>7.48</td>
	                <td>-2.999 KRW</td>
	                <td></td>
	              </tr>
	              <tr>
	                <td>2021-07-01 17:05:04</td>
	                <td>리플 XRP/KRW</td>
	                <td>매수</td>
	                <td>3.8876 XRP</td>
	                <td>769.5</td>
	                <td>2.992 KRW</td>
	                <td>7.48</td>
	                <td>-2.999 KRW</td>
	                <td></td>
	              </tr>
	            </tbody>
	        </table>
	    </div>
		<div class="input_box center">
			<input type="button" class="btn btn-outline-primary col-3" value="정보수정" onclick="location.href='/stocoin/member/updateForm'" />
			<input type="button" id="logout" class="btn btn-outline-primary col-3" value="로그아웃" onclick="logOut()" />
		</div>
</body>
</html>

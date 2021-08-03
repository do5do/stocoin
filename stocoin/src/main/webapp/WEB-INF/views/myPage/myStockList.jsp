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
		function logOut() {
			location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
					+ "${ss.getIP()}" + "/stocoin/logout";
		}
		
		function tab() {
			$('.disp').load('/stocoin/exclude2/stockTradeList');
			$('.tabs li').removeClass('active');
			$('.tradeList').addClass('active');
		}
	</script>
</head>
<body>
	<ul class="myPage_tabs">
		<li>
			<a href="/stocoin/myPage/myCoinList">코인</a>
		</li>
		<li class="active">
			<a href="/stocoin/myPage/myStockList">주식</a>
		</li>
	</ul>
	<ul class="tabs">
		<li class="myList active">
			<a href="/stocoin/myPage/myStockList">보유현황</a>
		</li>
		<li class="tradeList">
			<a onclick="tab()">거래내역</a>
		</li>		
	</ul>
	<section class="disp">
		<div class="container col-8 middle">
			<div class="total_box">
				<div class="total_top">
					<p class="money_text">총 추정자산</p><!-- 총 매입금액 + 총 평가손익 + 예수금 -->
					<p class="totalMoney"></p><span> 원</span>
				</div>
				<div class="total_bottom display_flex">
					<div class="left">
						<p>총 수익률</p>
						<p>총 매입금액</p>
						<p>총 평가손익</p>
						<p>총 평가금</p><!-- 총 매입금액 + 총 평가손익 -->
						<p>예수금</p><!-- 내가 가진 현금 -->
					</div>
					<div class="right">
						<div class="totalRate"><p></p><span>%</span></div>
						<p class="totalPurchase"></p>
						<div class="totalGain"><p></p><span>원</span></div>
						<p class="evaluation"></p>
						<p><fmt:formatNumber value="${stockMoney }"></fmt:formatNumber>원</p>
					</div>
				</div>
			</div>
			<ul class="card_list">
				<c:forEach var="myStock" items="${list }">
					<li class="card_item">
						<div class="content display_flex">
							<p class="name">${myStock.get("sname") }</p>
							<div class="right">
								<p class="end_price"><fmt:formatNumber value="${myStock.purchase }"></fmt:formatNumber>원</p>
								<span class="time">등락률</span>
								<c:if test="${myStock.get('fluc_rt')+0 > 0 }">
									<span class="color_red">+${myStock.get('fluc_rt')}%</span>
								</c:if>
								<c:if test="${myStock.get('fluc_rt')+0 < 0 }">
									<span class="color_blue">${myStock.get('fluc_rt')}%</span>
								</c:if>
							</div>
						</div>
						<div class="content_body display_flex">
							<div class="left">
								<p>보유잔고</p><!-- 가진 주 개수 -->
								<p>매매단가</p><!-- 내가 산 종가의 평균(체결가 평균) -->
								<p>현재가</p><!-- 현재 종가 -->
								<p>평가손익</p><!-- 평가금액 - 매입금액 -->
								<p>수익률</p><!-- (평가손익 / 매입금액) * 100 or ((현재가 - 매매단가) / 매매단가) * 100  -->
								<p>매입금액</p><!-- 매매단가 * 수량(잔고) -->
								<p>평가금액</p><!-- 현재가 * 수량(잔고) -->
							</div>
							<div class="right">
								<!-- 보유잔고 -->
								<p>${myStock.cnt }주</p>
								<!-- 매매단가 -->
								<p><fmt:formatNumber value="${myStock.get('contractAvg')}"></fmt:formatNumber>원</p>
								<!-- 현재가 -->
								<p><fmt:formatNumber value="${myStock.get('recentPrice')}"></fmt:formatNumber>원</p>
								<!-- 평가손익 -->
								<p class="gain"><fmt:formatNumber value="${(myStock[key='recentPrice'] * myStock.cnt) - (myStock[key='contractAvg'] * myStock.cnt)}"></fmt:formatNumber><span>원</span></p>
								<!-- 수익률 -->
								<p class="rate"><fmt:formatNumber value="${((myStock[key='recentPrice'] - myStock[key='contractAvg']) / myStock[key='contractAvg']) * 100 }" pattern="0.00"></fmt:formatNumber><span>%</span></p>									
								<!-- 매입금액 -->
								<p class="purchase"><fmt:formatNumber value="${myStock.get('contractAvg') * myStock.cnt}"></fmt:formatNumber>원</p>
								<!-- 평가금액 -->
								<p><fmt:formatNumber value="${myStock.get('recentPrice') * myStock.cnt}"></fmt:formatNumber>원</p>
							</div>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
    </section>
	<div class="input_box center">
		<input type="button" class="btn btn-outline-primary col-2" value="정보수정" onclick="location.href='/stocoin/member/updateForm'" />
		<input type="button" id="logout" class="btn btn-outline-primary col-2" value="로그아웃" onclick="logOut()" />
	</div>
</body>
<script type="text/javascript">
	//총 매입금액
	var purchase = document.querySelectorAll('.purchase');
	//총 평가손익
	var gain = document.querySelectorAll('.gain');
	//총 수익률
	var rate = document.querySelectorAll('.rate');
	// 예수금
	var stockMoney = ${stockMoney};
	
	var len = purchase.length;
	var totalPurchase = 0;
	var totalGain = 0;
	var totalRate = 0;
	
	// sum
	for (var i = 0; i < len; i++) {
		var intPurchase = parseInt(purchase[i].innerText.split('원')[0].replaceAll(",", ""));
		var intGain = parseInt(gain[i].innerText.replaceAll(",", ""));
		var intRate = parseInt(rate[i].innerText.replaceAll(",", ""));
		
		totalPurchase += intPurchase;
		totalGain += intGain;
		totalRate += intRate;
	}
	
	// put
	var replaceTotalPurchase = totalPurchase.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
	var replaceTotalGain = totalGain.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
	var replaceTotalRate = totalRate.toFixed(2); // 소수점 2자리로 고정
	
	$('.totalPurchase').text(replaceTotalPurchase);
	$('.totalGain p').text(replaceTotalGain);
	$('.totalRate p').text(replaceTotalRate);
	
	// 총 평가금
	var evaluation = totalPurchase + totalGain;
	var replaceEvaluation = evaluation.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
	$('.evaluation').text(replaceEvaluation);
	
	// 총 추정자산
	var totalMoney = totalPurchase + totalGain + stockMoney;
	var replaceTotalMoney = totalMoney.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
	$('.totalMoney').text(replaceTotalMoney);
	
	// color setting
	changeColor("totalRate");
	changeColor("totalGain");
	changeColor("rate");
	changeColor("gain");
	
	// color function
	function changeColor(name) {
		var names = document.querySelectorAll("."+name);
		console.log(names.length);
		console.log(name);
		for (var i = 0; i < names.length; i++) {
			console.log(names[i]);
			var value = parseFloat(names[i].innerText.replaceAll(",", ""));
			console.log(value);
			if (value > 0) {
				names[i].classList.add("color_red");
			} else if (value < 0) {
				names[i].classList.add("color_blue");
			}
		}
		
	}
</script>
</html>

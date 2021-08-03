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
			$('.disp').load('/stocoin/exclude2/coinTradeList');
			$('.tabs li').removeClass('active');
			$('.tradeList').addClass('active');
		}
	</script>
</head>
<body>
	<ul class="myPage_tabs">
		<li class="active"><a href="/stocoin/myPage/myCoinList">코인</a></li>
		<li><a href="/stocoin/myPage/myStockList">주식</a></li>
	</ul>
	<ul class="tabs">
		<li class="myList active"><a href="/stocoin/myPage/myCoinList">보유현황</a></li>
		<li class="tradeList"><a onclick="tab()">거래내역</a></li>		
	</ul>
	<section class="disp">
		<!-- 총 자산 -->
		<div class="container col-8 middle">
			<div class="total_box">
				<div class="total_top">
					<p class="money_text">총 보유자산</p><!-- 총 매입금액 + 총 평가손익 + 예수금 -->
					<p class="totalMoney"></p><span> 원</span>
				</div>
				<div class="total_bottom display_flex">
					<div class="left">
						<p>총 수익률</p>
						<p>총 평가손익</p>
						<p>총 매수금액</p>
						<p>총 평가금</p><!-- 총 매수금액 + 총 평가손익 -->
						<p>보유 원화</p><!-- 내가 가진 현금 -->
					</div>
					<div class="right">
						<p class="totalRate"></p>
						<p class="totalGain"></p>
						<p class="totalPurchase"></p>
						<p class="evaluation"></p>
						<p><fmt:formatNumber value="${coinMoney}"></fmt:formatNumber>원</p>
					</div>
				</div>
			</div>
			
			<!-- 코인 별 자산 -->
			<ul class="card_list">
				<c:forEach var="myCoin" items="${list}">
					<li class="card_item">
						<div class="content display_flex">
							<p class="name">${myCoin.cname}</p>
							<div class="right">
								<c:if test="${myCoin.fluc_rt + 0 > 0 }">
									<p class="end_price color_red"><fmt:formatNumber value="${myCoin.closing_price}"></fmt:formatNumber>원</p>
									<span class="time">등락률</span>
									<span class="color_red">+${myCoin.fluc_rt}%</span>
								</c:if>
								<c:if test="${myCoin.fluc_rt + 0 < 0 }">
									<p class="end_price color_blue"><fmt:formatNumber value="${myCoin.closing_price}"></fmt:formatNumber>원</p>
									<span class="time">등락률</span>
									<span class="color_blue">${myCoin.fluc_rt}%</span>
								</c:if>
							</div>
						</div>
						
						<div class="content_body display_flex">
							<div class="left">
								<p>수익률</p><!-- (평가손익 / 매수금액) * 100 or ((현재가 - 매매단가) / 매매단가) * 100  -->
								<p>평가손익</p><!-- 평가금액 - 매입금액 -->
								<p>보유잔고</p><!-- 보유 개수 -->
								<p>평균매수가</p><!-- 내가 산 종가의 평균(체결가 평균) -->
								<p>매수금액</p><!-- 평균매수가 * 수량(잔고) -->
								<p>평가금액</p><!-- 현재가 * 수량(잔고) -->
							</div>
							<div class="right">
								<!-- 수익률 -->
								<p class="rate"><fmt:formatNumber value="${((myCoin.closing_price - myCoin.contractAvg) / myCoin.contractAvg) * 100 }" pattern="0.00"></fmt:formatNumber>%</p>									
								<!-- 평가손익 -->
								<p class="gain"><fmt:formatNumber  value="${(myCoin.closing_price * myCoin.cnt) - (myCoin.contractAvg * myCoin.cnt)}"></fmt:formatNumber>원</p>
								<!-- 보유잔고 -->
								<p>${myCoin.cnt} <span class="color_gray">${myCoin.cname}</span></p>
								<!-- 평균매수가 -->
								<p><fmt:formatNumber value="${myCoin.contractAvg}"></fmt:formatNumber>원</p>
								<!-- 매수금액 -->
								<p class="purchase"><fmt:formatNumber value="${myCoin.contractAvg * myCoin.cnt}"></fmt:formatNumber>원</p>
								<!-- 평가금액 -->
								<p><fmt:formatNumber value="${myCoin.closing_price * myCoin.cnt}"></fmt:formatNumber>원</p>
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
	// 매입금액
	var purchase = document.querySelectorAll('.purchase');
	// 평가손익
	var gain = document.querySelectorAll('.gain');
	// 보유원화
	var coinMoney = ${coinMoney};
	
	var len = purchase.length;
	var totalPurchase = 0;
	var totalGain = 0;
	var totalRate = 0;
	
	// sum
	for (var i = 0; i < len; i++) {
		var intPurchase = parseInt(purchase[i].innerText.split('원')[0].replaceAll(",", ""));
		var intGain = parseInt(gain[i].innerText.split('원')[0].replaceAll(",", ""));
		
		totalPurchase += intPurchase;
		totalGain += intGain;
	}
	totalRate = (totalGain/totalPurchase) * 100;
	
	// put
	var replaceTotalPurchase = totalPurchase.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
	var replaceTotalGain = totalGain.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
	var replaceTotalRate = totalRate.toFixed(2)+"%"; // 소수점 2자리로 고정
	
	$('.totalPurchase').text(replaceTotalPurchase);
	$('.totalGain').text(replaceTotalGain);
	$('.totalRate').text(replaceTotalRate);
	
	// 총 평가금
	var evaluation = totalPurchase + totalGain;
	var replaceEvaluation = evaluation.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
	$('.evaluation').text(replaceEvaluation);
	
	// 총 보유자산
	var totalMoney = totalPurchase + totalGain + coinMoney;
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
		for (var i = 0; i < names.length; i++) {
			var value = parseFloat(names[i].innerText.slice(0,-1).replaceAll(",", ""));
			console.log(name[i] + " : " + value);
			if (value > 0) {
				names[i].classList.add("color_red");
			} else if (value < 0) {
				names[i].classList.add("color_blue");
			}
		}
		
	}
</script>
</html>

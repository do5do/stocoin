<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container col-8 middle">
	<!-- 총 자산 -->
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
					<div>
						<p class="name">${myCoin.cname_ko}</p>
						<span class="color_gray">(${myCoin.cname})</span>
					</div>
					<div class="right">
						<c:if test="${myCoin.fluc_rt + 0 > 0 }">
							<p class="end_price color_red"><fmt:formatNumber value="${myCoin.closing_price}"></fmt:formatNumber>원</p>
							<span class="time">등락률</span>
							<span class="color_red">+${myCoin.fluc_rt}%</span>
						</c:if>
						<c:if test="${myCoin.fluc_rt + 0 == 0 }">
							<p class="end_price"><fmt:formatNumber value="${myCoin.closing_price}"></fmt:formatNumber>원</p>
							<span class="time">등락률</span>
							<span>${myCoin.fluc_rt}%</span>
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
						<c:set var="valuation" value="${myCoin.closing_price * myCoin.cnt}"></c:set>
						<c:set var="purchase" value="${myCoin.contractAvg * myCoin.cnt}"></c:set>
						<c:set var="gain" value="${valuation - purchase}"></c:set>
						<c:set var="rate" value="${(gain / purchase) * 100 }"></c:set>
						<!-- 수익률 -->
						<c:if test="${rate >= 0}">
							<p class="rate">+<fmt:formatNumber value="${rate}" pattern="0.00"></fmt:formatNumber>%</p>									
						</c:if>
						<c:if test="${rate < 0}">
							<p class="rate"><fmt:formatNumber value="${rate}" pattern="0.00"></fmt:formatNumber>%</p>									
						</c:if>
						<!-- 평가손익 -->
						<c:if test="${gain >= 0}">
							<p class="gain">+<fmt:formatNumber value="${gain}" pattern="#,###"></fmt:formatNumber>원</p>									
						</c:if>
						<c:if test="${gain < 0}">
							<p class="gain"><fmt:formatNumber value="${gain}" pattern="#,###"></fmt:formatNumber>원</p>									
						</c:if>
						<!-- 보유잔고 -->
						<p>${myCoin.cnt} <span class="color_gray">${myCoin.cname}</span></p>
						<!-- 평균매수가 -->
						<p><fmt:formatNumber value="${myCoin.contractAvg}"></fmt:formatNumber>원</p>
						<!-- 매수금액 -->
						<p class="purchase"><fmt:formatNumber value="${purchase}" pattern="#,###"></fmt:formatNumber>원</p>
						<!-- 평가금액 -->
						<p><fmt:formatNumber value="${valuation}" pattern="#,###"></fmt:formatNumber>원</p>
					</div>
				</div>
			</li>
		</c:forEach>
	</ul>
</div>
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
	if (totalGain > 0) {
		$('.totalGain').text("+" + replaceTotalGain);
	} else {
		$('.totalGain').text(replaceTotalGain);
	}
	
	if (isNaN(totalRate)) {
		$('.totalRate').text('0.00%');
	} else {
		if (totalRate > 0) {
			$('.totalRate').text("+" + replaceTotalRate);
		} else {
			$('.totalRate').text(replaceTotalRate);
		}
	}
	
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
			if (value > 0) {
				names[i].classList.add("color_red");
			} else if (value < 0) {
				names[i].classList.add("color_blue");
			}
		}
		
	}
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript">
	// 종가
	var endPrice = '${stockInfo.get("TDD_CLSPRC")}';
	var intEndPrice = endPrice.replace(/,/g, ""); // 천단위 마다 콤마 삭제
	// 현재 가진 돈
	var myMoney = parseInt("${member.stock_money }");
	if (isNaN(myMoney)) {
		$('.myMoney').text('0원');
		myMoney = 0;
	}
	// 최대 수량
	var maxNum = Math.floor(myMoney / intEndPrice);
	// 매수/매도 타입 구별
	var types = 1;
	
	// count
	function count(item) {
		if (${empty id}) {
			alert('로그인이 필요합니다.');
		} else {
			var stat = $(".cnt_box span").text();
			var num = parseInt(stat);
			
			if (item == 'minus') { // 수량 감소
				num -= 1;
				// 주문 금액
				var payPrice = intEndPrice * num;
				
				if (num < 0) {
					num = 0;
					payPrice = intEndPrice * num;
					alert('최저 수량입니다.');
				}
			} else { // 수량 증가
				num += 1;
				// 주문 금액
				var payPrice = intEndPrice * num;
				
				if (types == 1) {
					if (payPrice >= myMoney) {
						num = maxNum;
						payPrice = intEndPrice * num;
						alert('최고 수량입니다.');
					}
				} else { // 매도
					var myCnt = parseInt($('.myMoney').text().split('주')[0]);
					if (num > myCnt) {
						num = myCnt;
						payPrice = intEndPrice * num;
						alert('최고 수량입니다.');
					}
				}
				
			}
			// 천단위 콤마 추가
			var replacePayPrice = payPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
			
			$(".cnt_box span").text(num);
			$("input[name='cnt']").val(num);
			$(".fee").val(num+"주");
			$(".pay_price").text(replacePayPrice);
		}
	}
	
	// 수량 직접 입력 시
	function changeVal() {
		if (${empty id}) {
			alert('로그인이 필요합니다.');
			$(".fee").val("");
		} else {
			var num = parseInt($('.fee').val());
			var payPrice = num * intEndPrice;
			
			// Nan check
			if (isNaN(num)) {
				num = 0;
				payPrice = 0;
			}
			
			if (types == 1) {
				if (num > maxNum) {
					num = maxNum;
					payPrice = num * intEndPrice;
					$(".fee").val(num);
					alert('거래 가능한 최대 수량을 초과하였습니다.');
				}
			} else {
				var myCnt = parseInt($('.myMoney').text().split('주')[0]);
				if (num > myCnt) {
					num = myCnt;
					payPrice = intEndPrice * num;
					alert('최고 수량입니다.');
				}
			}
			
			// 천단위 콤마 추가
			var replacePayPrice = payPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원";
			
			if ($(".fee").val() == "") {
				$(".cnt_box span").text(0);
				$("input[name='cnt']").val(0);
				$(".pay_price").text('0원');
			} else {				
				$(".cnt_box span").text(num);
				$("input[name='cnt']").val(num);
				$(".fee").val(num+"주");
				$(".pay_price").text(replacePayPrice);
			}
		}
	}
	
	// tab
	function tradeTab(item) {
		if (item == 'sell') {
			types = 2;
			$('#sell').addClass('blue');
			$('#buy').removeClass('red');
			
			if (${not empty id}) {
				if (isNaN(${cnt})) {
					$('.myMoney').text('0주');
				} else {
					$('.myMoney').text('${cnt}주');					
				}
			}
		} else {
			types = 1;
			$('#buy').addClass('red');
			$('#sell').removeClass('blue');
			
			if (${not empty id}) {	
				$('.myMoney').text(myMoney.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")+"원");					
			}
		}
		// 초기화
		$(".pay_price").text("0원");
		$(".cnt_box span").text("0");
		$(".fee").val("");
	}
	
	// trade submit
	function trade() {
		if (${empty id}) {
			alert('로그인이 필요합니다.');
		} else {
			if ($(".fee").val() == "") {
				alert("최소 수량을 입력해주세요.");
				return false;
			} else if ($('.myMoney').text().slice(0, 1) == '0') {
				alert("주문가능한 금액이 부족합니다.");
				return false;
			} else {
				document.frm.action = "/stocoin/stock/tradeStock?types="+types+"&contract="+intEndPrice+"&code=${stockInfo.get('ISU_SRT_CD')}";
			}
		}
	}
	
	// 재무제표
	function fState(corp_code) {
		var link = "/stocoin/exclude/financialStatement/code/" + corp_code;
		window.open(link, "fState", "width=1100,height=900");
	}
</script>
<!-- 주식 정보 section -->
<section id="info" class="col-5">
	<div id="coinInfo">
		<c:if test="${stockInfo.get('FLUC_RT') + 0 >= 0 }">
			<h4 class="color_red">
				${stockInfo.get('TDD_CLSPRC')}
				<span class="text-sm color_red">+${stockInfo.get('FLUC_RT')}%</span>
			</h4>
		</c:if>
		<c:if test="${stockInfo.get('FLUC_RT') + 0 < 0 }">
			<h4 class="color_blue">
				${stockInfo.get('TDD_CLSPRC')}
				<span class="text-sm color_blue">${stockInfo.get('FLUC_RT')}%</span>
			</h4>
		</c:if>
		<table>
			<tr>
				<td class="col-3">거래량(24H)</td>
				<td class="col-3">${stockInfo.get('ACC_TRDVOL')}</td>
				<td class="col-3">고가(당일)</td>
				<td class="col-3">${stockInfo.get('TDD_HGPRC')}</td>
			</tr>
			<tr>
				<td>거래금액(24H)</td>
				<td>
					<fmt:formatNumber value="${stockInfo.get('trade_price') / 1000000}" pattern="#,###"></fmt:formatNumber>
					<span class="color_gray">백만</span>
				</td>
				<td>저가(당일)</td>
				<td>${stockInfo.get('TDD_LWPRC')}</td>
			</tr>
			<tr>
				<td>전일종가</td>
				<td>${stockInfo.get('TDD_CLSPRC')}</td>
				<td colspan="2"><button class="btn btn-primary btn-sm"onclick="fState('${stockInfo.get('corp_code')}')">재무제표</button></td>
			</tr>
		</table>
		<div id="chart_sm"></div>
	</div>
</section>
<!-- 매수, 매도 -->
<section class="trade col-7">
	<form action="" method="post" name="frm" onsubmit="return trade()">
		<!-- 엔터키 전송 막기 -->
		<div style="display:none">
			<input type="submit" onclick="return false"/>
			<input type="text"/>
		</div>
		<ul class="trade_tab">
			<li class="red" id="buy" onclick="tradeTab('buy')">매수</li>
			<li id="sell" onclick="tradeTab('sell')">매도</li>
		</ul>
		<div class="trade_detail">
			<div class="left">
				<p>주문가능</p>
				<p>주문가격</p>
				<p>주문수량</p>
				<p>주문금액</p>
			</div>
			<div class="right">
				<c:if test="${empty id }">
					<p class="myMoney">0원</p>
				</c:if>
				<c:if test="${not empty id }">
					<p class="myMoney"><fmt:formatNumber value="${member.stock_money }" pattern="#,###"></fmt:formatNumber>원</p>
				</c:if>
				<!-- 종가 -->
				<p class="end_price">${stockInfo.get("TDD_CLSPRC")}원</p>
				<div class="fee_box">
					<!-- 수량 -->
					<input type="text" placeholder="0주" class="fee" onchange="changeVal()">
					<div class="cnt_box">
						<div class="line_box minus" onclick="count('minus')">
							<div class="line"></div>
						</div>
						<span>0</span>
						<div class="line_box plus" onclick="count('plus')">
							<div class="line"><div class="line vertical"></div></div>
						</div>
					</div>
				</div>
				<input type="hidden" name="cnt" value="0">
				<input type="hidden" name="sname" value="${stockInfo.get('ISU_ABBRV') }">
				<!-- 주문 금액 -->
				<p class="pay_price">0원</p>
			</div>
		</div>
		<div class="input_box">
			<c:if test="${empty id }">
				<input type="submit" value="로그인" class="btn btn-primary col-12">
			</c:if>
			<c:if test="${not empty id }">
				<input type="submit" value="확인" class="btn btn-primary col-12">
			</c:if>
		</div>
	</form>
</section>
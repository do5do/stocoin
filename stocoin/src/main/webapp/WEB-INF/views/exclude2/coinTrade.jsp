<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
	var count = Number('${cnt}');
	var coin_money = Number('${coin_money}');
	var closing_price = Number("${closing_price}");
	var max_cnt = Math.floor(coin_money/closing_price*10000) / 10000;
	var max_price = Math.floor(max_cnt * closing_price);
	var types = 1;
	
	//tab
	function trade_tab(type) {
		if (type == 1) {
			types = 1;
			$('#buy').addClass('red');
			$('#sell').removeClass('blue');
			$('.orderable').text(coin_money.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",") + "원");
		} else {
			types = 2;
			$('#sell').addClass('blue');
			$('#buy').removeClass('red');
			$('.orderable').text(count + " ${name}");
		}
		$('#types').val(types);
		$('#cnt_txt').val('');
		$('#range').val('0');
		$('#purchase').val('');
		$('#cnt_txt').blur();
		$('#purchase').blur();
		change_range();
	}
	
	function typeChk(change) {
		if (${empty id}) {
			alert('로그인이 필요합니다.');
			$('#cnt_txt').val('0');
			$('#range').val('0');
			$('#purchase').val('0');
			$('#cnt_txt').blur();
			$('#purchase').blur();
		} else {
			if (change == 'cnt') {
				var val = event.target.value;
				var val_float = val.split('.')[1].length;
				if (val_float >= 5) {
					alert("소수점 넷째자리까지만 입력가능합니다");
					$('#cnt_txt').val(val.slice(0,-1));
					$('#cnt_txt').blur();
					return false;
				}
				change_op();
			} else if (change == 'range') {
				change_range();
				change_cnt('range');
			} else if (change == 'purchase') {
				change_cnt('purchase');
			}
		}
	}
	
	// trade submit
	function trade() {
		if (${empty id}) {
			alert('로그인이 필요합니다.');
			return false;
		} else {
			if ($('#purchase').val() < 500) {
				alert('최소 주문금액은 500원 입니다');
				return false;
			} else {
				document.frm.action = "/stocoin/coin/tradeCoin";
			}
		}
	}
</script>

<form method="post" name="frm">
	<ul class="trade_tab">
		<li class="red" id="buy" onclick="trade_tab(1)">매수</li>
		<li id="sell" onclick="trade_tab(2)">매도</li>
	</ul>
	<div class="trade_detail">
		<div class="left">
			<p>주문가능</p>
			<p>주문가격</p>
			<p>주문수량</p>
			<p>주문금액</p>
		</div>
		<div class="right">
			<input type="hidden" name="types" id="types" value="1">
			<input type="hidden" name="cname" value="${name}">
			<input type="hidden" name="cname_ko" value="${cname_ko}">
			<c:if test="${empty id }">
				<p class="orderable">0원</p>
			</c:if>
			<fmt:formatNumber var="myMoney" value="${coin_money}" pattern="#,###"></fmt:formatNumber>
			<c:if test="${not empty id }">
				<p class="orderable">${myMoney}원</p>
			</c:if>
			
			<div id="closing_price">
				<input type="number" name="contract" value="${closing_price}" readonly>
				<span class="color_gray">원</span>
			</div>
			
			<div id="cnt">
				<input type="number" name="cnt" id="cnt_txt" placeholder="0" step="0.0001" min="0.0001" onkeyUp="return typeChk('cnt');">
				<span class="color_gray">${name}</span>
				<input type="range" id="range" value="0" min="0" max="100" step="10" onmouseup="typeChk('range');">
				<span><span id="range_percent">0</span>%</span>
			</div>

			<div>
				<input type="number" name="purchase" id="purchase" placeholder="0" onkeyUp="typeChk('purchase');">
				<span class="color_gray">원</span>
			</div>
		</div>
	</div>
	
	<div class="input_box">
		<c:if test="${empty id }">
			<input type="submit" value="로그인" class="btn btn-primary col-12" onclick="return trade()">
		</c:if>
		<c:if test="${not empty id }">
			<input type="submit" value="확인" class="btn btn-primary col-12" onclick="return trade()">
		</c:if>
	</div>
</form>
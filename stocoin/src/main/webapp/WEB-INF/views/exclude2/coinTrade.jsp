<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
	var coin_money = Number('${coin_money}');
	var closing_price = Number('${closing_price}');
	var max_cnt = Math.floor(coin_money/closing_price * 10000) / 10000;
	var max_price = Math.floor(max_cnt * closing_price);

	//tab
	function tab(item) {
		if (item == 'sell') {
			$('#sell').addClass('blue');
			$('#buy').removeClass('red');
		} else {
			$('#buy').addClass('red');
			$('#sell').removeClass('blue');
		}
	}
</script>

<form action="" method="post" name="frm">
	<ul class="trade_tab">
		<li class="red" id="buy" onclick="tab('buy')">매수</li>
		<li id="sell" onclick="tab('sell')">매도</li>
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
				<p>0원</p>
			</c:if>
			<c:if test="${not empty id }">
				<p><fmt:formatNumber value="${coin_money}" pattern="#,###"></fmt:formatNumber>원</p>
			</c:if>
			
			<div id="closing_price">
				<fmt:formatNumber var="contract" value="${closing_price}"></fmt:formatNumber>
				<input type="text" name="contract" value="${contract}" readonly> <span class="color_gray">원</span>
			</div>
			
			<div id="cnt">
				<input type="number" name="cnt" value="0" id="cnt_txt" step="0.0001" onkeyUp="change_op();"> <span class="color_gray">KRW</span>
				<input type="range" min="0" max="100" step="10" value="0" id="range" onmouseup="change_range(); change_cnt('range'); change_op();">
				<span><span id="range_percent">0</span>%</span>
			</div>

			<div>
				<input type="number" value="0" name="purchase" id="purchase" onkeyUp="change_cnt('purchase');"> <span class="color_gray">원</span>
			</div>
		</div>
	</div>
	<div class="input_box">
		<c:if test="${empty id }">
			<input type="button" value="로그인" class="btn btn-primary col-12" onclick="trade()">
		</c:if>
		<c:if test="${not empty id }">
			<input type="button" value="확인" class="btn btn-primary col-12" onclick="trade()">
		</c:if>
	</div>
</form>
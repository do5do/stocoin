<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:if test="${coinInfo.get('fluctate_rate_24H') + 0 >= 0 }">
	<h4 class="color_red">
		<fmt:formatNumber value="${coinInfo.get('closing_price')}"></fmt:formatNumber>
		<span class="text-sm color_red">+${coinInfo.get('fluctate_rate_24H')}%</span>
	</h4>
</c:if>
<c:if test="${coinInfo.get('fluctate_rate_24H') + 0 < 0 }">
	<h4 class="color_blue">
		<fmt:formatNumber value="${coinInfo.get('closing_price')}"></fmt:formatNumber>
		<span class="text-sm color_blue">${coinInfo.get('fluctate_rate_24H')}%</span>
	</h4>
</c:if>
<table>
	<tr>
		<td class="col-3">거래량(24H)</td>
		<td class="col-3">
			<fmt:formatNumber value="${coinInfo.get('units_traded_24H')}"></fmt:formatNumber>
		</td>
		<td class="col-3">고가(당일)</td>
		<td class="col-3">
			<fmt:formatNumber value="${coinInfo.get('max_price')}"></fmt:formatNumber>
		</td>
	</tr>
	<tr>
		<td>거래금액(24H)</td>
		<td>
			<fmt:formatNumber value="${coinInfo.get('acc_trade_value_24H') / 1000000}" pattern="#,###"></fmt:formatNumber>
			<span class="color_gray">백만</span>
		</td>
		<td>저가(당일)</td>
		<td><fmt:formatNumber value="${coinInfo.get('min_price')}"></fmt:formatNumber></td>
	</tr>
	<tr>
		<td>전일종가</td>
		<td><fmt:formatNumber value="${coinInfo.get('prev_closing_price')}"></fmt:formatNumber></td>
		<td></td>
		<td></td>
	</tr>
</table>

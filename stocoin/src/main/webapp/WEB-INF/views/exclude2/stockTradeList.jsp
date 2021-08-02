<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<table class="table">
    <thead>
		<tr>
			<th>거래일시</th>
			<th>종목명</th>
			<th>거래구분</th>
			<th>거래수량</th>
			<th>체결가격</th>
			<th>거래금액</th>
		</tr>
    </thead>
    <tbody>
		<c:forEach var="trade" items="${list }">
			<tr>
				<td>${trade.dates }</td>
				<td>${trade.sname }</td>
				<c:if test="${trade.types == 1 }">
					<td class="color_red">매수</td>
				</c:if>
				<c:if test="${trade.types == 2 }">
					<td class="color_blue">매도</td>
				</c:if>
				<td>${trade.cnt }주</td>
				<td><fmt:formatNumber value="${trade.contract}"></fmt:formatNumber>원</td>
				<td><fmt:formatNumber value="${trade.contract * trade.cnt}"></fmt:formatNumber>원</td>
			</tr>
		</c:forEach>
    </tbody>
</table>
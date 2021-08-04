<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${coinList.size() == 0}">
	<c:if test="${coin_tab == 'all'}">
		<div class="no_data">검색된 코인이 없습니다</div>
	</c:if>
	<c:if test="${coin_tab == 'my'}">
		<div class="no_data">보유코인이 없습니다</div>
	</c:if>
	<c:if test="${coin_tab == 'favorite'}">
		<div class="no_data">관심코인이 없습니다</div>
	</c:if>
</c:if>
<c:if test="${coinList.size() > 0}">
	<table class="table table-hover">
		<tbody>
			<c:forEach var="coin" items="${coinList}">
				<tr onclick="change_info('${coin.name}', '${coin.cname_ko}')" class="list" id="${coin.get('name')}">
					<td><span class="star" onclick="return change_star('${coin.get('name')}')">${coin.get('star')}</span></td>
					<td><span class="coinName">${coin.cname_ko}</span>${coin.name}</td>
					<c:if test="${coin.get('fluctuation_rate') + 0 >= 0 }">
						<td class="color_red"><fmt:formatNumber value="${coin.get('price')}"></fmt:formatNumber></td>
						<td class="color_red">+${coin.get('fluctuation_rate')}%</td>
					</c:if>
					<c:if test="${coin.get('fluctuation_rate') + 0 < 0 }">
						<td class="color_blue"><fmt:formatNumber value="${coin.get('price')}"></fmt:formatNumber></td>
						<td class="color_blue">${coin.get('fluctuation_rate')}%</td>
					</c:if>
					<td><fmt:formatNumber value="${coin.get('trade_value')}" pattern="#,###"></fmt:formatNumber> <span class="color_gray million">백만</span></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>
<script type="text/javascript">
	$('#${name}').addClass('active');
	function change_star(name) {
		if (${empty id}) {
			alert('로그인이 필요합니다');
			return false;
		}
		$.post('/stocoin/coin/favoriteCoin', 'name=' + name, function(data) {
			if(data == "1") {
				$('#' + name + ' .star').text("★");
			} else {
				$('#' + name + ' .star').text("☆");
			}
		});
	}
</script>
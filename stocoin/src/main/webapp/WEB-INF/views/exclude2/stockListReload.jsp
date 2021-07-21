<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
</script>
<table class="table table-hover">
	<tbody>
		<c:forEach var="coin" items="${coinList}">
			<tr>
				<td class="col-4"><span class="coinName">${coin.get("name")}</span>(이더리움)</td>
				<c:if test="${coin.get('fluctuation_rate') + 0 >= 0 }">
					<td class="col-4 change_red">${coin.get("price")}</td>
					<td class="col-4 change_red">${coin.get("fluctuation_rate")}</td>
				</c:if>
				<c:if test="${coin.get('fluctuation_rate') + 0 < 0 }">
					<td class="col-4 change_blue">${coin.get("price")}</td>
					<td class="col-4 change_blue">${coin.get("fluctuation_rate")}</td>
				</c:if>
			</tr>
		</c:forEach>
	</tbody>
</table>
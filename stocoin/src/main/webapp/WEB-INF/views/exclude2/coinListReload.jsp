<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
$(function() {
	var td3 = document.querySelectorAll("td:nth-child(3)");
	for (i = 0; i < td3.length; i++) {
		if (td3[i].textContent.slice(0, 1) == '-') {
			$(td3[i]).addClass('change_blue');
			$(td3[i]).siblings('td:nth-child(2)').addClass('change_blue');
		} else {
			$(td3[i]).prepend('+');
			$(td3[i]).addClass('change_red');
			$(td3[i]).siblings('td:nth-child(2)').addClass('change_red');
		}
	}
});
</script>
<table class="table table-hover">
	<tbody>
		<c:forEach var="coin" items="${coinList}">
			<tr>
				<td class="col-4"><span class="coinName">${coin.get("name")}</span>(이더리움)</td>
				<td class="col-4">${coin.get("price")}</td>
				<td class="col-4">${coin.get("fluctuation_rate")}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
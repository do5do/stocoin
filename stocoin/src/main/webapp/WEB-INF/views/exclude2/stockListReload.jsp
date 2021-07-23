<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
</script>
<table class="table table-hover">
	<tbody>
		<c:forEach var="stock" items="${stockList}">
			<tr>
				<td class="col-4"><span class="coinName">${stock.get("ISU_ABBRV")}</span></td>
				<c:if test="${stock.get('FLUC_RT') + 0 >= 0 }">
					<td class="col-4 change_red">${stock.get("TDD_CLSPRC")}</td>
					<td class="col-4 change_red">+${stock.get("FLUC_RT")}</td>
					<td class="col-4 change_red">${stock.get("ACC_TRDVOL")}</td>
				</c:if>
				<c:if test="${stock.get('FLUC_RT') + 0 < 0 }">
					<td class="col-4 change_blue">${stock.get("TDD_CLSPRC")}</td>
					<td class="col-4 change_blue">${stock.get("FLUC_RT")}</td>
					<td class="col-4 change_blue">${stock.get("ACC_TRDVOL")}</td>
				</c:if>
			</tr>
		</c:forEach>
	</tbody>
</table>
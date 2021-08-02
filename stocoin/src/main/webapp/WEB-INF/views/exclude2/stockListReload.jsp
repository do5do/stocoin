<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
</script>
<table class="table table-hover">
	<tbody>
		<c:forEach var="stock" items="${stockList}">
			<tr onclick="stockInfo('${stock.get('ISU_SRT_CD')}', '${stock.get('ISU_ABBRV')}')" class="list ${code }" id="${stock.get('ISU_SRT_CD')}">
				<td class="col-4">
					<span class="coinName">${stock.get("ISU_ABBRV")}</span>
					<span class="market_name">${stock.get("MKT_NM") }</span>
				</td>
				<c:if test="${stock.get('FLUC_RT') + 0 >= 0 }">
					<td class="col-4 color_red">${stock.get("TDD_CLSPRC")}</td>
					<td class="col-4 color_red">+${stock.get("FLUC_RT")}%</td>
				</c:if>
				<c:if test="${stock.get('FLUC_RT') + 0 < 0 }">
					<td class="col-4 color_blue">${stock.get("TDD_CLSPRC")}</td>
					<td class="col-4 color_blue">${stock.get("FLUC_RT")}%</td>
				</c:if>
				<td class="col-4">${stock.get("ACC_TRDVOL")}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<script>
   $(function() {
	   $('#005930').addClass('active');
   })
</script>
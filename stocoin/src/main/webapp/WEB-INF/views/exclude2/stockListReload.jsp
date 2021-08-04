<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${stockList.size() == 0}">
	<c:if test="${tab == 'all'}">
		<div class="no_data">검색된 주식이 없습니다</div>
	</c:if>
	<c:if test="${tab == 'my'}">
		<div class="no_data">보유주식이 없습니다</div>
	</c:if>
	<c:if test="${tab == 'favorite'}">
		<div class="no_data">관심주식이 없습니다</div>
	</c:if>
</c:if>
<c:if test="${stockList.size() > 0}">
	<table class="table table-hover">
		<tbody>
			<c:forEach var="stock" items="${stockList }">
				<tr onclick="stockInfo('${stock.get('ISU_SRT_CD')}', '${stock.get('ISU_ABBRV')}')" class="list" id="${stock.get('ISU_SRT_CD')}">
					<td>
						<c:if test="${not empty favoriteList }">
							<c:forEach var="favorite" items="${favoriteList }">
								<c:if test="${favorite.mno == mno && favorite.code == stock.ISU_SRT_CD}">
									<script type="text/javascript">$('#star_${stock.ISU_SRT_CD}').text("★");</script>
								</c:if>
							</c:forEach>
						</c:if>
						<span class="star" id="star_${stock.ISU_SRT_CD}" onclick="change_star('${stock.ISU_SRT_CD}', '${stock.ISU_ABBRV }')">☆</span>
					</td>
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
</c:if>
<script>
   $(function() {
	   $('#${code}').addClass('active');
   })
   
   function change_star(code, name) {
	   if (${empty id}) {
		   alert('로그인이 필요합니다.');
	   } else {
		   var sendData = "code="+code+"&sname="+name+"&mno=${mno}";
		   
		   $.post('/stocoin/stock/changeStar', sendData, function(data) {
			   if (data == "1") {
				   $('#star_'+code).text("★");
			   } else {
				   $('#star_'+code).text("☆");
			   }
		   })
	   }
   }
</script>
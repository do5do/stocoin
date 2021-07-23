<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coin/coinList.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/stock.css">
<script type="text/javascript">
	var kinds = "FLUC_RT";
	var sorts = "desc";

	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts);
		$('#trade').load("/stocoin/exclude2/stockInfo");
	});
	
	// sort
	function sort(kind) {
		if ($('#'+kind).text() == "↓") {
			kinds = kind;
			sorts = "asc";
			$('.sort').text("");
			$('#'+kind).text("↑");
			$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts);
		} else {
			kinds = kind;
			sorts = "desc";
			$('.sort').text("");
			$('#'+kind).text("↓");
			$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts);
		}
	}
	
	function stockInfo(name) {
		$('#trade').load('/stocoin/exclude2/stockInfo?name='+name);
	}

// 	setInterval(myTimer, 3000);
// 	function myTimer() {
// 		$('#table_wrapper').load("/stocoin/exclude2/stockListReload");
// 	}
	
</script>
</head>
<body>
	<div id="content" class="">
		<div id="content_left" class="col-xl-3 col-lg-4 col-md-5 col-5">
			<div id="search">
				<input type="text" name="search" placeholder="검색어를 입력하세요"> <a href="#">검색</a>
			</div>
			<ul>
				<li class="col-3" onclick="sort('ISU_ABBRV')">주식명 <span id="ISU_ABBRV" class="sort"></span></li>
				<li class="col-3" onclick="sort('TDD_CLSPRC')">가격 <span id="TDD_CLSPRC" class="sort"></span></li>
				<li class="col-3" onclick="sort('FLUC_RT')">등락률 <span id="FLUC_RT" class="sort">↓</span></li>
				<li class="col-3" onclick="sort('ACC_TRDVOL')">거래대금 <span id="ACC_TRDVOL" class="sort"></span></li>
			</ul>
			<!-- stock list -->
			<div id="table_wrapper">
				<table class="table table-hover">
					<tbody>
						<c:forEach var="stock" items="${stockList}">
							<tr onclick="stockInfo('${stock.get('ISU_ABBRV')}')">
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
			</div>
		</div>

		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<h4>삼성전자</h4>
			<div id="chart"></div>
			<!-- 매수 매도 -->
			<div id="trade"></div>
		</div>
	</div>
</body>
</html>
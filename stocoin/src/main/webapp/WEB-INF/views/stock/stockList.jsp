<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coinList.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/stock.css">
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script type="text/javascript" src="/stocoin/resources/js/dayjs.min.js"></script>
<script type="text/javascript">
	var kinds = "ACC_TRDVOL";
	var sorts = "desc";

	// 주식 리스트 로드, info 로드
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts);
		$('#chart').load("/stocoin/exclude2/stockChart");
		$('#info').load("/stocoin/exclude2/stockInfo");
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
		$('#info').load('/stocoin/exclude2/stockInfo?name='+name);
	}

	
	function chartChange(name) {
		$('#chart').load("/stocoin/exclude2/stockChart?name=" + name);
	}
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
				<li class="col-3" onclick="sort('FLUC_RT')">등락률 <span id="FLUC_RT" class="sort"></span></li>
				<li class="col-3" onclick="sort('ACC_TRDVOL')">거래량 <span id="ACC_TRDVOL" class="sort">↓</span></li>
			</ul>
			<!-- stock list -->
			<div id="table_wrapper">
				<table class="table table-hover">
					<tbody>
						<c:forEach var="stock" items="${stockList}">
							<tr onclick="stockInfo('${stock.get('ISU_ABBRV')}')">
								<td class="col-4"><span class="coinName">${stock.get("ISU_ABBRV")}</span></td>
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
			</div>
		</div>
		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<div id="chart"></div>
			<div id="info"></div>
		</div>
	</div>
</body>
</html>
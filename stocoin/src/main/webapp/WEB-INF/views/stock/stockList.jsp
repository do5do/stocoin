<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coin/coinList.css">
<script type="text/javascript">
	var kinds = "FLUC_RT";
	var sorts = "desc";

	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts);
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
			<div id="table_wrapper"></div>
		</div>

		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<h4>삼성전자</h4>
			<div id="chart"></div>
		</div>
	</div>
</body>
</html>
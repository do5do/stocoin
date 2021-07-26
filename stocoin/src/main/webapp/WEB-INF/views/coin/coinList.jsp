<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coinList.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/stock.css">
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script type="text/javascript">
	// 정렬 default
	var kinds = "trade_value";
	var sorts = "desc";

	// 페이지 로딩 시 코인 리스트, 차트 로드
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		$('#content_right').load("/stocoin/exclude2/coinInfo");
	});
	
	// 정렬
	function sort(kind) {
		if ($("#" + kind).text() == "↓") {
			kinds = kind;
			sorts = 'asc';
			$('.sort').text('');
			$("#" + kind).text('↑');
			$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts)
		} else {
			kinds = kind;
			sorts = 'desc';
			$('.sort').text('');
			$("#" + kind).text('↓');
			$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts)
		}
	}
	
	// 5초 간격으로 코인 리스트 로드
	setInterval(myTimer, 5000);
	function myTimer() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
	}
	
	function chartChange(name) {
		$('#content_right').load("/stocoin/exclude2/coinInfo?name=" + name);
	}
	
	function tab(item) {
		if (item == 'sell') {
			$('#sell').addClass('blue');
			$('#buy').removeClass('red');
		} else {
			$('#buy').addClass('red');
			$('#sell').removeClass('blue');
		}
	}
</script>
</head>
<body>
	<div id="content" class="">
		<div id="content_left" class="col-xl-3 col-lg-4 col-md-5 col-5">
			<div id="search">
				<input type="text" name="search" placeholder="검색어를 입력하세요"> <a
					href="#">검색</a>
			</div>
			<ul>
				<li class="col-3" onclick="sort('name')">코인명 <span id="name" class="sort"></span></li>
				<li class="col-3" onclick="sort('price')">가격 <span id="price" class="sort"></span></li>
				<li class="col-3" onclick="sort('fluctuation_rate')">등락률 <span id="fluctuation_rate" class="sort"></span></li>
				<li class="col-3" onclick="sort('trade_value')">거래금액 <span id="trade_value" class="sort">↓</span></li>
			</ul>
			<div id="table_wrapper"></div>
		</div>

		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
		</div>
	</div>
</body>
</html>
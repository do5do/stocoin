<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/stocoin/resources/css/coin/coinList.css">
<style type="text/css">
	.group-3uonVBsm:first-child {
		display: none !important;
	}
</style>
<script type="text/javascript">
	// 페이지 로딩 시 코인 리스트 로드
	var kinds = "fluctuation_rate";
	var sorts = "desc";

	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		$('#chart').load("/stocoin/exclude2/coinChart");
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
		$('#chart').load("/stocoin/exclude2/coinChart?name=" + name);
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
				<li class="col-4" onclick="sort('name')">코인명 <span id="name" class="sort"></span></li>
				<li class="col-4" onclick="sort('price')">가격 <span id="price" class="sort"></span></li>
				<li class="col-4" onclick="sort('fluctuation_rate')">등락률 <span id="fluctuation_rate" class="sort">↓</span></li>
			</ul>
			<div id="table_wrapper"></div>
		</div>

		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<div id="chart">
				<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
				<script type="text/javascript" src="/stocoin/resources/js/dayjs.min.js"></script>
			</div>
		</div>
	</div>
</body>
</html>
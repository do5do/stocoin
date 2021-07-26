<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/stocoin/resources/css/coin/coinList.css">
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script type="text/javascript" src="/stocoin/resources/js/dayjs.min.js"></script>
<style type="text/css">
.group-3uonVBsm:first-child {
	display: none !important;
}
</style>
<script type="text/javascript">
	//페이지 로딩 시 코인 리스트 로드
	var kinds = "fluctuation_rate";
	var sorts = "desc";

	$(function() {
		$('#table_wrapper').load(
				"/stocoin/exclude2/stockListReload?kind=" + kinds + "&sort="
						+ sorts);
		$('#chart').load("/stocoin/exclude2/stockChart");
	});

	// 정렬
	function sort(kind) {
		if ($("#" + kind).text() == "↓") {
			kinds = kind;
			sorts = 'asc';
			$('.sort').text('');
			$("#" + kind).text('↑');
			$('#table_wrapper').load(
					"/stocoin/exclude2/stockListReload?kind=" + kinds + "&sort="
							+ sorts)
		} else {
			kinds = kind;
			sorts = 'desc';
			$('.sort').text('');
			$("#" + kind).text('↓');
			$('#table_wrapper').load(
					"/stocoin/exclude2/stockListReload?kind=" + kinds + "&sort="
							+ sorts)
		}
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
				<input type="text" name="search" placeholder="검색어를 입력하세요"> <a
					href="#">검색</a>
			</div>
			<ul>
				<li class="col-4">주식명 <span class="sort"></span></li>
				<li class="col-4">가격 <span class="sort"></span></li>
				<li class="col-4">등락률 <span class="sort">↓</span></li>
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
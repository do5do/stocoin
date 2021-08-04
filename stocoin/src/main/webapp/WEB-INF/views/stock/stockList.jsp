<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coin.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/stock.css">
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script type="text/javascript" src="/stocoin/resources/js/dayjs.min.js"></script>
<script type="text/javascript">
	var kinds = "ACC_TRDVOL";
	var sorts = "desc";
	var selected = "삼성전자";
	var code = "005930";
	var time = "1d";
	var tab = "all";
	var search = "";
	
	// 주식 리스트 로드, info 로드
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts+"&tab="+tab+"&search="+search+"&code="+code);
		$('.dp_flex').load("/stocoin/exclude2/stockInfo");
		$('#chart').load("/stocoin/exclude2/stockChart");
		
		//content left, right height 맞추기
		var layoutHeight = $('#content_right').height();
		$('#table_wrapper').height(layoutHeight - 108);
	});
	
	// sort
	function sort(kind) {
		if ($('#'+kind).text() == "↓") {
			kinds = kind;
			sorts = "asc";
			$('.sort').text("");
			$('#'+kind).text("↑");
		} else {
			kinds = kind;
			sorts = "desc";
			$('.sort').text("");
			$('#'+kind).text("↓");
		}
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts+"&tab="+tab+"&search="+search+"&code="+code);
	}
	
	function stockInfo(inputCode, name) {
		code = inputCode;
		$('.dp_flex').load('/stocoin/exclude2/stockInfo?code='+code);
		$('#chart').load("/stocoin/exclude2/stockChart?code=" + code + "&time=" + time);
		selected = name;
		// 선택한 리스트 표시
		$(".list").removeClass('active');
		$('#'+code).addClass('active');
		document.getElementById("name").innerHTML = selected;
	}
	
	// 주식 차트 간격 수정
	function change_time(inputTime) {
		time = inputTime;
		$('.chart_btn button').removeClass('color_blue');
		event.target.classList.add('color_blue');
		$('#chart').load("/stocoin/exclude2/stockChart?code=" + code + "&time=" + time);
	}
	
	// main tab
	function mainTab() {
		tab = event.target.id;
		if (${empty id} && tab != "all") {
			alert('로그인이 필요합니다.');
			tab = "all";
		}
		$('#main_tab p').removeClass('active');
		$('#'+tab).addClass('active');
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts+"&tab="+tab+"&search="+search+"&code="+code);
	}
	
	// search
	function search_stock() {
		search = document.getElementById('search_stock').value;
		$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts+"&tab="+tab+"&search="+search+"&code="+code);
		
		if (search == null || search == "") {
			$('#search_del').removeClass('fa-times').addClass('fa-search');
			$('#search_del').css('cursor', 'default');
		} else {
			$('#search_del').removeClass('fa-search').addClass('fa-times');
			$('#search_del').css('cursor', 'pointer');
		}
	}
	
	// 검색어 삭제
	function search_del() {
		if ($('#search_del').hasClass('fa-times')) {
			search = "";
			$('#search_stock').val('');
			$('#search_del').css('cursor', 'default');
			$('#search_del').removeClass('fa-times').addClass('fa-search');
			$('#table_wrapper').load("/stocoin/exclude2/stockListReload?kind="+kinds+"&sort="+sorts+"&tab="+tab+"&search="+search+"&code="+code);
		}
	}
</script>
</head>
<body>
	<div id="content">
		<div id="content_left">
			<div id="main_tab">
				<p class="active" onclick="mainTab()" id="all">전체</p>
				<p onclick="mainTab()" id="my">보유</p>
				<p onclick="mainTab()" id="favorite">관심</p>
			</div>
			<div id="search">
				<input type="text" name="search" id="search_stock" placeholder="검색어를 입력하세요" onkeyUp="search_stock()">
				<span class="fas fa-search" id="search_del" onclick="search_del()"></span>
			</div>
			<ul>
				<li class="col-3" onclick="sort('ISU_ABBRV')">주식명 <span id="ISU_ABBRV" class="sort"></span></li>
				<li class="col-3" onclick="sort('TDD_CLSPRC')">가격 <span id="TDD_CLSPRC" class="sort"></span></li>
				<li class="col-3" onclick="sort('FLUC_RT')">등락률 <span id="FLUC_RT" class="sort"></span></li>
				<li class="col-3" onclick="sort('ACC_TRDVOL')">거래량 <span id="ACC_TRDVOL" class="sort">↓</span></li>
			</ul>
			<div id="table_wrapper"></div>
		</div>
		
		<div id="content_right">
			<h4 id="name">삼성전자</h4>
			<div class="chart_header">
				<div class="chart_btn stock_chart_btn">
					<button class="btn" onclick="change_time('5m')">5분</button>
					<button class="btn color_blue" onclick="change_time('1d')">1일</button>
				</div>
			</div>
			<div id="chart"></div>
			<div class="dp_flex"></div>
		</div>
	</div>
</body>
</html>
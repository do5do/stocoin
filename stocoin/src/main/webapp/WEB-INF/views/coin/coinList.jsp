<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coin.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/stock.css">
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script type="text/javascript" src="/stocoin/resources/js/dayjs.min.js"></script>
<script type="text/javascript" src="/stocoin/resources/js/coin.js"></script>
<script type="text/javascript">
	var tab = "all";
	function coin_tab() {
		tab = event.target.id;
		if (${empty id} && tab != 'all') {
			alert('로그인이 필요합니다.');
			return false;
		} else if (${id == 'admin'} && tab != 'all') {
			alert('관리자는 이용불가합니다');
			return false;
		}
		$('#main_tab p').removeClass('active');
		$('#' + tab).addClass('active');
		$('#table_wrapper').load('/stocoin/exclude2/coinListReload', 'val=' + val 
				+ '&kind=' + kinds + '&sort=' + sorts + '&name=' + selected + '&coin_tab=' + tab);
	}
</script>
</head>
<body>
	<div id="content">
		<div id="content_left">
			<div id="main_tab">
				<p class="active" onclick="return coin_tab()" id="all">전체</p>
				<p onclick="return coin_tab()" id="my">보유</p>
				<p onclick="return coin_tab()" id="favorite">관심</p>
			</div>
			<div id="search">
				<input type="text" name="search" id="search_coin" placeholder="검색어를 입력하세요" onkeyUp="search_coin();">
				<span class="fas fa-search" id="search_del" onclick="search_del()"></span>
			</div>
			<ul>
				<li class="col-3" onclick="sort('name')">코인명 <span id="name" class="sort"></span></li>
				<li class="col-3" onclick="sort('price')">가격 <span id="price" class="sort"></span></li>
				<li class="col-3" onclick="sort('fluctuation_rate')">등락률 <span id="fluctuation_rate" class="sort"></span></li>
				<li class="col-3" onclick="sort('trade_value')">거래금액 <span id="trade_value" class="sort">↓</span></li>
			</ul>
			<div id="table_wrapper"></div>
		</div>
		
		<div id="content_right">
			<h4 class="coinName_ko">비트코인</h4> <span class="coinName_en color_gray">BTC</span>
			<div class="chart_header">
				<div class="chart_btn">
					<button class="btn" onclick="change_time('1m')">1분</button>
					<button class="btn color_blue" onclick="change_time('5m')">5분</button>
					<button class="btn" onclick="change_time('10m')">10분</button>
					<button class="btn" onclick="change_time('1h')">1시</button>
					<button class="btn" onclick="change_time('24h')">1일</button>
				</div>
			</div>
			<div id="chart"></div>
			<div class="dp_flex">
				<div id="info" class="col-5">
					<div id="coinInfo"></div>
					<div id="chart_sm"></div>
				</div>
				<div class="trade coin col-7"></div>
			</div>
		</div>
	</div>
</body>
</html>
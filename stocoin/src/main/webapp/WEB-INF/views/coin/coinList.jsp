<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/coinList.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/css/stock.css">
<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
<script type="text/javascript" src="/stocoin/resources/js/dayjs.min.js"></script>
<script type="text/javascript" src="/stocoin/resources/js/coin.js"></script>
</head>
<body>
	<div id="content">
		<div id="content_left">
			<div id="search">
				<input type="text" name="search" placeholder="검색어를 입력하세요">
				<a href="#">검색</a>
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
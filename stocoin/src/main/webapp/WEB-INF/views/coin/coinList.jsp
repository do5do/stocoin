<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="ss" class="com.sc.stocoin.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/stocoin/resources/css/coin/coinList.css">
<script type="text/javascript">
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload");
		
		var sortChk = true;
		$('li').click(function() {
			$('.sort').text('');
			if ($(this).siblings('.sort').text() == '↓') {
				console.log("??????");
				$(this).siblings('.sort').text('↑');
			} else {
				$(this).siblings('.sort').text('↓');
			}
		});
	});
	
	setInterval(myTimer, 3000);
	function myTimer() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload");
	}
</script>
</head>
<script type="text/javascript">
	function chat() {
		var win = window.open("http://" + "${ss.getIP()}" + "/stocoin/chat", "PopupWin", "width=500,height=600");
	}
</script>
<body>
	<div id="content" class="">
		<div id="content_left" class="col-xl-3 col-lg-4 col-md-5 col-5">
			<div id="search">
				<input type="text" name="search" placeholder="검색어를 입력하세요">
				<a href="#">검색</a>
			</div>
			<ul>
				<li class="col-4">코인명 <span class="sort"></span></li>
				<li class="col-4">가격 <span class="sort"></span></li>
				<li class="col-4">등락률 <span class="sort">↓</span></li>
			</ul>
			<div id="table_wrapper">
				
			</div>
		</div>

		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<h4>BTC (비트코인)</h4>
			<div id="chart">
			</div>
		</div>
	</div>
askdfjsldifj!!!!
<button class="btn btn-success" onclick="chat()">채팅</button>
<br>
<button class="btn btn-success" onclick="location.href='../testPy'">테스트</button>
</body>
</html>
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
	// 정렬 default
	var kinds = "trade_value";
	var sorts = "desc";
	var selected = "BTC";
	//차트 생성 옵션
	var chart;
	var options = {
		series : [],
		noData : {
			text : 'Loading...'
		},
		chart : {
			height : 500,
			type : 'candlestick',
			foreColor : '#909090'
		},
		title : {
			text : 'CandleStick Chart - Category X-axis',
			align : 'left'
		},
		annotations : {
			xaxis : [ {
				x : '날짜',
				borderColor : '#00E396',
				label : {
					borderColor : '#00E396',
					style : {
						fontSize : '12px',
						color : '#fff',
						background : '#00E396'
					},
					orientation : 'horizontal',
					offsetY : 7,
					text : 'Annotation Test'
				}
			} ]
		},
		tooltip : {
			enabled : true,
		},
		xaxis : {
			type : 'category',
			labels : {
				formatter : function(val) {
					return dayjs(val).format('MM월 DD HH:mm')
				}
			}
		},
		yaxis : {
			tooltip : {
				enabled : true
			}
		},
		plotOptions : {
			candlestick : {
				colors : {
					upward : '#f40',
					downward : '#19f'
				},
				wick : {
					useFillColor : true,
				}
			}
		}
	};
	

	
	// 페이지 로딩 시 코인 리스트, 차트 로드
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		
		$('#info').load("/stocoin/exclude2/coinInfo");
		// 차트 생성
		chart = new ApexCharts(document.querySelector("#chart"), options);
		chart.render();
		chartChange(selected);
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
	//setInterval(myTimer, 5000);
	function myTimer() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		chartChange(selected);
	}
	
	function chartChange(name, time = '5m') {
		$('#info').load("/stocoin/exclude2/coinInfo?name=" + name);
		$(".list").removeClass('active');
		$('#'+name).addClass('active');
		selected = name;
		var url = 'https://api.bithumb.com/public/candlestick/' + name + '_KRW/' + time;
		chart.updateOptions({
			title : {
				text : name,
				align : 'left'
			}
		});
		$.getJSON(url, function(response) {
			// 최근 100개, 거래량 빼고 복사
			var obj = response.data.slice(0,100).map(v => v.slice(0,5));
			// OCHL -> OHLC (Opening Closing High Low)
			obj.map(v => v.splice(0,5, v[0], v[1], v[3], v[4], v[2]));
		  chart.updateSeries([{
		    name: 'Sales',
		    data: obj
		  }])
		});
	}
</script>
</head>
<body>
	<div id="content" class="">
		<div id="content_left">
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
		
		<div id="content_right">
			<div id="chart"></div>
			<div id="info"></div>
		</div>
	</div>
</body>
</html>
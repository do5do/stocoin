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
	// 페이지 로딩 시 코인 리스트 로드
	var kinds = "fluctuation_rate";
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
				height : 600,
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
					 wick: {
					      useFillColor: true,
					    }
				}
			}
		};
	
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		
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
	setInterval(myTimer, 5000);
	function myTimer() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		chartChange(selected);
	}
	
	function chartChange(name, time = '5m') {
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
			</div>
		</div>
	</div>
</body>
</html>
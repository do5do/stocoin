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
	
	var chart2;
	var options2 = {
		series : [],
		noData : {
			text : 'Loading...'
		},
		chart : {
			height : 180,
			type : 'area',
			toolbar : {
				show : false
			},
			zoom : {
				enabled : false
			}
		},
		dataLabels : {
			enabled : false
		},
		stroke : {
			curve : 'smooth',
			colors : [ '#19f' ],
			width : 1
		},
		xaxis : {
			type : 'datetime',
			categories : [ "2018-09-19T00:00:00.000Z",
					"2018-09-19T01:30:00.000Z", "2018-09-19T02:30:00.000Z",
					"2018-09-19T03:30:00.000Z", "2018-09-19T04:30:00.000Z",
					"2018-09-19T05:30:00.000Z", "2018-09-19T06:30:00.000Z" ],
			tooltip : {
				enabled : false
			}
		},
		yaxis : {
			show : false
		},
		tooltip : {
			x : {
				format : 'yyyy/MM/dd HH:mm'
			},
			marker : {
				show : false
			}
		},
		grid : {
			show : false
		}
	};

	
	// 페이지 로딩 시 코인 리스트, 차트 로드
	$(function() {
		$('#table_wrapper').load("/stocoin/exclude2/coinListReload?kind=" + kinds + "&sort=" + sorts);
		$('#coinInfo').load("/stocoin/exclude2/coinInfo");
		// 차트 생성
		chart = new ApexCharts(document.querySelector("#chart"), options);
		chart.render();
		chart2 = new ApexCharts(document.querySelector("#chart_sm"), options2);
		chart2.render();
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
		$('#coinInfo').load("/stocoin/exclude2/coinInfo?name=" + name);
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
			var obj = response.data.slice(-100).map(v => v.slice(0,5));
			var obj2 = response.data.slice(-100).map(v => v.slice(0,5));
			// OCHL -> OHLC (Opening Closing High Low)
			obj.map(v => v.splice(0,5, v[0], v[1], v[3], v[4], v[2]));
		  	chart.updateSeries([{
		    	name: 'Sales',
		    	data: obj
		  	}]);

		  	obj2.map(v => v.splice(0,5, v[0]+32400000, v[2]));
		  	
		  	chart2.updateSeries([{
				name : 'price',
				data: obj2
		  	}]);
		});
	}
	
	// tab
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
			<div class="dp_flex">
				<div id="info" class="col-5">
					<div id="coinInfo"></div>
					<div id="chart_sm"></div>
				</div>
				<div class="trade col-7">
					<form action="" method="post" name="frm">
						<ul class="trade_tab">
							<li class="red" id="buy" onclick="tab('buy')">매수</li>
							<li id="sell" onclick="tab('sell')">매도</li>
						</ul>
						<div class="trade_detail">
							<div class="left">
								<p>주문가능</p>
								<p>주문가격</p>
								<p>주문수량</p>
								<p>주문금액</p>
							</div>
							<div class="right">
								<p>0원</p>
								<p>${stockInfo.get("ACC_TRDVOL")}원</p>
								<div class="fee_box">
									<p class="fee">0주</p>
									<div class="cnt_box">
										<div class="line_box minus">
											<div class="line"></div>
										</div>
										<span>0</span>
										<div class="line_box plus">
											<div class="line"><div class="line vertical"></div></div>
										</div>
										<input type="hidden" name="cnt" class="input_hidden" value="0">
									</div>
								</div>
								<input type="number" placeholder="0원">
							</div>
						</div>
						<div class="input_box">
							<c:if test="${empty id }">
								<input type="button" value="로그인" class="btn btn-primary col-12" onclick="trade()">
							</c:if>
							<c:if test="${not empty id }">
								<input type="button" value="확인" class="btn btn-primary col-12" onclick="trade()">
							</c:if>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
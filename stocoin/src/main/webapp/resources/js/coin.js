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

//처음 로드 시 default
var kinds = "trade_value";
var sorts = "desc";
var selected = "BTC";

// coinList, coinInfo, chart load
$(function() {
	chart = new ApexCharts(document.querySelector('#chart'), options);
	chart.render();
	chart2 = new ApexCharts(document.querySelector('#chart_sm'), options2);
	chart2.render();
	change_chart(selected);
	$('.trade').load('/stocoin/exclude2/coinTrade?name=' + selected);
});

// 정렬
function sort(kind) {
	if ($('#' + kind).text() == '↓') {
		kinds = kind;
		sorts = 'asc';
		$('.sort').text('');
		$('#' + kind).text('↑');
		$('#table_wrapper').load('/stocoin/exclude2/coinListReload?kind=' + kinds + '&sort=' + sorts + '&name=' + selected)
	} else {
		kinds = kind;
		sorts = 'desc';
		$('.sort').text('');
		$('#' + kind).text('↓');
		$('#table_wrapper').load('/stocoin/exclude2/coinListReload?kind=' + kinds + '&sort=' + sorts + '&name=' + selected)
	}
}

// 5초 간격으로 interval
setInterval(myTimer, 5000);
function myTimer() {
	change_chart(selected); 
}

// 코인 클릭 시 해당 코인 active & trade load
function change_info(name) {
	$(".list").removeClass('active');
	$('#'+name).addClass('active');
	$('.trade').load('/stocoin/exclude2/coinTrade?name=' + name);
}

// coinList, coinInfo, chart change
function change_chart(name, time = '5m') {
	selected = name;
	$('#table_wrapper').load('/stocoin/exclude2/coinListReload?kind=' + kinds + '&sort=' + sorts + '&name=' + selected);
	$('#coinInfo').load('/stocoin/exclude2/coinInfo?name=' + selected);
	var url = 'https://api.bithumb.com/public/candlestick/' + selected + '_KRW/' + time;
	chart.updateOptions({
		title : {
			text : selected,
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

// 매수/매도 : 수량 자동 변경
function change_cnt(type) {
	if (type == 'range') {
		if ($('#range').val() == 0) {
			$('#cnt_txt').val('0');
		} else {
			var percent = $('#range').val()/100;
			var money_percent = coin_money*percent;
			var cnt = money_percent/closing_price;
			var cnt_txt = Math.floor(cnt * 10000)/10000;
			$('#cnt_txt').val(cnt_txt);
		}
		
	} else if (type == 'purchase') {
		var cnt_txt = Math.floor($('#purchase').val() / closing_price * 10000) / 10000;
		if ($('#purchase').val() > max_price) {
			alert("주문 가능 금액을 초과하였습니다");
			$('#cnt_txt').val(max_cnt);
			change_op();
		} else 
			$('#cnt_txt').val(cnt_txt);
	}
}

//매수/매도 : 퍼센트 자동 변경
function change_range() {
	var val = $('#range').val() / 100;
	if ($('body').hasClass('white')) {
		$('#range').css('background-image',
	                '-webkit-gradient(linear, left top, right top, '
	                + 'color-stop(' + val + ', #19f), '
	                + 'color-stop(' + val + ', rgb(231,231,231))'
	                + ')'
       	);
	} else {
		$('#range').css('background-image',
	                '-webkit-gradient(linear, left top, right top, '
	                + 'color-stop(' + val + ', #19f), '
	                + 'color-stop(' + val + ', rgb(70,70,70))'
	                + ')'
       	);
	}
	$('#range_percent').text($('#range').val());
}

//매수/매도 : 주문금액 자동 변경
function change_op(type) {
	if ($('#cnt_txt').val() > max_cnt) {
		alert("주문 가능 금액을 초과하였습니다");
		$('#cnt_txt').val(max_cnt);
	}
	var purchase = Math.floor($('#cnt_txt').val() * closing_price);
	$('#purchase').val(purchase);
}
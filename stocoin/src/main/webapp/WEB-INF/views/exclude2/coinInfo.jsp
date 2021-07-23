<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h3>${name}</h3>
<div id="chart">
	<div class="tradingview-widget-container">
		<div id="tradingview_a2c70"></div>
		<script type="text/javascript">
			new TradingView.widget({
				"width" : "100%",
				"height" : "100%",
				"symbol" :  "${name}KRW",
				"interval" : "D",
				"timezone" : "Asia/Seoul",
				"theme" : "light",
				"style" : "1",
				"locale" : "en",
				"toolbar_bg" : "#f1f3f6",
				"enable_publishing" : false,
				"allow_symbol_change" : true,
				"container_id" : "tradingview_a2c70",
				"disabled_features": ["header_symbol_search"],
			});
		</script>
	</div>
</div>
<div id="coinInfo" class="col-5">
	<c:if test="${coinInfo.get('fluctate_rate_24H') + 0 >= 0 }">
		<h4 class="color_red">
			<fmt:formatNumber value="${coinInfo.get('closing_price')}"></fmt:formatNumber>
			<span class="text-sm color_red">+${coinInfo.get('fluctate_rate_24H')}%</span>
		</h4>
	</c:if>
	<c:if test="${coinInfo.get('fluctate_rate_24H') + 0 < 0 }">
		<h4 class="color_blue">
			<fmt:formatNumber value="${coinInfo.get('closing_price')}"></fmt:formatNumber>
			<span class="text-sm color_blue">${coinInfo.get('fluctate_rate_24H')}%</span>
		</h4>
	</c:if>
	<table>
		<tr>
			<td class="col-3">거래량(24H)</td>
			<td class="col-3"><fmt:formatNumber value="${coinInfo.get('units_traded_24H')}"></fmt:formatNumber></td>
			<td class="col-3">고가(당일)</td>
			<td class="col-3"><fmt:formatNumber value="${coinInfo.get('max_price')}"></fmt:formatNumber></td>
		</tr>
		<tr>
			<td>거래금액(24H)</td>
			<td><fmt:formatNumber value="${coinInfo.get('acc_trade_value_24H') / 1000000}" pattern="#,###"></fmt:formatNumber>
				<span class="color_gray">백만</span></td>
			<td>저가(당일)</td>
			<td><fmt:formatNumber value="${coinInfo.get('min_price')}"></fmt:formatNumber></td>
		</tr>
		<tr>
			<td>전일종가</td>
			<td><fmt:formatNumber value="${coinInfo.get('prev_closing_price')}"></fmt:formatNumber></td>
			<td></td>
			<td></td>
		</tr>
	</table>
	<div id="chart_sm"></div>
	<script type="text/javascript">
	 var options = {
     		series: [{
	            name: 'price',
	            data: [31, 40, 28, 51, 42, 109, 100]
	        }],
	        chart: {
	            height: 130,
	            type: 'area',
	       	    toolbar: {
	      	        show: false
	       	    },
	       	 	zoom: {
	            	enabled: false
	           }
	        },
	        dataLabels: {
	            enabled: false
	        },
	        stroke: {
	            curve: 'smooth',
	            colors: ['#19f'],
	            width: 1
	        },
	        xaxis: {
        	    type: 'datetime',
	            categories: ["2018-09-19T00:00:00.000Z", "2018-09-19T01:30:00.000Z", "2018-09-19T02:30:00.000Z", "2018-09-19T03:30:00.000Z", "2018-09-19T04:30:00.000Z", "2018-09-19T05:30:00.000Z", "2018-09-19T06:30:00.000Z"],
	        	tooltip: {
	            	enabled: false
	        	}
	        },
        	yaxis: {
        	    show: false
        	},
	        tooltip: {
	          x: {
	            format: 'dd/MM/yy HH:mm'
	          },
	          marker: {
	              show: false
	          }
	        },
	        grid: {
	            show: false
	        }
        };

        var chart = new ApexCharts(document.querySelector("#chart_sm"), options);
        chart.render();
	</script>
</div>
<div class="trade_box col-7">
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
			<p>${coinInfo.get('closing_price')}</p>
			<div class="fee_box">
				<p class="fee">0원</p>
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
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript">
	$(function() {
		// 수량 감소
		$('.minus').on('click', function(e) {
			e.preventDefault();
			var stat = $(this).siblings("span").text();
			var num = parseInt(stat);
			
			num -= 1;

			if (num < 0) {
				num = 0;
				alert('최저 수량입니다.');
			}
			
			$(this).siblings("span").text(num);
			$(this).siblings("input").val(num);
			$(this).parent().siblings(".fee").text(num+"주");
		});
		
		// 수량 증가
		$('.plus').on('click', function(e) {
			e.preventDefault();
			var stat = $(this).siblings("span").text();
			var num = parseInt(stat);

			num += 1;
			
			if (num > 20) { // 가진 돈에 맞춰서 계산 필요 주 * 수량 <= 가진 금액
				num = 20;
				alert('최고 수량입니다.');
			}
			
			$(this).siblings("span").text(num);
			$(this).siblings("input").val(num);
			$(this).parent().siblings(".fee").text(num+"주");
		});
	})
	
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
	
	// 재무제표
	function fState(corp_code) {
		var link = "https://opendart.fss.or.kr/api/fnlttSinglAcntAll.json?crtfc_key=a248d130cedcab6227310f848b1b5bb297bc4ed1&corp_code=" + corp_code +"&bsns_year=2020&reprt_code=11011&fs_div=OFS";
		window.open(link, "fState", "width=500,height=600");
	}
</script>
<div id="coinInfo" class="col-5">
	<c:if test="${stockInfo.get('FLUC_RT') + 0 >= 0 }">
		<h4 class="color_red">
			${stockInfo.get('TDD_CLSPRC')}
			<span class="text-sm color_red">+${stockInfo.get('FLUC_RT')}%</span>
		</h4>
	</c:if>
	<c:if test="${stockInfo.get('FLUC_RT') + 0 < 0 }">
		<h4 class="color_blue">
			${stockInfo.get('TDD_CLSPRC')}
			<span class="text-sm color_blue">${stockInfo.get('FLUC_RT')}%</span>
		</h4>
	</c:if>
	<table>
		<tr>
			<td class="col-3">거래량(24H)</td>
			<td class="col-3">${stockInfo.get('ACC_TRDVOL')}</td>
			<td class="col-3">고가(당일)</td>
			<td class="col-3">${stockInfo.get('TDD_HGPRC')}</td>
		</tr>
		<tr>
			<td>거래금액(24H)</td>
			<td>
				<fmt:formatNumber value="${stockInfo.get('trade_price') / 1000000}" pattern="#,###"></fmt:formatNumber>
				<span class="color_gray">백만</span>
			</td>
			<td>저가(당일)</td>
			<td>${stockInfo.get('TDD_LWPRC')}</td>
		</tr>
		<tr>
			<td>전일종가</td>
			<td>${stockInfo.get('TDD_CLSPRC')}</td>
			<td colspan="2"><button class="btn btn-primary"onclick="fState('${stockInfo.get('corp_code')}')">재무제표</button></td>
			<!-- <td></td> -->
		</tr>
	</table>
	<div id="chart_sm"></div>
	<script type="text/javascript">
	 var options2 = {
     		series: [{
	            name: 'price',
	            data: [31, 40, 28, 51, 42, 109, 100]
	        }],
	        chart: {
	            height: 180,
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

        var chart2 = new ApexCharts(document.querySelector("#chart_sm"), options2);
        chart2.render();
	</script>
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
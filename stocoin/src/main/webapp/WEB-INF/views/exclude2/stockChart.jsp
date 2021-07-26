<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h4>${name}</h4>
<div class="chart-widget">
	<script type="text/javascript">
		var selected = "삼전";

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
					wick : {
						useFillColor : true,
					}
				}
			}
		};

		$(function() {
			// 차트 생성
			chart = new ApexCharts(document.querySelector("#chart"), options);
			chart.render();
			chartLoad(selected);
		});
		
		function chartLoad(name, time = '5m') {
			selected = name;
			var jsonData = JSON.parse('${stockChart}');
			let jsonArray = [];
			console.log(jsonData);
			jsonData.output.forEach((item)=>{
			  jsonArray.push([
				  Date.parse(item.TRD_DD), 
				  parseFloat(item.TDD_OPNPRC.replace(",", "")),
				  parseFloat(item.TDD_HGPRC.replace(",", "")),
				  parseFloat(item.TDD_LWPRC.replace(",", "")),
				  parseFloat(item.TDD_CLSPRC.replace(",", ""))
				  ]);
			});
			chart.updateOptions({
				title : {
					text : name,
					align : 'left'
				}
			});
			  chart.updateSeries([{
			    name: 'Sales',
			    data: jsonArray
			  }]);
		}
	</script>
</div>
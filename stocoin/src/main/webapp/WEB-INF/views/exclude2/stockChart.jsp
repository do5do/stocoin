<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h4>${name}</h4>
<div class="chart-widget">
	<script type="text/javascript">
		var selected = "${stockInfo.get('ISU_ABBRV')}";

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
		
		var chart2;
		var options2 = {
     		series: [],
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
	            format: 'yyyy/MM/dd HH:mm'
	          },
	          marker: {
	              show: false
	          }
	        },
	        grid: {
	            show: false
	        }
        };

		$(function() {
			// 차트 생성
			chart = new ApexCharts(document.querySelector("#chart"), options);
			chart.render();
			chart2 = new ApexCharts(document.querySelector("#chart_sm"), options2);
	        chart2.render();
			chartLoad(selected);
		});
		
		function chartLoad(name, time = '5m') {
			selected = name;
			var jsonData = JSON.parse('${stockChart}');
			let jsonArray = [];
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
			chart2.updateSeries([{
			  name: 'price',
			  data: jsonArray
			}]);
		}
	</script>
</div>
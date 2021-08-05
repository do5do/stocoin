<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="chart-widget">
	<script type="text/javascript">
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
						return dayjs(val).format('MM월 DD일 hh:mm')
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

		$(function() {
			// 차트 생성
			chart = new ApexCharts(document.getElementById("chart"), options);
			chart.render();
			chart2 = new ApexCharts(document.getElementById("chart_sm"), options2);
	        chart2.render();
			chartLoad();
		});
		
		function chartLoad() {
			var jsonData = JSON.parse('${stockChart}');
			let jsonArray = [];
			let jsonArray2 = [];
			if(time == "1d") {
				jsonData.output.forEach((item)=>{
					jsonArray.push([
						Date.parse(item.TRD_DD), 
						parseFloat(item.TDD_OPNPRC.replace(",", "")),
						parseFloat(item.TDD_HGPRC.replace(",", "")),
						parseFloat(item.TDD_LWPRC.replace(",", "")),
						parseFloat(item.TDD_CLSPRC.replace(",", ""))
					]);
					jsonArray2.push([
						Date.parse(item.TRD_DD), 
						parseFloat(item.TDD_CLSPRC.replace(",", ""))
					]);
				});
				chart.updateOptions({
					xaxis : {
						type : 'category',
						labels : {
							formatter : function(val) {
								return dayjs(val).format('MM월 DD일')
							}
						}
					}
				});
			}
			else {
				var date = jsonData.CURRENT_DATETIME.substring(0, 11);
				for(var i = 0; i < jsonData.output.length; i += 5) {
					if(jsonData.output[i].TDD_CLSPRC == "")
						break;
					jsonArray.push([
						Date.parse(date + jsonData.output[i].TRD_DD), 
						parseFloat(jsonData.output[i].TDD_OPNPRC.replace(",", "")),
						parseFloat(jsonData.output[i].TDD_HGPRC.replace(",", "")),
						parseFloat(jsonData.output[i].TDD_LWPRC.replace(",", "")),
						parseFloat(jsonData.output[i].TDD_CLSPRC.replace(",", ""))
					]);
					jsonArray2.push([
						Date.parse(date + jsonData.output[i].TRD_DD), 
						parseFloat(jsonData.output[i].TDD_CLSPRC.replace(",", ""))
					]);
				}
				chart.updateOptions({
					xaxis : {
						type : 'category',
						labels : {
							formatter : function(val) {
								return dayjs(val).format('MM월 DD일 hh:mm')
							}
						}
					}
				});
			}
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
			  data: jsonArray2
			}]);
		}
	</script>
</div>
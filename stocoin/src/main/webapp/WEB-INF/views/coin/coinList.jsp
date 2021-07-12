<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/bootstrap/css/coin/coinList.css">
<script type="text/javascript">
	$(function() {
		var td3 = document.querySelectorAll("td:nth-child(3)");
		for (i = 0; i < td3.length; i++) {
			if (td3[i].textContent.slice(0,1) == '-') {
				$(td3[i]).addClass('change_blue');
				$(td3[i]).siblings('td:nth-child(2)').addClass('change_blue');
			} else {
				$(td3[i]).addClass('change_red');
				$(td3[i]).siblings('td:nth-child(2)').addClass('change_red');
			}
		}
	})
</script>
</head>
<body>
	<div id="content" class="" >
		<div id="content_left" class="col-xl-3 col-lg-4 col-md-5 col-5">
			<div id="search">
				<input type="text" name="search" class="col-lg-9 col-md-8">
				<a href="#" class="btn btn-default">검색</a>
			</div>
			<ul>
				<li class="col-3">코인명</li>
				<li class="col-3">가격</li>
				<li class="col-3">등락률</li>
				<li class="col-3">거래대금</li>
			</ul>
			<div id="table_wrapper">
				<table class="table table-hover">
					<tbody>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>BTC<br>(비트코인)</td>
							<td>40,394,000</td>
							<td>-1.34%</td>
							<td>42,236백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
						<tr>
							<td>ETH<br>(이더리움)</td>
							<td>2,771,000</td>
							<td>+2.40%</td>
							<td>42,198백만</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<h4>BTC (비트코인)</h4>
			<div id="chart">차트영역</div>
		</div>
	</div>
</body>
</html>
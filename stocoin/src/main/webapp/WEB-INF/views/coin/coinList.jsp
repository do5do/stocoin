<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/stocoin/resources/css/coin/coinList.css">
<script type="text/javascript">
	$(function() {
		var td3 = document.querySelectorAll("td:nth-child(3)");
		for (i = 0; i < td3.length; i++) {
			if (td3[i].textContent.slice(0, 1) == '-') {
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
	<div id="content" class="">
		<div id="content_left" class="col-xl-3 col-lg-4 col-md-5 col-5">
			<div id="search">
				<input type="text" name="search" placeholder="검색어를 입력하세요"> <a
					href="#">검색</a>
			</div>
			<ul>
				<li class="col-5">코인명</li>
				<li class="col-4">가격</li>
				<li class="col-3">등락률</li>
			</ul>
			<div id="table_wrapper">
				<table class="table table-hover">
					<tbody>
						<c:forEach var="coin" items="${coinList}">
							<tr>
								<td class="col-5"><span class="coinName">${coin.get("name")}</span>(이더리움)</td>
								<td class="col-4">${coin.get("price")}</td>
								<td class="col-3">+0.0</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

		<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
			<h4>BTC (비트코인)</h4>
			<div id="chart">
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings"
	scope="page" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/myPage.css">
<script type="text/javascript">
	$(
			function() {
				function logOut() {
					location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
							+ "${ss.getIP()}" + "/stocoin/logout";
				}

				// tab active control
				$('#tab1').addClass('active');
				var curUrl = window.location.href;
				var sliceUrl = curUrl.slice(38);
				$('.tabs li').removeClass('active');
				$('#' + sliceUrl).addClass("active");
				$('#tab2').addClass('active');
			})
</script>
</head>
<body>
		<div class="my_assets">
			<a class="assets_name" href="/stocoin/myPage/myCoinList">코인</a> <a
				class="assets_name" href="/stocoin/myPage/myStockList">주식</a>
		</div>
		<ul class="tabs">
			<li id="tab1">
				<a class="tab" href="/stocoin/myPage/myStockList">채결/미채결</a>
			</li>
			<li id="tab2">
				<a class="tab" href="/stocoin/myPage/stockTradeList">주식잔고</a>
			</li>		
		</ul>
		<div class="TotalBox">
			<table class="Total-table">
				<colgroup>
					<col width="">
					<col width="20%">
					<col width="15%">
					<col width="20%">
					<col width="15%">
				</colgroup>
				<tbody>
					<tr>
						<td rowspan="2" class="fir-td">
							<p class="total-text">평가손익</p>
						</td>
					</tr>
					<tr>
						<td style="padding-left: 55%;"><p class="total-number">
								2,729,645 <small>32.98%</small>
							</p></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="TotalBox">
			<div class="card-wrap">
				<ul class="card-list">
					<li class="card-item">
						<table class="asset">
							<colgroup>
								<col style="width: 5%" />
								<col style="width: 5" />
								<col style="width:" />
								<col style="width:" />
								<col style="width:" />
								<col style="width:" />
								<col style="width:" />
								<col style="width:" />
								<col style="width:" />
							</colgroup>
							<thead>
								<tr>
									<th>종목명</th>
									<th>매입단가</th>
									<th>평균매수가</th>
									<th>매수금액</th>
									<th>평가금액(KRW)</th>
									<th>평가손익(KRW)</th>
									<th>수익율(%)</th>
									<th>수익율(%)</th>
									<th>수익율(%)</th>
									<th>수익율(%)</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>삼성</td>
									<td>1</td>
									<td>-</td>
									<td>-</td>
									<td>1</td>
									<td>-</td>
									<td>-</td>
								</tr>
								<tr>
									<td>애플</td>
									<td>1</td>
									<td>-</td>
									<td>-</td>
									<td>1</td>
									<td>-</td>
									<td>-</td>
								</tr>
							</tbody>
						</table>
					</li>
				</ul>
			</div>
		</div>
	<div class="input_box center">
		<input class="btn btn-outline-primary col-3" value="정보수정"
			onclick="location.href='/stocoin/member/updateForm'" /> <input
			id="logout" class="btn btn-outline-primary col-3" value="로그아웃"
			onclick="logOut()" />
	</div>
</body>
</html>
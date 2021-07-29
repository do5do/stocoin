<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings"
	scope="page" />
<script type="text/javascript">
	$(function() {
		// tab active control
		$('#tab1').addClass('active');
		var curUrl = window.location.href;
		var sliceUrl = curUrl.split("?")[1].split("&")[0].split("=")[1];

		if (sliceUrl == null || sliceUrl == 1) {
			$('#tab' + sliceUrl).addClass("active");
		} else if (sliceUrl == 2) {
			$('.tabs li').removeClass('active');
			$('#tab' + sliceUrl).addClass("active");
		} else {
			$('.tabs li').removeClass('active');
			$('#tab' + sliceUrl).addClass("active");
		}
	})
	
	function logOut() {
		location.href = "https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://"
				+ "${ss.getIP()}" + "/stocoin/logout";
	}
</script>
<style>

.container {
	margin: 0 auto !important;
}

#coinListTableArea {
	position: relative;
	width: 1200px;
	margin: 0 auto;
}

#coinListTable {
	white-space: normal;
}

tbody {
	display: block;
	height: 200px;
	overflow: auto;
}

thead, tbody tr {
	display: table;
	width: 100%;
	table-layout: fixed;
}

.nav-menu {
	margin-top: 136.36px;
	position: relative;
	width: 1320px;
	max-width: 100%;
}

.nav-tabs {
	width: 95%;
	border: none;
	padding: 20px 0 150px;
	font-size: 25px;
}

.nav-tabs.clearfix {
	content: '';
	clear: both;
	display: block;
}

.nav-tabs li {
	float: left;
	width: 50%;
}

.nav-tabs li:first-child {
	text-align: right;
	padding-right: 25px;
}

.nav-tabs li:last-child {
	text-align: left;
	padding-left: 25px;
}

.date[type="text"], input[type="password"], input[type="number"] {
	width: 15%;
	height: 48px;
	border: none;
	border-bottom: 1px solid currentColor;
	outline: 0;
	font-size: 16px;
	margin-bottom: 16px;
	font-family: inherit;
	background: none;
	color: #fff;
}

.assetSelect[type="text"], input[type="password"], input[type="number"]
	{
	width: 15%;
	height: 48px;
	border: none;
	border-bottom: 1px solid currentColor;
	outline: 0;
	font-size: 16px;
	margin-bottom: 16px;
	font-family: inherit;
	background: none;
	color: #fff;
}

.table-responsive {
	overflow-x: auto;
	-webkit-overflow-scrolling: touch;
	height: 26%;
}

body {
	width: 100%;
	max-width: 1920px;
}

.Container {
	position: relative;
	margin: 0 auto;
	width: 1200px;
}

.Container header {
	border-bottom: 1px solid #ccc;
	padding: 25px 0;
	text-align: left;
}

.Container header span {
	font-size: 20px;
	font-weight: 600;
}

.Container header select {
	float: right;
	color: gray;
	font-size: 16px;
	font-weight: 600;
	padding: 10px 15px;
	border: none;
	outline: none;
}

.Container header select.clearfix {
	content: '';
	clear: both;
	display: block;
}

.Container .Navigator {
	position: relative;
	margin: 60px auto 0;
	border-bottom: 1px solid #efefef;
}

.Container .Navigator nav ul {
	list-style: none;
	display: flex;
}

.Container .Navigator nav ul li.item {
	color: #fff;
	font-size: 20px;
	font-weight: 600;
	padding: 15px 20px;
	text-align: center;
}

.Container .Navigator nav ul li.item>a {
	color: #ccc;
	text-decoration: none;
}

.Container .Navigator nav ul li.item.on {
	border-bottom: 4px solid #000;
}

.Container .Navigator nav ul li.item.on>a {
	color: #000;
}

.Container .InfoBox {
	margin: 20px 0;
	padding: 20px 0;
}

.InfoBox select, .InfoBox input {
	padding: 15px;
	color: gray;
	font-size: 16px;
	font-weight: 500;
	text-align: center;
	border: 1px solid #ccc;
	border-radius: 5px;
	outline: none;
}

.InfoBox input::placeholder {
	color: #777;
}

.InfoBox input.date-lookup {
	color: #777;
	text-align: left;
}

.InfoBox input.date-lookup::placeholder {
	color: gray;
}

.InfoBox button {
	padding: 15px 25px;
	margin-right: 20px;
	color: #fff;
	background-color: #777;
	font-size: 15px;
	font-weight: 600;
	border: 1px solid #ccc;
	border-radius: 5px;
	outline: none;
	cursor: pointer;
}

.InfoBox button.btn-download {
	float: right;
	padding: 15px 10px 15px 40px;
	margin-right: 20px;
	color: #777;
	background-color: #fff;
	font-size: 15px;
	font-weight: 600;
	border: 1px solid #ccc;
	border-radius: 5px;
	outline: none;
	cursor: pointer;
	background: url("./excel.png") no-repeat center left;
	background-size: 30%;
}

.transaction {
	border-collapse: collapse;
	border-spacing: 0;
}

.transaction th {
	color: gray;
	font-weight: 600;
	padding: 20px 5px;
	border-bottom: 1px solid #ccc;
	background-color: #f5f5f5;
}

.transaction td {
	padding: 30px 5px;
	text-align: center;
	border-bottom: 1px solid #ccc;
}
/* page2 */
.Container .TotalBox {
    width: 100%;
    margin-top: 30px;
    background-color: #efefef;
    border-radius: 15px;
}
.Container .TotalBox .Total-table {
    width: 100%;
    border-collapse: collapse;
    border-spacing: 0;
    
}
.Container .TotalBox .Total-table td {
    padding: 25px -1px 25px 100px;
    text-align: left;
}
.Container .TotalBox .Total-table td.num {
    padding-left: 0;
}
.Container .TotalBox .Total-table td.fir-td {
    font-size: 20px;
    text-align: left;
    padding-left: 50px;
    vertical-align: middle;
}
.Container .TotalBox .Total-table td.fir-td small {
    font-size: 20px;
}
.Container .TotalBox .Total-table td.fir-td p:first-child  {
    color: #818181;
    font-size: 17px;
    font-weight: 600;
    padding-bottom: 10px;
    letter-spacing: -1.5px;
}
.Container .TotalBox .Total-table td.fir-td p:last-child  {
    color: #000;
    font-size: 30px;
    font-weight: 600;

}
</style>
<div class="nav-menu board">
	<ul class="nav-tabs clearfix">
		<li id="1"><a class="tab" href="/stocoin/myPage/coinTradeList">코인</a>
		</li>
		<li id="2"><a class="tab" href="/stocoin/myPage/stockTradeList">주식</a>
		</li>
	</ul>
</div>
<div class="InfoBox" style="width: 1500px;">
	<select name="date" id="date">
		<option value="default" selected>날짜 선택</option>
		<option value="date1">100일</option>
		<option value="date1">101일</option>
		<option value="date1">102일</option>
	</select> <input class="date" type="text" placeholder="2021-01-28 ~ 2021-07-26"
		readonly />
	<button>조회</button>
</div>
<div class="table-responsive" id="coinListTableArea">
	<table id="coinListTable" class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>거래일시</th>
				<th>자산</th>
				<th>거래구분</th>
				<th>거래 수량</th>
				<th>거래 금액</th>
				<th>수수료</th>
				<th>정산 금액</th>
				<th>상태</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2021-07-01 17:05:04</td>
				<td>리플<br /> <span>KRW</span>
				</td>
				<td>매수</td>
				<td>3.8876</td>
				<td>769.5</td>
				<td>2,992<br /> <span>KRW</span>
				</td>
				<td>7.48</td>
				<td>-2,999</td>
			</tr>
			<tr>
				<td>2021-07-01 16:56:08</td>
				<td>원화<br /> <span>KRW</span>
				</td>
				<td>가입축하금</td>
				<td>3,000</td>
				<td>0.0000</td>
				<td><span>3,000</span><br /> <span>KRW</span></td>
				<td>-</td>
				<td>+3,000</td>
			</tr>
		</tbody>
	</table>
</div>
<div class="Container">
	<div class="TotalBox">
		<table class="Total-table">
			<colgroup>
				<col width="">
				<col width="">
				<col width="">
				<col width="">
				<col width="">
			</colgroup>
			<tbody style="height: 159px;">
				<tr>
					<td rowspan="2" class="fir-td" style="padding-left: 10px;">
						<p class="total-text">총 보유자산</p>
						<p class="total-number">
							2,956 <small>원</small>
						</p>
					</td>
					<td >총 수익률</td>
					<td class="num">-1.24%</td>
					<td>총 매수금액(KRW)</td>
					<td class="num">2,992원</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
	<div class="card-item-body">
		<div class="card-item">
			<div class="card-title">
				<span class="">평가손익</span>
			</div>
			<div class="card-info">
				<p>
					<span
						class="card-value">-87</span>
					<span class="card-unit">원</span>
				</p>
			</div>
		</div>
	</div>
	<div class="input_box center">
		<input class="btn btn-outline-primary col-3" value="정보수정"
			onclick="location.href='/stocoin/member/updateForm'" /> <input type="button"
			id="logout" class="btn btn-outline-primary col-3" value="로그아웃"
			onclick="logOut()" />
	</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var table;
	$(function() {
		table = document.getElementById("financeTable");
		addRow(2);
		addData(2, "ifrs-full_EquityAndLiabilities"); // 부채와 자본 총계
		addRow(3);
		addData2(3, "ifrs-full_CurrentAssets", "ifrs-full_CurrentLiabilities", "유동비율");
		addRow(4);
		addData2(4, "ifrs-full_Liabilities", "ifrs-full_Equity", "부채비율");
		addRow(5);
		addData2(5, "dart_OperatingIncomeLoss", "ifrs-full_Revenue", "영업이익률");
	});
	function addRow(index) {
		var row = table.insertRow(index);
		row.insertCell(0);
		row.insertCell(1);
		row.insertCell(2);
		row.insertCell(3);
	}
	function addData(index, id) {
		var row = document.getElementById(id);
		
		table.rows[index].cells[0].innerHTML = row.cells[0].innerHTML;
		table.rows[index].cells[1].innerHTML = row.cells[1].innerHTML;
		table.rows[index].cells[2].innerHTML = row.cells[2].innerHTML;
		table.rows[index].cells[3].innerHTML = row.cells[3].innerHTML;
	}
	function addData2(index, id1, id2, name) {
		var row1 = document.getElementById(id1);
		var row2 = document.getElementById(id2);
		table.rows[index].cells[0].innerHTML = name;
		table.rows[index].cells[1].innerHTML = Math.floor(100 * row1.cells[1].innerHTML.replaceAll(",","") / row2.cells[1].innerHTML.replaceAll(",","") ) + "%";
		table.rows[index].cells[2].innerHTML = Math.floor(100 * row1.cells[2].innerHTML.replaceAll(",","")  / row2.cells[2].innerHTML.replaceAll(",","") ) + "%";
		table.rows[index].cells[3].innerHTML = Math.floor(100 * row1.cells[3].innerHTML.replaceAll(",","")  / row2.cells[3].innerHTML.replaceAll(",","") ) + "%";
	}
</script>
<link href="//bootswatch.com/5/cyborg/bootstrap.css" rel="stylesheet" id="cyborg">
<style type="text/css">
	.table td {
		text-align: right;
	}
	
	.table td:nth-child(1) {
		text-align: left;
	}
	.table th {
		text-align: center;
	}
</style>
</head>
<body>
	<div class="container">
		<table class="table" id="financeTable">
			<thead>
				<tr class="table-dark">
					<th></th>
					<th>${fsList[0].get('bfefrmtrm_nm') }</th>
					<th>${fsList[0].get('frmtrm_nm') }</th>
					<th>${fsList[0].get('thstrm_nm') }</th>
				</tr>
			</thead>
			<tbody>
				<tr class="table-secondary">
					<td colspan="4" style="text-align:center;">요약 정보</td>
				</tr>
				<c:forEach var="fs" items="${fsList}" varStatus="status">
					<c:if test="${fs.get('sj_nm') ne fsList[status.index - 1].get('sj_nm')}">
						<tr class="table-secondary">
							<td colspan="4" style="text-align:center;">${fs.get('sj_nm') }</td>
						</tr>
					</c:if>
					<tr id="${fs.get('account_id') }">
						<td>${fs.get('account_nm') }</td>
						<td><fmt:formatNumber value="${fs.get('bfefrmtrm_amount') }"></fmt:formatNumber></td>
						<td><fmt:formatNumber value="${fs.get('frmtrm_amount') }"></fmt:formatNumber></td>
						<td><fmt:formatNumber value="${fs.get('thstrm_amount') }"></fmt:formatNumber></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
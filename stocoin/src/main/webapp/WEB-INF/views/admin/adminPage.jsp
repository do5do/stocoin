<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/myPage.css">
<script type="text/javascript">
	function del(id) {
		var con = confirm("정말로 탈퇴 처리 하시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/memberOut/id/" + id;
		} 
	}
	function updateCoin(id) {
		var con = confirm("입금시키시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/updateCoinMoney/id/" + id;
		} 
	}
	function updateStock(id) {
		var con = confirm("입금시키시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/updateStockMoney/id/" +id;
		} 
	}
	function updateAllStock() {
		var con = confirm("입금시키시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/updateAllStock";
		} 
	}
	function updateAllCoin() {
		var con = confirm("입금시키시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/updateAllCoin";
		} 
	}
</script>
</head>
<body>
	<div class="container admin">
		<h2 class="title" align="center">회원관리</h2>
	
		<table class="table table-hover">
			<thead>
				<tr>
					<th style="padding-left:20px;">회원번호</th>
					<th>닉네임</th>
					<th>가입일</th>
					<th>ID상태</th>
					<th>코인 잔액</th>
					<th>주식 잔액</th>
					<th>입금</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${list}">
					<tr>
						<td>${member.mno }</td>
						<td>${member.nick }</td>
						<td>${member.reg_date }</td>
						<c:choose>
							<c:when test="${member.del eq 'y'}"><td>탈퇴</td></c:when>
							<c:when test="${member.del eq 'n'}"><td>가입</td></c:when>
						</c:choose>
						<td>${member.coin_money}원</td>
						<td>${member.stock_money}원</td>
						<td class="memberMoney"><a onclick="updateCoin('${member.id}')">코인</a> / <a onclick="updateStock(${member.id})">주식</a></td>
						<td><a onclick="del(${member.id})">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="input_box right">
			<a href="/stocoin/admin/resetMoney" class="btn btn-primary col-2">잔액 초기화</a>
			<a class="btn btn-primary col-1" onclick="updateAllCoin()">코인</a>
			<a class="btn btn-primary col-1" onclick="updateAllStock()">주식</a>
			<a href="/stocoin/admin/adminLogout" class="btn btn-primary col-2">관리자 로그아웃</a>
		</div>
		
		<!-- 페이징 시작 -->
		<ul class="pagination">
			<c:if test="${pb.startPage > pb.pagePerBlock }">
				<li>
					<a href="/stocoin/admin/adminPage?pageNum=1"><span class="arrow"></span><span class="arrow arrow2"></span></a>
				</li>
				<li>
					<a href="/stocoin/admin/adminPage?pageNum=${pb.startPage - 1 }"><span class="arrow"></span></a>
				</li>
			</c:if>
			<c:forEach var="i" begin="${pb.startPage }" end="${pb.endPage }">
				<c:if test="${pb.currentPage == i }">
					<li class="active">
						<a href="/stocoin/admin/adminPage?pageNum=${i }">${i }</a>
					</li>
				</c:if>
				<c:if test="${pb.currentPage != i }">
					<li>
						<a href="/stocoin/admin/adminPage?pageNum=${i }">${i }</a>
					</li>
				</c:if>
			</c:forEach>
			<c:if test="${pb.endPage < pb.totalPage }">
				<li>
					<a href="/stocoin/admin/adminPage?pageNum=${pb.endPage + 1 }"><span class="arrow right"></span></a>
				</li>
				<li>
					<a href="/stocoin/admin/adminPage?pageNum=${pb.totalPage }"><span class="arrow right"></span><span class="arrow right arrow2"></span></a>
				</li>
			</c:if>
		</ul>
	</div>
</html>
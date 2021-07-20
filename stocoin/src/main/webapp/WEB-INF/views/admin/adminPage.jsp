<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/stocoin/resources/css/admin/adminPage.css">
<script type="text/javascript">
	function del(id) {
		var con = confirm("정말로 탈퇴 처리 하시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/memberOut/id/" + id;
		} 
	}
</script>
</head>
<body>
	<div id="content_right" class="col-xl-9 col-lg-8 col-md-7 col-7">
		<h4>관리자 메뉴</h4>
	</div>
	<div class="col-10 bd-content">
		<div class="mt-5 mb-5">
			<font color="white" size="6">회원관리</font>
		</div>
		
		<table class="table table-hover">
			<thead class="table-primary">
				<tr class="table-dark">
					<th style="width: 5%">선택</th>
					<th style="width: 12%">회원번호</th>
					<th style="width: 10%">닉네임</th>
					<th style="width: 20%">가입일</th>
					<th style="width: 10%">ID상태</th>
					<th style="width: 10%">삭제</th>
				</tr>
			</thead>
			<tbody class="table-light">
				<c:forEach var="member" items="${list}">
					<tr class="table-dark">
						<td>
							<input type="checkbox" name="id" value="${member.id }">
						</td>
						<td>${member.mno }</td>
						<td>${member.nick }</td>
						<td>${member.reg_date }</td>
						<td><c:choose>
								<c:when test="${member.del eq 'y'}">탈퇴</c:when>
								<c:when test="${member.del eq 'n'}">가입</c:when>
							</c:choose></td>
						<td><a onclick="del(${member.id})">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="adminLogout.do" class="btn btn-info">로그아웃</a>
		
		<div align="center">
			<nav aria-label="Page navigation example">
				<ul class="pagination justify-content-center">
					<c:if test="${startPage > PAGE_PER_BLOCK}">
						<li class="page-item"><a class="page-link"
							href="adminPage.do?&pageNum=${startPage - 1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>
					<c:forEach var="i" begin="${startPage}" end="${endPage}">
						<c:choose>
							<c:when test="${currentPage eq i }">
								<li class="page-item active" aria-current="page"><a
									class="page-link" href="adminPage.do?&pageNum=${i}">${i}</a></li>
							</c:when>
							<c:otherwise>
								<li class="page-item"><a class="page-link"
									href="adminPage.do?&pageNum=${i}">${i}</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					<c:if test="${endPage < totalPage}">
						<li class="page-item"><a class="page-link"
							href="adminPage.do?&pageNum=${endPage + 1}" aria-label="Next">
								<span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
				</ul>
			</nav>
		</div>
	</div>
</html>
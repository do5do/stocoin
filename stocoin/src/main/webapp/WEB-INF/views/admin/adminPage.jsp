<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
	.admin.container {
		margin-top: 0;
		margin-bottom: 0;
	}
	
	.table {
		text-align:left;
		margin: 40px auto;
	}
</style>
<script type="text/javascript">
	function del(id) {
		var con = confirm("정말로 탈퇴 처리 하시겠습니까?");
		if (con) {
			location.href = "/stocoin/admin/memberOut/id/" + id;
		} 
	}
	
	$(function() {
		// tab active control
		$('#1').addClass('active');
		
		var curUrl = window.location.href;
		var sliceUrl = curUrl.split("=")[1];
		
		if (sliceUrl == null || sliceUrl == 1) {
			$('#'+sliceUrl).addClass("active");
		} else if (sliceUrl == 2) {
			$('.tabs li').removeClass('active');
			$('#'+sliceUrl).addClass("active");
		}
	})
</script>
</head>
<body>
	<div class="container admin">
		<ul class="tabs" >
			<li id="1">
				<a class="tab" href="/stocoin/admin/adminPage">회원 관리</a>
			</li>
			<li id="2">
				<a class="tab" href="/stocoin/board/boardList?types=2">게시판 관리</a>
			</li>		
			<li>
				<a class="tab" href="">주식 관리</a>
			</li>
			<li>
				<a class="tab" href="">코인 관리</a>
			</li>
		</ul>
	
		<table class="table table-hover">
			<thead>
				<tr>
					<th class="col-2" style="padding-left:20px;">회원번호</th>
					<th class="col-2">닉네임</th>
					<th class="col-3">가입일</th>
					<th class="col-3">ID상태</th>
					<th class="col-2">삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${list}">
					<tr>
						<td style="padding-left:20px;">${member.mno }</td>
						<td>${member.nick }</td>
						<td>${member.reg_date }</td>
						<c:choose>
							<c:when test="${member.del eq 'y'}"><td>탈퇴</td></c:when>
							<c:when test="${member.del eq 'n'}"><td>가입</td></c:when>
						</c:choose>
						<td><a onclick="del(${member.id})">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<div align="right">
			<a href="adminLogout.do" class="btn btn-primary col-2">관리자 로그아웃</a>
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
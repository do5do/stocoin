<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/board.css">
<script type="text/javascript">
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
	<div class="container col-8 board">
		<ul class="tabs">
			<li id="1">
				<a class="tab" href="/stocoin/board/boardList?types=1">뉴스</a>
			</li>
			<li id="2">
				<a class="tab" href="/stocoin/board/boardList?types=2">공지사항</a>
			</li>		
			<li>
				<a class="tab" href="">문의글</a>
			</li>
		</ul>
		<div class="news">
			<ul>
				<c:if test="${empty list }">
					<p class="emptyList">게시글이 없습니다.</p>
				</c:if>
				<c:if test="${not empty list }">
					<c:forEach var="board" items="${list }">
						<li onclick="location.href='/stocoin/board/boardDetail/bno/${board.bno}/types/${types}'">
							<div class="left">
								<p>${board.title }</p>
								<p class="date">${board.dates }</p>
							</div>
							<div class="right">
								<p class="views"><i class="far fa-eye icon"></i>${board.views }</p>
							</div>
						</li>
					</c:forEach>
				</c:if>
			</ul>
		</div>
		<!-- paging -->
		<ul class="pagination">
			<c:if test="${pb.startPage > pb.pagePerBlock }">
				<li>
					<a href="/stocoin/board/boardList?pageNum=1"><span class="arrow"></span><span class="arrow arrow2"></span></a>
				</li>
				<li>
					<a href="/stocoin/board/boardList?pageNum=${pb.startPage - 1 }"><span class="arrow"></span></a>
				</li>
			</c:if>
			<c:forEach var="i" begin="${pb.startPage }" end="${pb.endPage }">
				<c:if test="${pb.currentPage == i }">
					<li class="active">
						<a href="/stocoin/board/boardList?pageNum=${i }">${i }</a>
					</li>
				</c:if>
				<c:if test="${pb.currentPage != i }">
					<li>
						<a href="/stocoin/board/boardList?pageNum=${i }">${i }</a>
					</li>
				</c:if>
			</c:forEach>
			<c:if test="${pb.endPage < pb.totalPage }">
				<li>
					<a href="/stocoin/board/boardList?pageNum=${pb.endPage + 1 }"><span class="arrow right"></span></a>
				</li>
				<li>
					<a href="/stocoin/board/boardList?pageNum=${pb.totalPage }"><span class="arrow right"></span><span class="arrow right arrow2"></span></a>
				</li>
			</c:if>
		</ul>
		
		<button class="btn btn-outline-primary" onclick="location.href='/stocoin/board/boardWriteForm?types=${types}'">임시 글쓰기 버튼</button>
		<button class="btn btn-outline-primary col-2" onclick="location.href='/stocoin/board/insertBoard'">insertBoard</button>
	</div>
</body>
</html>
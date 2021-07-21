<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/board.css">
<c:set var="id" value='${sessionScope.id}'></c:set>
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
		} else {
			$('.tabs li').removeClass('active');
			$('#'+sliceUrl).addClass("active");
		}
	})
	
	// 문의글 작성하기 session check
	function sessionChk() {
		if (${empty id}) {
			var con = confirm("로그인이 필요합니다.");
			if (con) {
				var curUrl = window.location.pathname;
				$.post("/stocoin/login2", "curUrl="+curUrl, function(data) {});
				location.href="https://kauth.kakao.com/oauth/authorize?client_id=8d7498ce8ee97c514f96feb042750e1e&redirect_uri=http://localhost:8080/stocoin/login&response_type=code";
			}
		} else {
			location.href='/stocoin/board/qaWriteForm';
		}
	}
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
			<li id="3">
				<a class="tab" href="/stocoin/board/qaList?types=3">문의글</a>
			</li>
		</ul>
		<div class="contents">
			<ul>
				<!-- news, notice -->
				<c:if test="${types != 3 }">
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
				</c:if>
				<!-- 문의하기 -->
				<c:if test="${types == 3 }">
				<c:if test="${empty list }">
					<p class="emptyList">게시글이 없습니다.</p>
				</c:if>
					<c:if test="${not empty list }">
						<c:forEach var="qna" items="${list }">
							<li onclick="location.href='/stocoin/board/boardDetail/bno/${board.bno}/types/${types}'">
								<div class="left">
									<p>${qna.title }</p>
									<p class="date">${qna.dates }</p>
								</div>
								<c:if test="${secret == 'y' }">
									<div class="right">
										<p class="views"><i class="far fa-lock-alt icon"></i>비밀글</p>
									</div>
								</c:if>
							</li>
						</c:forEach>
					</c:if>
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
		<c:if test="${types != 3 }">		
			<button class="btn btn-outline-primary" onclick="location.href='/stocoin/board/boardWriteForm?types=${types}'">임시 글쓰기 버튼</button>
			<button class="btn btn-outline-primary col-2" onclick="location.href='/stocoin/board/insertBoard?types=${types}'">insertBoard</button>
		</c:if><c:if test="${types == 3 }">
		
			<button class="btn btn-outline-primary" onclick="sessionChk()"><i class="fas fa-pen"></i>문의하기</button>
		</c:if>
	</div>
</body>
</html>
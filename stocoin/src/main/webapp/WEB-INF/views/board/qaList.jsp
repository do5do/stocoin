<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/board.css">
<c:set var="id" value='${sessionScope.id}'></c:set>
<c:set var="mno" value='${sessionScope.mno}'></c:set>
<script type="text/javascript">
	$(function() {
		// tab active control
		$('#tab3').addClass('active');
		
		var curUrl = window.location.href;
		var sliceUrl = curUrl.split("?")[1].split("&")[0].split("=")[1];
		
		if (sliceUrl == null || sliceUrl == 1) {
			$('#tab'+sliceUrl).addClass("active");
		} else if (sliceUrl == 2) {
			$('.tabs li').removeClass('active');
			$('#tab'+sliceUrl).addClass("active");
		} else {
			$('.tabs li').removeClass('active');
			$('#tab'+sliceUrl).addClass("active");
		}
	})
	
	// 문의글 작성하기 session check
	function sessionChk() {
	   if (${empty id}) {
	      var con = confirm("로그인이 필요합니다.");
	      if (con) {
	         var curUrl = window.location.pathname;
	         $.post("/stocoin/login2", "curUrl="+curUrl, function(data) {});
	         location.href="https://kauth.kakao.com/oauth/authorize?client_id=8d7498ce8ee97c514f96feb042750e1e&redirect_uri=http://" + "${ss.getIP()}" + "/stocoin/login&response_type=code";
	      }
	   } else {
	      location.href='/stocoin/board/qaWriteForm';
	   }
	}
	
	// 비밀글 확인
	function secret(mno, qno) {
		if (${not empty id}) {
			if (${id != "admin"}) {
				if ("${mno}" == mno) {
					location.href='/stocoin/board/qaDetail?qno='+qno;
				} else {
					alert('비밀글입니다.');
				}
			} else if (${id == "admin"}) {
				location.href='/stocoin/board/qaDetail?qno='+qno;
			} 
		} else {
			alert('확인하려면 로그인이 필요합니다.');
		}
	}
</script>
</head>
<body>
	<div class="container col-8 board">
		<ul class="tabs">
			<li id="tab1">
				<a class="tab" href="/stocoin/board/boardList?types=1">뉴스</a>
			</li>
			<li id="tab2">
				<a class="tab" href="/stocoin/board/boardList?types=2">공지사항</a>
			</li>		
			<li id="tab3">
				<a class="tab" href="/stocoin/board/qaList?types=3">문의글</a>
			</li>
		</ul>
		<div class="contents">
			<ul>
				<!-- 문의하기 -->
				<c:if test="${empty list }">
					<p class="emptyList">게시글이 없습니다.</p>
				</c:if>
				<c:if test="${not empty list }">
					<c:forEach var="qna" items="${list }">
						<!-- 비밀글 -->
						<c:if test="${qna.secret == 'y' }">
							<li onclick="secret(${qna.mno}, ${qna.qno })">
								<div class="left">
									<p><span class="sub q">Q</span>비밀글 입니다.</p>
									<p class="date">${qna.dates }</p>
								</div>
								<div class="right">
									<p class="views"><i class="fas fa-lock icon"></i>비밀글</p>
								</div>
							</li>
						</c:if>
						<!-- 일반글 -->
						<c:if test="${qna.secret == 'n' }">
							<li onclick="location.href='/stocoin/board/qaDetail?qno=${qna.qno}'">
								<div class="left">
									<p><span class="sub q">Q</span>${qna.title }</p>
									<p class="date">${qna.dates }</p>
								</div>
							</li>
						</c:if>
					</c:forEach>
				</c:if>
			</ul>
		</div>
		<!-- paging -->
		<ul class="pagination">
			<c:if test="${pb.startPage > pb.pagePerBlock }">
				<li>
					<a href="/stocoin/board/qaList?types=${types}&pageNum=1"><span class="arrow"></span><span class="arrow arrow2"></span></a>
				</li>
				<li>
					<a href="/stocoin/board/qaList?types=${types}&pageNum=${pb.startPage - 1 }"><span class="arrow"></span></a>
				</li>
			</c:if>
			<c:forEach var="i" begin="${pb.startPage }" end="${pb.endPage }">
				<c:if test="${pb.currentPage == i }">
					<li class="active">
						<a href="/stocoin/board/qaList?types=${types}&pageNum=${i }">${i }</a>
					</li>
				</c:if>
				<c:if test="${pb.currentPage != i }">
					<li>
						<a href="/stocoin/board/qaList?types=${types}&pageNum=${i }">${i }</a>
					</li>
				</c:if>
			</c:forEach>
			<c:if test="${pb.endPage < pb.totalPage }">
				<li>
					<a href="/stocoin/board/qaList?types=${types}&pageNum=${pb.endPage + 1 }"><span class="arrow right"></span></a>
				</li>
				<li>
					<a href="/stocoin/board/qaList?types=${types}&pageNum=${pb.totalPage }"><span class="arrow right"></span><span class="arrow right arrow2"></span></a>
				</li>
			</c:if>
		</ul>
		<button class="btn btn-outline-primary" onclick="sessionChk()"><i class="fas fa-pen"></i>문의하기</button>
	</div>
</body>
</html>
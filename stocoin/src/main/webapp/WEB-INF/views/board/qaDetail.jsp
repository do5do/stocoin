<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/board.css">
<script type="text/javascript">
	function formOpen() {
		$('form').show();
	}
</script>
</head>
<body>
	<div class="container col-8 board">
		<h2 class="title" align="center">문의글 상세</h2>
		<p class="dates">${qna.dates }</p>
		<div class="content">
			<span class="sub">제목</span>
			<p class="inline_block text">${qna.title }</p>
		</div>
		<div class="content">
			<span class="sub">내용</span>
			<pre class="inline_block text">${qna.content }</pre>
		</div>
		
		<section class="qaDetail_reply">
			<h5 class="sub_title"><span class="sub q">A</span>답변</h5>
			<c:if test="${not empty qr }">
				<p>${qr.content }</p>
			</c:if>
			<c:if test="${empty qr }">
				<p>답변이 작성되지 않았습니다.</p>
			</c:if> 
		</section>
		<div class="input_box">
			<button class="btn btn-outline-primary col-3" onclick="history.go(-1)">목록</button>
			<c:if test="${not empty id}">
				<c:if test="${id == 'admin' }">
						<button class="btn btn-outline-primary col-3" onclick="formOpen()">답변</button>
				</c:if>
			</c:if>
		</div>
		<!-- 관리자에서는 디폴트로 보이게 -->
		<form action="/stocoin/board/qnaReplyWrite" method="post" id="qrFrm">
			<input type="hidden" name="qno" value="${qna.qno}">
			<textarea name="content" placeholder="답변을 작성해주세요." required></textarea>
			<div class="input_box">
				<input type="submit" value="확인" class="btn btn-primary col-4">
			</div>
		</form>
	</div>
</body>
</html>
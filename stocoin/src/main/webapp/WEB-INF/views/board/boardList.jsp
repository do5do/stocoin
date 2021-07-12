<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/bootstrap/css/board.css">
</head>
<body>
	<ul class="tabs">
		<li class="active">
			<a class="tab" href="/stocoin/board/boardList.do/tab/1">뉴스</a>
		</li>
		<li>
			<a class="tab" href="/stocoin/board/boardList.do/tab/2">공지사항</a>
		</li>		
		<li>
			<a class="tab" href="#">문의글</a>
		</li>
	</ul>
	<div class="news">
		<ul>
			<c:forEach var="board" items="${list }">
				<li>
					<div class="left">
						<p>${board.title }</p>
						<p class="date">${board.dates }</p>
					</div>
					<div class="right">
						<p class="views"><i class="far fa-eye"></i>${board.views }</p>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>
	<button class="btn btn-outline-primary" onclick="location.href='/stocoin/board/boardWriteForm'">임시 글쓰기 버튼</button>
</body>
</html>
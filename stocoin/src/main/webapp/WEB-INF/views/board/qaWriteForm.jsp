<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/stocoin/resources/css/board.css">
</head>
<body>
	<div class="container col-8 board">
		<h2 class="title" align="center">문의 글 작성</h2>
		<form action="/stocoin/board/qaWriteResult" method="post">
			<input type="text" id="title" name="title" placeholder="제목을 입력해주세요." required autofocus>
			<textarea name="content" required placeholder="내용을 입력해주세요."></textarea>
			<input type="checkbox" name="secret" id="s" value="y">
			<label for="s">비밀글</label>
		
			<div class="input_box">
				<input type="submit" class="btn btn-primary col-5" value="저장">
				<input type="button" class="btn btn-outline-primary" value="취소/목록" onclick="history.go(-1)">
			</div>
		</form>
	</div>
</body>
</html>
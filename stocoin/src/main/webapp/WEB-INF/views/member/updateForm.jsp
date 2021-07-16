<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/stocoin/resources/css/member/memberUpdate.css">
</head>
<body>
	<div class="row align-items-center">
		<div class="col form-floating mb-1">
			<h2>회원 정보 수정</h2>
		</div>
	</div>
	<div class="row mb-2 align-items-center">
		<form action="/stocoin/member/update" method="post">
			<input type="hidden" name="id" value="${member.id}"> <label
				for="inputId" class="col-sm-2 col-form-label">닉네임</label>
			<div class="col-sm-4 form-floating">
				<input type="text" class="form-control" name="nick"
					value="${member.nick }">
			</div>
			<div class="d-grid gap-2 col-6 mx-auto">
				<button class="btn btn-lg btn-primary" type="submit">수정완료</button>
			</div>
		</form>
		<a class="mt-2 mb-4 btn btn-danger btn-sm"
			href="https://kauth.kakao.com/oauth/authorize?client_id=8d7498ce8ee97c514f96feb042750e1e&redirect_uri=http://localhost:8080/stocoin/delete&response_type=code">회원탈퇴</a>
	</div>
</body>
</html>
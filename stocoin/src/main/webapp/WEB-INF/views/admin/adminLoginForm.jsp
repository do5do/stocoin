<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3 class="text-primary">관리자 로그인</h3>
		<form action="/stocoin/admin/adminLogin" method="post">
			<table class="table table-hover">
				<tr>
					<td>아이디<span class="glyphicon glyphicon-user"></span></td>
					<td><input type="text" name="id" required="required"
						autofocus="autofocus"></td>
				</tr>
				<tr>
					<td>암호<span class="glyphicon glyphicon-lock"></span></td>
					<td><input type="password" name="pwd" required="required"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" class="btn btn-danger"
						value="확인"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
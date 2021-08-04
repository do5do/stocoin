<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.admin.container {
			margin-top: 0;
			margin-bottom: 0;
		}
		
		.table {
			width: 800px;
			margin: 80px auto 20px;
		}
		
		.white .table {
			border-color: #efefef;
			color: #000;
		}
		
		.id-box, .pw-box {
			text-align: center;
			vertical-align: middle;
		}
		
		.id-inputbox {
			vertical-align: middle;
		}
	</style>
</head>
<body>
	<div class="container admin">
		<h2 class="title" align="center">관리자 로그인</h2>
		<form action="/stocoin/admin/adminLogin" method="post">
			<table class="table">
				<tr>
					<td class="id-box">아이디 <span class="glyphicon glyphicon-user"></span>
					</td>
					<td class="id-inputbox"><input type="text" name="id"
						required="required" autofocus="autofocus" placeholder="아이디를 입력하세요" />
					</td>
				</tr>
				<tr>
					<td class="pw-box">비밀번호 <span class="bi bi-align-start"></span>
					</td>
					<td><input type="password" name="pwd" required="required"
						placeholder="비밀번호를 입력하세요"></td>
				</tr>
			</table>
			<div class="input_box">
				<input type="submit" value="확인" class="btn btn-primary col-4">
			</div>
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<script type="text/javascript">
		function logOut() {
			location.href="https://kauth.kakao.com/oauth/logout?client_id=8d7498ce8ee97c514f96feb042750e1e&logout_redirect_uri=http://${ss.getIP()}/stocoin/logout";
		}
	</script>
	<a onclick="logOut()" id="logout">로그아웃</a>
	<a href="/stocoin/member/updateForm">정보 수정</a>
</body>
</html>
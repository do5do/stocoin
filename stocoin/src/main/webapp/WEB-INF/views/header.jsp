<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	// nav active control 나중에 추가
	$(document).ready(function() {
		var curUrl = window.location.href;
		var sliceUrl = curUrl.split("/")[4];
		
		$('#'+sliceUrl).addClass("active");
		console.log(sliceUrl);
	});
</script>

<header>
	<div class="container">
		<div class="logo">
			<a href="#"><img alt="로고" src='/stocoin/resources/images/logo.png'></a>
		</div>
		<nav>
			<ul>
				<li><a href="#" id="coin">코인</a></li>
				<li><a href="#" id="stock">주식</a></li>
				<li><a href="#" id="board">게시판</a></li>
				<li><a href="#" id="login">로그인</a></li>
				<li><a href="#" id="login">조절</a></li>
				<!-- 나중에 세션으로 로그인/마이페이지/관리자페이지 중 뭐 보여줄지 제어해야함 -->
				<!-- <li><a href="#">마이페이지</a></li> -->
				<!-- <li><a href="#">관리자페이지</a></li> -->
			</ul>
		</nav>
	</div>
</header>
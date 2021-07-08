<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	$(document).ready(function() {
		// nav active control
		var curUrl = window.location.href;
		var sliceUrl = curUrl.split("/")[4];
		
		$('#'+sliceUrl).addClass("active");
		
		// mode 제어
		$('#mode_btn').on('click', function() {
			if (!$('#mode_btn').hasClass('active')) {
				$('header').addClass('white');
				$('footer').addClass('white');
				$('body').css('background', '#fff');
				$('*').css('color', '#000');
				
				$('#mode_btn').addClass('active');
				$('#mode_btn figure img').attr('src', '/stocoin/resources/images/sun.svg');
				//$('head').append('<link id="white" rel="stylesheet" type="text/css" href="/stocoin/resources/bootstrap/css/bootstrap_white.css">')
			} else {
				$('header').removeClass('white');
				$('footer').removeClass('white');
				$('body').css('background', 'var(--bg-color)');
				$('*').css('color', '#fff');
				
				$('#mode_btn').removeClass('active');
				$('#mode_btn figure img').attr('src', '/stocoin/resources/images/moon.svg');
				//$('head').find('link#white').remove();
			}
		})
	});
</script>

<header>
	<div class="container">
		<div class="logo">
			<a href="#"><img alt="로고" src='/stocoin/resources/images/logo.png'></a>
		</div>
		<nav>
			<ul>
				<li><a href="coin/coinList" id="coin">코인</a></li>
				<li><a href="stock/stockList" id="stock">주식</a></li>
				<li><a href="board/boardList" id="board">게시판</a></li>
				<li><a href="#" id="login">로그인</a></li>
				<li id="mode_btn">
					<figure><img src="/stocoin/resources/images/moon.svg"></figure>
				</li>
				<!-- 나중에 세션으로 로그인/마이페이지/관리자페이지 중 뭐 보여줄지 제어해야함 -->
				<!-- <li><a href="#">마이페이지</a></li> -->
				<!-- <li><a href="#">관리자페이지</a></li> -->
			</ul>
		</nav>
	</div>
</header>
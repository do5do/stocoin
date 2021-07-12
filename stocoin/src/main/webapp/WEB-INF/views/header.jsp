<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
	$(document).ready(function() {
		// nav active control
		var curUrl = window.location.href;
		var sliceUrl = curUrl.split("/")[4];
		
		$('#'+sliceUrl).addClass("active");
		
		// mode 제어
		$('#mode_btn').on('click', function() {
			if (!$('#mode_btn').hasClass('active')) {
				$('header, footer, body').addClass('white');
				$('body').css('background', '#fff');
				$('*').css('color', '#000');
				// summernote 제어
				$('#summer_iframe').contents().find('#title').css('color', 'black');
				$('#summer_iframe').contents().find('link#cyborg').remove();
				
				$('#mode_btn').addClass('active');
				$('#mode_btn figure img').attr('src', '/stocoin/resources/images/sun.svg');
			} else {
				$('header, footer, body').removeClass('white');
				$('body').css('background', 'var(--bg-color)');
				$('*').css('color', '#fff');
				// summernote 제어
				$('#summer_iframe').contents().find("#title").css('color', '#fff');
				$('#summer_iframe').contents().find('link#before').before('<link href="//bootswatch.com/3/cyborg/bootstrap.css" rel="stylesheet" id="cyborg">');
				
				$('#mode_btn').removeClass('active');
				$('#mode_btn figure img').attr('src', '/stocoin/resources/images/moon.svg');
			}
		})
	});
</script>

<header>
	<div class="container">
		<div class="logo">
			<a href="/stocoin/coin/coinList"><img alt="로고" src='/stocoin/resources/images/logo.png'></a>
		</div>
		<nav>
			<ul>
				<li><a href="/stocoin/coin/coinList" id="coin">코인</a></li>
				<li><a href="/stocoin/stock/stockList" id="stock">주식</a></li>
				<li><a href="/stocoin/board/boardList" id="board">게시판</a></li>
				<li><a href="https://kauth.kakao.com/oauth/authorize?client_id=8d7498ce8ee97c514f96feb042750e1e&redirect_uri=http://localhost:8080/stocoin/coin/coinList&response_type=code" id="login">로그인</a></li>
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
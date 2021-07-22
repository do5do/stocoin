<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings" scope="page" />
<c:set var="id" value='${sessionScope.id}'></c:set>
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
				$('#summer_iframe').contents().find('script#after').after('<link href="//bootswatch.com/3/cyborg/bootstrap.css" rel="stylesheet" id="cyborg">');
				
				$('#mode_btn').removeClass('active');
				$('#mode_btn figure img').attr('src', '/stocoin/resources/images/moon.svg');
			}
		})
	});
	
	function login() {
		var curUrl = window.location.pathname;
		$.post("/stocoin/login2", "curUrl="+curUrl, function(data) {});
		location.href="https://kauth.kakao.com/oauth/authorize?client_id=8d7498ce8ee97c514f96feb042750e1e&redirect_uri=http://" + "${ss.getIP()}" + "/stocoin/login&response_type=code";
	}
	
	function chat() {
		var form = document.createElement("form");
		var parm = new Array();
		var input = new Array();
		
		window.open("", "Chatting", "width=500,height=600");
		form.action = "http://" + "${ss.getIP()}" + "/stocoin/chat";
		form.target = "Chatting";
		form.method = "post";

		parm.push([ 'nick', '${nick}' ]);

		for (var i = 0; i < parm.length; i++) {
			input[i] = document.createElement("input");
			input[i].setAttribute("type", "hidden");
			input[i].setAttribute('name', parm[i][0]);
			input[i].setAttribute("value", parm[i][1]);
			form.appendChild(input[i]);
		}
		document.body.appendChild(form);
		form.submit();
	}
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
				<li><a onclick="chat()" id="stock">채팅</a></li>
				<li><a href="/stocoin/board/boardList" id="board">게시판</a></li>
				<c:if test="${empty id}">
					<li><a onclick="login()" id="login">로그인</a></li>
				</c:if>
				<c:if test="${not empty id}">
					<c:if test="${id == 'admin' }">
						<li><a href="/stocoin/admin/adminPage" id="admin">관리 페이지</a></li>
					</c:if>
					<c:if test="${id != 'admin' }">
						<li><a href="/stocoin/myPage/myCoinList" id="myPage">마이페이지</a></li>
					</c:if>
				</c:if>
				<li id="mode_btn">
					<figure><img src="/stocoin/resources/images/moon.svg"></figure>
				</li>
			</ul>
		</nav>
	</div>
</header>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.model.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	.btn-primary {
		background-color: #19f !important;
		border-radius: 0;
	}
</style>
<script type="text/javascript">
	var websocket; // function밖으로 빼변 전역변수로 활용
	var nick;  // 별명
	var access = false;
	$(function() {
		connect();
		$('#sendBtn').click(function() {	send();			});
		$('#message').keypress(function() {
			//  누른 키 assccii값    IE면?   IE key값           IE아니 키
			var keycode = event.keyCode?event.keyCode:event.which;
			if (keycode == 13) { // 13이 enter(ascii값)
				send();
			}
		});
	});
	function connect() {
		//                            server ip           servlet-context에 등록된 이름
		websocket = new WebSocket("ws://" + "${ss.getIP()}" + "/stocoin/chat-ws.do");
		websocket.onopen = Open;
		websocket.onmessage = onMessage;
	}
	function disconnect() {
		websocket.close();
	}
	function send() {
		if(access) {
			var msg = $('#message').val();  // 입력한 메세지 글 읽기
			websocket.send(nick+" : "+msg); // 메세지를 별명과 함께 보내기
			$('#message').val("");  // 메세지에 입력한 글 지우기
		}
	}
	function Open() {
		nick = "${param.nick}"; // 별명 가져오기
		if(nick == "undefined" || nick == null || nick == "") {
			var element = document.getElementById('message');
			  element.value = "로그인 후에 이용가능합니다";
			  element.readOnly = true;
		}
		else {
			access = true;
		}
	}
	function onMessage(event) {
		var msg = event.data;   // 메세지가 event에 data속성으로 들어 온다
		appendMessage(msg);
	}
	function appendMessage(msg) {
		$('#chatMessage').append(msg+"<br>");
	/* 	채팅창에 글이 꽉 찾을 경우에 최신 글이 하단에 보이게  */
		var objDiv = document.getElementById("chatMessage");
		objDiv.scrollTop = objDiv.scrollHeight;
	}
</script>
</head>
<body>
	<div class="container">
		<table class="table table-hover">
			<tr>
				<td>메세지</td>
				<td><input type="text" id="message" class="form-control" style=" background-color: rgba(0, 0, 0, 0);"></td>
				<td><input type="button" id="sendBtn" value="전송" class="btn btn-sm btn-primary"></td>
			</tr>
			<tr>
				<td>대화영역</td>
				<td colspan="2"><div id="chatMessage"></div></td>
			</tr>
		</table>
	</div>
</body>
</html>
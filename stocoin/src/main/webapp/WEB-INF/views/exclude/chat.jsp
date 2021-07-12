<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.StocoinStrings" scope="page" />
<!DOCTYPE html><html><head><meta charset="UTF-8"><title>Insert title here</title>
<script type="text/javascript">
	var websocket; // function밖으로 빼변 전역변수로 활용
	var nickname;  // 별명
	$(function() {
		$('#enterBtn').click(function() {	connect(); 		});
		$('#exitBtn').click(function() {	disconnect();	});
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
		websocket.onclose = onClose;
	}
	function disconnect() {
		websocket.close();
	}
	function send() {
		var msg = $('#message').val();  // 입력한 메세지 글 읽기
		websocket.send(nickname+"=>"+msg); // 메세지를 별명과 함께 보내기
		$('#message').val("");  // 메세지에 입력한 글 지우기
	}
	function Open() {
		nickname = $('#nickname').val(); // 별명 가져오기
		appendMessage(nickname+"님이 입장 하였습니다");
	}
	function onMessage(event) {
		var msg = event.data;   // 메세지가 event에 data속성으로 들어 온다
		appendMessage(msg);
	}
	function onClose() {
		appendMessage(nickname+"님이 퇴장 하였습니다");
	}
	function appendMessage(msg) {
		$('#chatMessage').append(msg+"<br>");
	/* 	채팅창에 글이 꽉 찾을 경우에 최신 글이 하단에 보이게  */
		var objDiv = document.getElementById("chatMessage");
		objDiv.scrollTop = objDiv.scrollHeight;
	}
</script>
</head><body>
<div class="container">
<table class="table table-hover">
	<tr><td width="20%">별명</td><td><input type="text" id="nickname">
		<input type="button" id="enterBtn" value="입장" class="btn btn-info btn-sm">
		<input type="button" id="exitBtn" value="퇴장" class="btn btn-sm btn-warning"></td></tr>
	<tr><td>메세지</td><td><input type="text" id="message">
		<input type="button" id="sendBtn" value="전송" class="btn btn-sm btn-success"></td></tr>
	<tr><td>대화영역</td><td><div id="chatMessage"></div></td></tr>
</table>
</div>
</body>
</html>
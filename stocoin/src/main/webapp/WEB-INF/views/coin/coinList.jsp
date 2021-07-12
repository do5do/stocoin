<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="ss" class="com.sc.stocoin.StocoinStrings" scope="page" />
<!DOCTYPE html>
<html>
<head>
</head>
<script type="text/javascript">
	function chat() {
		var win = window.open("http://" + "${ss.getIP()}" + "/stocoin/chat", "PopupWin", "width=500,height=600");
	}
</script>
<body>
askdfjsldifj!!!!
<button class="btn btn-success" onclick="chat()">채팅</button>
<br>
<button class="btn btn-success" onclick="location.href='../testPy'">테스트</button>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${result > 0  }">
		<script type="text/javascript">
			var referrer = document.referrer.slice(21);
			if (referrer == "/stocoin/member/updateForm") {
				location.href="/stocoin/myPage/myCoinList";
			} else {
				location.href="/stocoin/coin/coinList";
			} 
		</script>
	</c:if>
	
	<c:if test="${result == 0  }">
		<script type="text/javascript">
			alert("닉네임 중복체크를 해주세요");
			history.go(-1);
		</script>
	</c:if>
</body>
</html>
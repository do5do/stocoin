<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<c:if test="${result > 0 }">
		<script type="text/javascript">
			alert('삭제 완료!');
			location.href="/stocoin/board/boardList?types=${types}";
		</script>
	</c:if>
	<c:if test="${result <= 0 }">
		<script type="text/javascript">
			alert('삭제 실패!');
			history.go(-1);
		</script>
	</c:if>
</body>
</html>
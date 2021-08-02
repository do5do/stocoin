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
			alert('체결 성공!');
			location.href='/stocoin/stock/stockList';
		</script>
	</c:if>
	<c:if test="${result == 0 }">
		<script type="text/javascript">
			alert('체결 실패!');
			history.go(-1);
		</script>
	</c:if>
	<c:if test="${result == -1 }">
		<script type="text/javascript">
			alert('해당 주가 없습니다.');
			history.go(-1);
		</script>
	</c:if>
	<c:if test="${result == -2 }">
		<script type="text/javascript">
			alert('해당 주가 부족합니다.');
			history.go(-1);
		</script>
	</c:if>
</body>
</html>
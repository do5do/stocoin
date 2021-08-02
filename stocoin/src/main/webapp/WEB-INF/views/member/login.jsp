<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
	<c:if test="${result == 0}">
		<script type="text/javascript">	
			alert("환영합니다!");
			location.href = "${prevUrl}";
		</script>
	</c:if>
	
	<c:if test="${result == 1}">
		<script type="text/javascript">	
			location.href = "/stocoin/member/joinForm";
		</script>
	</c:if>
</body>
</html>
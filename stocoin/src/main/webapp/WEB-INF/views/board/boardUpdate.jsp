<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h2 class="title" align="center">뉴스 게시글 수정</h2>
	<c:if test="${not empty bno }">
		<iframe id="summer_iframe" src="/stocoin/exclude/summernoteForm?bno=${bno }&types=${types }" style="width:100%; height: 80vh"></iframe>
	</c:if>
	<c:if test="${empty bno }">
		<iframe id="summer_iframe" src="/stocoin/exclude/summernoteForm?types=${types }" style="width:100%; height: 80vh"></iframe>
	</c:if>
</body>
</html>
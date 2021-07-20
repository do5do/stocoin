<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<c:if test="${types == 1 }">
		<h2 class="title" align="center">뉴스 게시글 작성</h2>
	</c:if>
	<c:if test="${types == 2 }">
		<h2 class="title" align="center">공지사항 게시글 작성</h2>
	</c:if>	
	<iframe id="summer_iframe" src="/stocoin/exclude/summernoteForm?types=${types }" style="width:100%; height: 100vh"></iframe>
</body>
</html>
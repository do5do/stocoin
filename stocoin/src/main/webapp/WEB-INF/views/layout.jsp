<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initialscale=1">
<title><tiles:insertAttribute name="title"></tiles:insertAttribute></title>
<link rel="stylesheet" type="text/css" href="/stocoin/resources/bootstrap/css/bootstrap_black.css">
<link rel="stylesheet" type="text/css" href="/stocoin/resources/bootstrap/css/common.css">
<script type="text/javascript" src="/stocoin/resources/bootstrap/js/jquery.js"></script>
<script type="text/javascript" src="/stocoin/resources/bootstrap/js/bootstrap.js"></script>
</head>
<body>
	<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<div class="container">
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
	</div>
	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>
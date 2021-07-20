<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
	/* summernoteForm */
	body {
		background: none;
	}
	
	.input_box {
		text-align: center;
		padding-top: 24px;
	}
	
	/* input */
	input[type="text"] {
		width: 100%;
		height: 48px;
		border: none;
		border-bottom: 1px solid currentColor;
		outline: 0;
		font-size: 15px;
		margin-bottom: 16px;
		font-family: inherit;
		background: none;
		color: #fff;
	}
	
	input[type="text"]::placeholder {
		color: currentColor;
	}
	
	/* bootstrap */
	.btn-primary {
	    color: #ffffff;
	    background-color: #1199ff;
	    border-color: #1199ff;
	    width: 36%;
	    border-radius: 0;
	}
	
	.btn-primary:hover {
		color: #ffffff !important;
	   	background-color: #1199ff;
	   	border-color: #1199ff;
	}
	
	.outline {
		color: #19f;
		border-color: #19f;
		background: none;
		margin-left: 8px;
		width: 10%;
		border-radius: 0;
	}
	
	.btn:hover {
		color: #19f;
	}
	
</style>
<script type="text/javascript">
	$(function() {
		// content 입력 폼
		$('#summernote').summernote({
			height : 400, // 에디터 높이
			minHeight : 400, // 최소 높이
			maxHeight : null, // 최대 높이
			focus : false, // 에디터 로딩후 포커스를 맞출지 여부
			lang : "ko-KR", // 한글 설정
			placeholder : '최대 2048자까지 쓸 수 있습니다' //placeholder 설정
		});
	})
	
	function checkForm() {
		if($('#summernote').summernote('isEmpty')) {
		    preventDefault();
		} else {
			document.iframe_form.target = "_parent";
			
			if (${not empty board}) {
				document.iframe_form.action = "/stocoin/board/boardUpdateResult?types=${types}";
			} else {				
				document.iframe_form.action = "/stocoin/board/boardWriteResult?types=${types}";
			}
			
			document.iframe_form.submit();
		}
	}
</script>
</head>
<body>
	<form method="post" onsubmit="checkForm()" name="iframe_form">
		<input type="hidden" name="types" value="${types }">
		<c:if test="${not empty board }">
			<input type="hidden" name="bno" value="${board.bno }">
			<input type="text" id="title" name="title" placeholder="제목을 입력해주세요." value="${board.title }" required autofocus>
			<textarea id="summernote" name="content" required>${board.content }</textarea>
		</c:if>
		<c:if test="${empty board }">
			<input type="text" id="title" name="title" placeholder="제목을 입력해주세요." required autofocus>
			<!-- 내용 작성 -->
			<textarea id="summernote" name="content" required></textarea>
		</c:if>
		<div class="input_box">
			<input type="submit" class="btn btn-primary" value="저장">
			<input type="button" class="btn outline" value="취소/목록" onclick="history.go(-1)">
		</div>
	</form>
</body>
</html>
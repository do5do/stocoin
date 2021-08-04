<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<c:set var="mno" value="${sessionScope.mno }"></c:set>
<c:set var="id" value="${sessionScope.id }"></c:set>
<head>
	<script type="text/javascript">
	 $(function() {
		 // 댓글 수정
		 $('.btn_update').on('click', function() {
			$(this).parent().siblings('.li_inner').children('.content').attr('contenteditable', 'true');
			$(this).parent().siblings('.li_inner').children('.content').focus();
			
			$(this).parent().hide();
			$(this).parent().siblings('.btn_hide').show();
		})
		
		// 댓글 수정 취소
		$('.btn_update_close').on('click', function() {
			$(this).parent().siblings('.li_inner').children('.content').attr('contenteditable', 'false');
			$(this).parent().hide();
			$(this).parent().siblings('.btn_show').show();
		})
	 })
	 
	 // 댓글 수정 완료
	 function done(bno, rno) {
		var sendData = "content="+$('#content_'+rno).text()+"&bno="+bno+"&rno="+rno;
		
		$.post('/stocoin/board/boardReplyUpdate', sendData, function(data) {
			$('#content_'+rno).attr('contenteditable', 'false');
			$('#hide_'+rno).hide();
			$('#show_'+rno).show();
		})
	 }
	 
	 // 댓글 삭제
	 function replyDel(bno, rno) {
		 var sendData = "bno="+bno+"&rno="+rno;
		 
		 $.post('/stocoin/board/boardReplyDelete', sendData, function(data) {
			 $('#replyLoad').html(data);
		 })
	 }
	 
	 // 댓글 좋아요
	 function likes(bno, rno, mno) {
		 if (${empty id}) {
			 alert('로그인이 필요합니다.');
		 } else {
			 var sendData = "bno="+bno+"&rno="+rno+"&mno="+mno;
			 
			 $.post('/stocoin/board/boardReplyLikes', sendData, function(data) {
				 $('#span_'+rno).text(data);
				 if (data == 1) {
					 $('#likes_'+rno).css('color', 'var(--point-color)');					 
				 } else {
					 $('#likes_'+rno).css('color', '#888');
				 }
			 })
		 }
	 }
	 
	// paging num
	function pagingNum(i) {
		if (i == 'next1') {
			// 다음 버튼
			sendData = 'pageNum='+${pb.endPage + 1 }
		} else if (i == 'next2') {
			// 젤 끝으로
			sendData = 'pageNum='+${pb.totalPage }
		} else if (i == 'prev2') {
			// 젤 처음으로
			sendData = 'pageNum=1'
		} else if (i == 'prev1') {
			// 이전 버튼
			sendData = 'pageNum='+${pb.startPage - 1}
		} else {
			sendData = 'pageNum='+i;
		}
		
		$.post('/stocoin/exclude2/boardReplyList/bno/${bno }', sendData, function(data) {
			$('#replyLoad').html(data);
		})
	}
	</script>
</head>
<body>
	<!-- 댓글 리스트 -->
	<ul id="replyList">
		<c:if test="${empty replyList }">
			<li class="empty_li">댓글이 없습니다.</li>
		</c:if>
		<c:if test="${not empty replyList }">
			<c:forEach var="reply" items="${replyList }">		
				<li>
					<div class="li_inner">
						<p class="col-1" style="font-weight: 600;">${reply.nick }</p>
						<p class="col-8 content" id="content_${reply.rno }">${reply.content }</p>
						<p style="margin-left: auto; color: #888;">${reply.dates }</p>
						<p class="col-1 likes" onclick="likes(${reply.bno},${reply.rno},${mno})">
							<!-- 초기 좋아요 색 세팅 -->
							<c:if test="${not empty mnoList  }">
								<c:forEach var="replyLikes" items="${mnoList }" >
									<c:if test="${replyLikes.rno == reply.rno && replyLikes.mno == mno }">									
										<script type="text/javascript">$('#likes_${reply.rno }').css('color', 'var(--point-color)');</script>
									</c:if>
								</c:forEach>
							</c:if>
							<i id="likes_${reply.rno }" class="far fa-thumbs-up"></i>
							<span id="span_${reply.rno }">${reply.likes }</span>
						</p>
					</div>					
					<c:if test="${reply.mno == mno }">
						<div class="btn_show" id="show_${reply.rno }">
							<button class="btn btn-sm btn-primary btn_update">수정</button>
							<button class="btn btn-sm btn-outline-primary" onclick="replyDel(${reply.bno},${reply.rno})">삭제</button>
						</div>
						<div class="btn_hide" id="hide_${reply.rno }">
							<button class="btn btn-sm btn-primary" onclick="done(${reply.bno},${reply.rno})">완료</button>
							<button class="btn btn-sm btn-outline-primary btn_update_close">취소</button>
						</div>
					</c:if>
				</li>
			</c:forEach>
		</c:if>
	</ul>
	
	<!-- paging -->
	<ul class="pagination">
		<c:if test="${pb.startPage > pb.pagePerBlock }">
			<li>
				<a onclick="pagingNum('prev2')"><span class="arrow"></span><span class="arrow arrow2"></span></a>
			</li>
			<li>
				<a onclick="pagingNum('prev1')"><span class="arrow"></span></a>
			</li>
		</c:if>
		<c:forEach var="i" begin="${pb.startPage }" end="${pb.endPage }">
			<c:if test="${pb.currentPage == i }">
				<li class="active">
					<a onclick="pagingNum(${i})">${i }</a>
				</li>
			</c:if>
			<c:if test="${pb.currentPage != i }">
				<li>
					<a onclick="pagingNum(${i})">${i }</a>
				</li>
			</c:if>
		</c:forEach>
		<c:if test="${pb.endPage < pb.totalPage }">
			<li>
				<a onclick="pagingNum('next1')"><span class="arrow right"></span></a>
			</li>
			<li>
				<a onclick="pagingNum('next2')"><span class="arrow right"></span><span class="arrow right arrow2"></span></a>
			</li>
		</c:if>
	</ul>
</body>
</html>
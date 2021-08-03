<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
	<div class="container">
		<table class="table table-hover">
			<thead>
				<tr>
					<th></th>
					<th>${fsList[0].get('bfefrmtrm_nm') }</th>
					<th>${fsList[0].get('frmtrm_nm') }</th>
					<th>${fsList[0].get('thstrm_nm') }</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="fs" items="${fsList}" varStatus="status">
					<%-- <c:if test="${status > 0 and  }" --%>
					<tr>
						<td>${fs.get('account_nm') }</td>
						<td>${fs.get('bfefrmtrm_amount') }</td>
						<td>${fs.get('frmtrm_amount') }</td>
						<td>${fs.get('thstrm_amount') }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
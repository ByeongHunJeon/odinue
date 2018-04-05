<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8;"); %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<jsp:include page="../header.jsp"></jsp:include>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>일일 업무일지</title>
<style type="text/css">
	.detailBoard{
		width: 700px;
		margin: auto;
	}
</style>
</head>
<body>
<table class="detailBoard ui selectable celled table">
	<tr>
		<td colspan="2">일일 교육 일지</td>
	</tr>
	<tr>
		<td>
			<fmt:formatDate value="${regdate }" pattern="yyyy년MM월dd일"/>
		</td>
		<th>작성자</th>
		<td class="ui transparent input">
			<input type="text" name="name" value="${dto.name }">
		</td>
	</tr>
</table>
<table class="detailBoard ui selectable celled table">
	<tr>
		<th></th>
		<th>업무내용</th>
		<th>담당자</th>
	<tr>
		<th>교육사항</th>
		<td class="ui transparent input">
			<input type="text" name="content" value="">
		</td>
		<td>
			<input type="text" name="educator">
		</td>
		<th>결과</th>
		<td>
			<input type="text" name="result" value="">
		</td>
	</tr>

</table>
</body>
</html>
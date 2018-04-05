<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
    <%response.setContentType("text/html; charset=UTF-8;"); %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE>
<html>
<jsp:include page="../header.jsp"></jsp:include>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>업무일지 목록</title>
<script type="text/javascript">
	function selDelete(){

		
	}
</script>
<style type="text/css">
	.eduBoard{
		width: 800px;
		margin: auto;
	}
</style>
</head>
<body>
<table class="eduBoard ui grey table">
<caption>교육 일지 리스트</caption>
<tr>
	<th></th>
	<th>확인여부</th>
	<th>작성일자</th>
	<th>제목</th>
	<th>작성자</th>
</tr>
<c:if test="${empty lists }">
			<tr>
				<td colspan="5" style="text-align: center;">작성된 글이 없습니다.</td>
			</tr>
</c:if>
<c:forEach items="${lists }" var="dto">
			<tr>
				<td><input type="checkbox" > </td>
				<c:choose>
				<c:when test="${dto.chkable eq 'N' }">
					<td style="background-color: red;">
					<a>${dto.chkable }</a>
					</td>
				</c:when><c:otherwise>
					<td style="background-color: blue;">${dto.chkable }</td>
				</c:otherwise>
			</c:choose>
				<td>
					<div class="ui transparent input">
						<fmt:formatDate value="${dto.regdate }" pattern="yyyy년MM월dd일"/>
					</div>
				</td>
				<td>${dto.title }</td>
				<td>${dto.name }</td>
			</tr>
</c:forEach>
	<c:choose>
		<c:when test="${count==0 }">
		</c:when>
		<c:otherwise>
			<tr>
				<td colspan="10" style="text-align: center;">
					<c:set var="page"></c:set> 
					<c:forEach var="i" begin="0" step="1" end="${count-1}">
						<a href="BoardController.do?command=boardList&snum=${i<1?i+1:i+(i*10)}&ennum=${i<1?10:(i+1)*10}">${i+1 }</a>
					</c:forEach>
				</td>
			</tr>
		</c:otherwise>
	</c:choose>
			<tr>
				<td>
					<div class="ui olive button" onclick="location.href='EduController.do?command=insertBoard'">글작성</div>
					<div class="ui red button" onclick="selDelete()">삭제</div>
				</td>
			</tr>
</table>
</body>
</html>
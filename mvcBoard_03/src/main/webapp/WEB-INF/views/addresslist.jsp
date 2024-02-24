<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MyBatis 주소록 조건 검색</h1>
	
	<form action="listQuery" method="post">
		검색 선택 :
		<select name="query">
			<option value="NAME">이름</option>
			<option value="TELNO">전화번호</option>
			<option value="ADDRESS" selected="selected">주소</option>
			<option value="RELATION">관계</option>
		</select>&nbsp;&nbsp;&nbsp;
		<input type="text" name="content" size="30">
		<input type="submit" value="검색">
	</form>
	
	<table border="1">
		<tr>
			<th bgcolor="#808080">번호</th>
			<th bgcolor="#808080">이름</th>
			<th bgcolor="#808080">전화번호</th>
			<th bgcolor="#808080">주소</th>
			<th bgcolor="#808080">전자우편</th>
			<th bgcolor="#808080">관계</th>
		</tr>
		<c:set var="cnt" value="0" />
		<c:forEach items="${address}" var="dto">
			<tr>
				<td><a href="view?seqno=${dto.seqno}">${dto.seqno}</a></td>
				<td>${dto.name}</td>
				<td>${dto.telno}</td>
				<td>${dto.address}</td>
				<td>${dto.email}</td>
				<td>${dto.relation}</td>
			</tr>
		<c:set var="cnt" value="${cnt=cnt+1 }" />
		</c:forEach>
	</table>
	<br><br>
	<p>검색 결과는 <b>${cnt }</b>명 입니다.</p>
	<a href="writeForm">주소록 등록</a>
</body>
</html>
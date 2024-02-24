<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 검색</title>
</head>
<body>
	<h1>영화 검색</h1>
	<table border="1">
		<tr>
			<th bgcolor="#808080">영화 이미지</th>
			<th bgcolor="#808080">영화 제목</th>
		</tr>
		<c:forEach items="${movies}" var="dtos">
			<tr>
				<td><img src="${dtos.image }" /></td>
				<td>${dtos.title }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
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
	<h1>주소록 작성</h1>
	<br>
	<form action="write" method="post">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="telno"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>전자우편</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>관계</td>
				<td><input type="text" name="relation"></td>
			</tr>
			<tr>
				<td><input type="submit" value="입력">&nbsp;&nbsp;<a href="/">목록보기</a></td>
			</tr>
		</table>
	</form>
	<br>
</body>
</html>
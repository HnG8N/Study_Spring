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
	<form action="update" method="post">
	<input type="hidden" name="seqno" value="${view.seqno}">
		<table >
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${view.name }"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="telno" value="${view.telno }"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="email" value="${view.email }"></td>
			</tr>
			<tr>
				<td>전자우편</td>
				<td><input type="text" name="address" value="${view.address }"></td>
			</tr>
			<tr>
				<td>관계</td>
				<td><input type="text" name="relation" value="${view.relation }"></td>
			</tr>
		</table>
	<input type="submit" value="수정">
	<a href="/">목록보기</a>
	<a href="delete?seqno=${view.seqno}">삭제</a>
	</form>
</body>
</html>
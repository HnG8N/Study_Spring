<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="write" method="get">
		<table border="1">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="bName" size="20"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" name="bContent" size="50"></td>
			</tr>
			<tr>
				<td><input type="submit" value="입력"></td>
				<td><a href="list">목록보기</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
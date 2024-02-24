<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- session값 받을 때 jsp와 다르게 그냥 userid, password로 받는거 확인(session을 jakarta로 import 했기 때문) -->
	<h3>Registration</h3>
	<form action="" method="post">
		<table border="1">
			<tr>
				<td> User ID : </td>
				<td><input type="text" name="userid" value="${userid}" size="20" readonly="readonly"></td>
			</tr>
			<tr>
				<td> Password : </td>
				<td><input type="text" name="password" value="${password}" size="20" readonly="readonly"></td>
			</tr>
		</table>
	</form>
</body>
</html>
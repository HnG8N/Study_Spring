<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="test" value="ajax">버튼</button>
</body>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script>
$(document).ready(function() {
	$("#test").on("click",function(event) {
		alert($("#test").val());
        // 비밀번호 확인을 위한 AJAX 요청
		$.ajax({
			type: "POST",
			url: "test", 	// class 명
			data: {
				"mid" : 1234,
				"mpw" : 5678
			},		// key와 value, 변수 이름(key)과 let name에 받아온 value값(value), dictionary라고 함
			success: function(data){
				alert(data);
			}, // success End
			error: function(xhr, status, error) {
	          // 요청이 실패했을 때 실행할 코드
	          	alert("응답에 실패했습니다 :" + error);
	        } // error End
		}); // ajax End
	});
});
</script>
</html>
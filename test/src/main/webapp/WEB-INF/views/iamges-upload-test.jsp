<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>이미지 업로드 예시 (JavaScript)</title>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
  <section class="my-5">
    <div class="container">
      <div class="row">
        <div class="col-md-8 mx-auto">
          <h2>이미지 업로드 예시 (JavaScript)</h2>
          <img src="/images/cat1.png" />
          <form id="uploadForm">
            <div class="form-group">
              <label for="image">이미지 선택:</label>
              <input type="file" name="image" id="image" accept="image/*" class="form-control-file" required>
              <input type="text" name="textParam" class="form-control" placeholder="텍스트를 입력하세요">
            </div>
            <button type="submit" class="btn btn-primary">이미지 업로드</button>
          </form>
        </div>
      </div>
    </div>
  </section>

  <script>
    $(document).ready(function() {
      $('#uploadForm').submit(function(event) {
        event.preventDefault(); // 기본 폼 제출 방지

        const imageInput = $('#image');

        // 로딩 표시기 표시 (선택 사항)
        // ...

        const formData = new FormData(this);

        $.ajax({
          url: '/upload',
          method: 'POST',
          data: formData,
          contentType: false,
          processData: false,
          success: function(data) {
              // 업로드 성공 처리
			alert("성공")
			console.log(data)
          },
          error: function(error) {
            // 네트워크 또는 기타 오류 처리
            alert("에러")
          }
        });
      });
    });
  </script>
</body>
</html>

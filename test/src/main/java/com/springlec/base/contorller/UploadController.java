package com.springlec.base.contorller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.gson.Gson;

@Controller
public class UploadController {
	
    @Value("${subwaymenu.upload.directory}")
    private String uploadDirectory;

    // 이미지를 업로드할 디렉토리 경로
    private String UPLOAD_DIRECTORY = System.getProperty("user.dir") + uploadDirectory;

    @Autowired
    Gson gson; // Gson 객체를 주입받음
    
    // 이미지 업로드 폼을 보여주는 GET 요청 처리
    @GetMapping("/uploadimage")
    public String displayUploadForm() {
        return "iamges-upload-test"; // 업로드 폼 페이지 이름 반환
    }

    // 이미지를 업로드하는 POST 요청 처리
    @PostMapping("/upload")
    @ResponseBody
    public String uploadImage(MultipartHttpServletRequest request, Model model) throws IOException {
    	
    	// 파일을 포함한 모든 파라미터 가져오기
        MultipartFile file = request.getFile("image");
        String textParam = request.getParameter("textParam");

        StringBuilder fileNames = new StringBuilder(); // 파일 이름을 저장할 StringBuilder 객체 생성
        
        // 업로드된 이미지 파일의 경로 및 파일 이름 생성
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, file.getOriginalFilename());
        
        fileNames.append(file.getOriginalFilename()); // 파일 이름을 StringBuilder에 추가
        
        Files.write(fileNameAndPath, file.getBytes()); // 파일을 실제로 업로드
        
        System.out.println("Uploaded images: " + fileNames.toString()); // 콘솔에 업로드된 이미지 파일 이름 출력
        System.out.println("Text parameter: " + textParam); // 콘솔에 전달된 텍스트 파라미터 출력
        
        // Gson을 사용하여 데이터를 JSON 형식으로 변환
        List<String> Data = Arrays.asList("1234", "가나다라", "abcd");
        String JsonData = gson.toJson(Data);
        
        return JsonData; // JSON 형식의 데이터 반환
    }
}

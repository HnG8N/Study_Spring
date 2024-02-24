package com.springlec.base.ajaxservlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/test")
public class TestServlet_diffFolder extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String CONTENT_TYPE = "application/json;charset=UTF-8";
    
    @Autowired
    Gson gson;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
				
		System.out.println(request.getParameter("mid") + request.getParameter("mpw"));

		System.out.println("응답");
		List<String> data = Arrays.asList("1234", "가나다라", "abcd");
		
//		 ArrayList에 담겨 있는 데이터를 JSON으로 변경하여 전송
		PrintWriter out = response.getWriter();
		response.setContentType(CONTENT_TYPE);
		
		try {
			out.print(gson.toJson(data));	// Json형태로 변환
			out.flush();	// 실행 시키는 명령어
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	

}

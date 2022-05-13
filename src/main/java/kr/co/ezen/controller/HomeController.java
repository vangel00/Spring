package kr.co.ezen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURI();
		  		
  		System.out.println(url);
  		System.out.println("Hello~ World.");
  		
  		if(url.contains("main.mvc")) {
  			System.out.println("main 요청입니다.");
  		}else if(url.contains("test1.mvc")) {
  			System.out.println("test1의 요청입니다.");
  		}else if(url.contains("test2.mvc")) {
  			System.out.println("test2의 요청입니다.");
  		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
/*
서블릿 : urlPatterns의 URL 이 호출하면 서블릿 실행
 - WAS는 Request, Response 객체를 새로 만들어서 서블릿 객체 호출
 - 개발자는 Request 객체에서 HTTP 요청 정보를 편리하게 꺼내서 사용
 - 개발자는 Response 객체에 HTTP 응답 정보를 편리하게 입력
 - WAS는 Response 객체에 담겨있는 내용으로 HTTP 응답 정보를 생성

 */
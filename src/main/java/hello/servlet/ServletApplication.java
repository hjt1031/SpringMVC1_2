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

HTTP API
- HTML 이 아니라 데이터를 전달
- 주로 JSON 형식 사용
- 다양한 시스템에서 호출

SSR - 서버 사이드 랜더링
 - 주로 정적인 화면에 사용, 
 - JSP, 타임리프 -> 백엔드 개발자

CSR - 클라이언트 사이드 렌더링
 - HTML 결과를 자바스크립트를 사용해 웹브라우저에서 동적으로 생성해서 적용
 - 예) 구글 지도, Gmail, 구글 캘린더더
 - React, Vue.js -> 프론트 엔드 개발자 
 */
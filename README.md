# Spring MVC 1

인프런 - 김영한, [스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1)

## 학습 목표
서블릿, JSP, MVC 패턴, 직접 만든 MVC 프레임워크를 거치며 자바 백엔드 웹 기술이 발전해온 배경을 이해하고,
그 위에서 스프링 MVC의 구조와 핵심 원리를 파악한다.
이어서 스프링 MVC의 기본 기능을 익히고, 기본 CRUD가 가능한 웹 페이지를 직접 개발하며
웹 애플리케이션이 요청을 받아 응답하기까지의 전체 흐름을 학습한다.

## 다룬 내용
- 웹 애플리케이션 이해 (웹 서버와 WAS, 서블릿, 멀티 쓰레드)
- 서블릿 (HttpServletRequest, HttpServletResponse)
  - HTTP 요청 데이터 조회 (GET 쿼리 파라미터, POST HTML Form, HTTP 메시지 바디)
  - HTTP 응답 데이터 생성 (단순 텍스트, HTML, HTTP API)
- 서블릿, JSP, MVC 패턴 (회원 관리 웹 애플리케이션 개발)
- MVC 프레임워크 만들기
  - 프론트 컨트롤러 패턴
  - 뷰 분리, 모델 추가
  - 단순하고 실용적인 컨트롤러, 유연한 컨트롤러 (어댑터 도입)
- 스프링 MVC 구조 이해
  - DispatcherServlet
  - 핸들러 매핑과 핸들러 어댑터
  - 뷰 리졸버
- 스프링 MVC 기본 기능
  - 로깅
  - 요청 매핑
  - HTTP 요청 파라미터, HTTP 요청 메시지
  - HTTP 응답, HTTP 메시지 컨버터
- 스프링 MVC 웹 페이지 만들기 (상품 관리 CRUD)

## 실행 방법

```bash
./gradlew bootRun
```

- 애플리케이션: `http://localhost:8080`
- Codespaces에서는 PORTS 탭의 8080 포트 주소로 접속

## 개발 환경
- Java 17
- Spring Boot 4.1.1
- Gradle (io.spring.dependency-management 1.1.7)
- Lombok
- GitHub Codespaces (VS Code)

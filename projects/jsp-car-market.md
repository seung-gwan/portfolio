# 중고차 웹 프로젝트

**Java · JSP · Servlet · MySQL로 웹 요청과 데이터 흐름을 다룬 MVC 학습 프로젝트**

[소스 코드](https://github.com/seung-gwan/web_) · [포트폴리오로 돌아가기](../README.md)

## 결과물

회원가입·로그인·회원정보, 차량 판매·구매, 공지사항과 구매·판매 후기 화면을 다룹니다.
후기 등 게시글의 등록·조회·수정·삭제를 통해 화면 입력에서 DB 처리까지 이어지는 구조를 살펴볼 수 있습니다.

## 공부한 내용

| 주제 | 프로젝트에서 다룬 내용 |
| --- | --- |
| HTTP 요청 처리 | `*.do` 요청을 Front Controller에서 받아 작업별 Command로 전달 |
| MVC 구조 | JSP 화면과 요청 처리, DB 접근 코드의 역할 구분 |
| DB 연동 | DAO와 JDBC PreparedStatement를 통한 조회·저장 |
| 데이터 전달 | DTO로 화면에 필요한 데이터를 전달 |
| 로그인 흐름 | 세션과 비밀번호 처리 유틸리티를 사용하는 코드 |
| 실행 환경 | Maven으로 WAR를 만들고 Tomcat에서 실행하는 구성 |

## 코드 흐름

```text
브라우저 요청
  → FrontController
  → 작업별 Command
  → DAO / MySQL
  → DTO
  → JSP 응답
```

## 주요 파일

- [`FrontController.java`](https://github.com/seung-gwan/web_/blob/main/src/com/javalec/ex/frontcontroller/FrontController.java): 요청 분기
- [`CommandCar/`](https://github.com/seung-gwan/web_/tree/main/src/com/javalec/ex/CommandCar): 기능별 처리
- [`BDao.java`](https://github.com/seung-gwan/web_/blob/main/src/com/javalec/ex/Dao/BDao.java): DB 접근
- [`WebContent/`](https://github.com/seung-gwan/web_/tree/main/WebContent): JSP와 CSS
- [`database/schema.sql`](https://github.com/seung-gwan/web_/blob/main/database/schema.sql): DB 구성

## 실행과 현재 범위

저장소 README의 환경은 JDK 8 이상, Maven 3.8 이상, Tomcat 9, MySQL 8입니다.
DB를 구성하고 `mvn clean package`로 만든 WAR를 Tomcat에 배포하는 방식입니다.
DB 포트와 실행 경로 등 세부 설정은 [원본 실행 안내](https://github.com/seung-gwan/web_/blob/main/README.md)를 따릅니다.

이 프로젝트의 동적 기능은 Servlet 서버와 DB를 구성하여 실행합니다.
포트폴리오 정리에서는 기존 소스와 실행 안내를 확인했으며, 서버·DB 통합 실행은 새로 검증하지 않았습니다.

## 다음 개선점

- 회원가입부터 차량·후기 등록까지의 시연 자료 추가하기
- 입력 검증과 실패 시 응답을 기능별로 정리하기
- 하나의 DAO에 모인 기능을 역할에 따라 나누어 보기
- 목록·상세·수정·삭제 흐름의 자동 검증 추가하기

근거: [프로젝트 README](https://github.com/seung-gwan/web_/blob/main/README.md), [Controller](https://github.com/seung-gwan/web_/blob/main/src/com/javalec/ex/frontcontroller/FrontController.java), [DAO](https://github.com/seung-gwan/web_/blob/main/src/com/javalec/ex/Dao/BDao.java).

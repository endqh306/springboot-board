#  springboot-board

## :clipboard: 개요
인텔리제이 커뮤니티 버전을 바탕으로 JUnit 단위 테스트, JPA, Lombok 등을 사용하였고, 아마존 웹 서비스와 Travis CI라는 자동 배포 서비스를 이용해 외부 인터넷 상에서 접속할 수 있도록 하였습니다. 과정의 대부분은 스프링 부트와 AWS로 혼자 구현하는 웹 서비스 (이동욱 저)를 참조하였습니다. OAuth 2.0을 적용해 게시판은 구글 로그인과 네이버 아이디로 로그인 API를 사용하며, 로그인한 사람만 이용할 수 있습니다. 게시판 특징은 다음과 같습니다.

* 로그인이 되어있지 않다면 게시판의 글 목록만 보여진다.
* 게시글의 수정, 삭제 기능은 해당 글을 작성한 사용자만 접근할 수 있도록 한다.

## :clipboard: 개발기간
* 2023.05.01 ~ 2023.05.07 

## :link: 프로젝트 관리
* [GitHub 주소](https://github.com/endqh306/awsboard)

## :link: 접속 주소 
* [http://awsboard.co.kr/](http://awsboard.co.kr/)

## :clipboard: 개발환경
* IntelliJ
* GitHub

## :clipboard: 사용 기술
### 백엔드
#### Spring boot
* JAVA 8
* Spring MVC
* Spring Boot Web
* Spring Boot Security
* Spring Boot OAuth2
* Spring Session
* Spring Data JPA
* H2 Database
* Lombok

#### Build tool
* Gradle

#### Database
* MySQL

### 프론트엔드
* Thymeleaf
* jQuery
* Bootstrap

### 인프라
#### AWS
* EC2
* RDS
* S3
* CodeDeploy
* Route 53

#### CI
* Travis CI

#### 웹 서버 (무중단 배포)
* Nginx

## :clipboard: 성능 테스팅 도구
* JUnit

## :factory: ERD 설계
<img alt="ERD 설계" src="https://user-images.githubusercontent.com/129237420/236687985-53d5f6fb-765b-439b-862a-d1da6fafc4b9.JPG" width="80%" height="80%">

## :factory: 시스템 구조
<img alt="시스템 구조" src="https://user-images.githubusercontent.com/129237420/236687885-a1d98f86-d0e0-45e1-be60-8c7d1b3f3c4b.png" width="80%" height="80%">

## :factory: 동작 내용(스크린샷)
![](https://user-images.githubusercontent.com/129237420/236688932-61ed3858-f92d-4efa-824b-e22d8cbdce20.JPG) 메인 화면, 페이징 처리

![](https://user-images.githubusercontent.com/129237420/236689923-20302494-97d5-4102-aa9e-cf221b4be5ec.JPG) 구글 계정으로 로그인한 경우

![](https://user-images.githubusercontent.com/129237420/236689025-ec8b6ff7-7799-457b-89a7-566c16274538.JPG) 글쓰기 화면

![](https://user-images.githubusercontent.com/129237420/236689199-463f2e3c-2ccb-4a43-9429-b021a6cd61fb.JPG) 새로운 글 목록 출력

![](https://user-images.githubusercontent.com/129237420/236689272-f2a72600-cb93-4e30-be9f-7272bb36a21d.JPG) 새로운 글 읽기 페이지, 내가 쓴 글인 경우 [수정], [삭제] 버튼 표시됨

![](https://user-images.githubusercontent.com/129237420/236689308-312d017c-9c44-46bb-926e-bc3c5dbd2356.JPG) 내가 쓴 글이 아닌 경우, 글 읽기만 가능하고 수정, 삭제 버튼은 활성화되지 않음

![](https://user-images.githubusercontent.com/129237420/236689334-4f5f8835-4e8b-4de4-b47f-ae88c6548395.JPG) 네이버로 로그인한 경우

![](https://user-images.githubusercontent.com/129237420/236689356-df584d6a-0402-47e4-b666-91edaf9f0ef0.JPG) ROLE(역할)이 ADMIN(관리자)인 경우에만 작성할 수 있음





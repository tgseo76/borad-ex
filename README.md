# 게시판 구현

멋쟁이 사자처럼 13팀의 스프링부트 연습 프로젝트입니다.

학습한 내용을 활용하여 간단한 게시판을 구현해봅니다.

---
# Step 1 : 게시글 기능

게시글 Entity를 설계하고 CRUD를 구현.

+ C : Create
+ R : Read
+ U : Update
+ D : Delete

## 요구사항

+ 게시글에는 작성자, 제목, 본문이 들어갑니다. (게시글 id도 포함)
+ Request, Response DTO를 활용.

## Endpoint

### 게시글 조회

`GET /api/v1/boards/{id}`

### 게시글 등록

`POST /api/v1/boards`

### 게시글 수정

`PUT /api/v1/boards/{id}`

### 게시글 삭제

`DELETE /api/v1/boards/{id}`

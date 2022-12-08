# 게시판 구현

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

---

## Step 1 : 게시글 기능

게시글 Entity를 설계하고 CRUD를 구현.
- C : Create
- R : Read
- U : Update
- D : Delete

## Step 2 : 리팩토링
- get방식 -> PathVariable
- mvc 계층 레이어에 맞게 수정

## Step 3 : 등록,수정,삭제 메세지
- 등록,수정,삭제시 ex) 등록되었습니다. 메세지 팝업
- 
## Step 4 : 게시판 페이징








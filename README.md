# 고양이 장난감가게 만들기 - 심화

![demo mov](https://user-images.githubusercontent.com/14071105/107878422-e7ddc800-6f15-11eb-99de-f2436bb26112.gif)

## 과제 목표1

1. 고양이 장난감가게 유효성 검사 추가하기

고양이 장난감은 이름, 메이커 그리고 가격은 필수 입력 항목입니다. 이 중에서 하나라도 빠트린 경우에는 
처리를 거부하고 웹에게 에러 응답을 전달해야 합니다. 그래야 웹에서 잘못된 경우를 사용자에게 피드백을 
줄 수 있습니다. 유효성을 검사하여 올바른 에러 응답을 만들어주세요.

* 고양이 장난감 목록 얻기 - `GET /products`
* 고양이 장난감 상세 조회하기 - `GET /products/{id}`
* 고양이 장난감 등록하기 - `POST /products`
* 고양이 장난감 수정하기 - `PATCH /products/{id}`
* 고양이 장난감 삭제하기 - `DELETE /products/{id}`

2. 회원 관리하기

회원 생성, 수정, 삭제하기 REST API를 만들어주세요. 회원은 이름, 이메일, 비밀번호는 필수 입력 항목입니다. 
만약 잘못된 정보로 회원이 만들어지지 않도록 유효성 검사를 하고 올바른 에러를 웹에게 응답할 수 있도록 만들어 주세요. 

* 회원 생성하기 - `POST /user`
* 회원 수정하기 - `POST /user/{id}`
* 회원 삭제하기 - `DELETE /user/{id}`

## 요구 사항

- 테스트 커버리지 100%를 달성해야 합니다.
- 모든 API 테스트를 통과해야 합니다.
- 모든 E2E 테스트를 통과해야 합니다.

## API 실행하기

```bash
./gradlew run
```

## 웹 실행하기

### 설치

```bash
$ cd web
$ npm install
```

### 실행

```bash
$ npm start
```

브라우저 `http://localhost:9000`로 열면 실행된 것을 확인할 수 있습니다.

## 테스트

### Spring 테스트 실행

```bash
$ ./gradlew test
```

### 커버리지 확인하기

테스트를 실행하면 자동으로 커버리지 정보를 수집하여 저장합니다. 커버리지 정보는 `app/build/reports`
폴더에 저장됩니다. 커버리지 정보를 확인하려면 `app/build/reports/jacoco/test/html/index.html`파일을
브라우저에서 열면 확인할 수 있습니다.

### API 테스트 설치하기

```bash
$ cd tests
$ npm install
```

### API 테스트 실행

테스트는 실제로 동작하는 서버에 테스트하므로 서버가 동작하고 있는 상태여야 올바르게 동작합니다.

```bash
$ npm test
```

### E2E 테스트 실행하기

E2E테스트는 실제로 동작하는 서버와 실제로 동작하는 웹이 필요한 테스트하므로 서버가 동작하고, 웹 서버가 동작하고 있는 상태여야 올바르게 동작합니다.

```bash
$ cd web
$ npm run e2e
```

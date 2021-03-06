# URL 파싱 후 데이터 가공 하기

## 빌드 및 실행방법

```shell
git clone https://github.com/Jonny-Cho/html-handler.git

./gradlew bootRun
```

## Swagger
`localhost:8080/swagger-ui/index.html`

## 제약 조건

1. 모든 문자 입력 가능
2. 영어, 숫자만 출력
    - 결과 데이터는 영어와 숫자로만 구성된 데이터만 출력한다
    - 노출 유형이 HTML 일 경우는 형식의 HTML TAG 를 제거하고 출력한다  
    - 노출 유형이 TEXT 일 경우에는 모든 영어와 숫자로만 구성된 데이터를 출력한다
3. 오름차순 정렬
    - 영어 : AaBbCcDd `...` Zz
    - 숫자 : 0123456789
4. 교차 출력
    - 영어 숫자 영어 숫자
    - 더 이상 출력될 숫자 또는 영어가 없을 경우 남아있는 정렬된 문자열 그대로 출력
5. 출력 묶음 단위
    - 사용자가 입력한 자연수의 묶음 단위를 기준으로 몫과 나머지를 구하여 노출

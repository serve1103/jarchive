# 자바 기본 데이터 타입과 변수

## 공식 문서

- [Primitive Data Types - Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Variables - Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

---

## 1. 자바의 기본 데이터 타입(Primitive Data Types)

| 타입    | 크기    | 값의 범위/설명                                         | 예시               |
| ------- | ------- | ------------------------------------------------------ | ------------------ |
| byte    | 1 byte  | -128 ~ 127                                             | byte b = 127;      |
| short   | 2 bytes | -32,768 ~ 32,767                                       | short s = 100;     |
| int     | 4 bytes | -2,147,483,648 ~ 2,147,483,647                         | int i = 1000;      |
| long    | 8 bytes | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 | long l = 10000L;   |
| float   | 4 bytes | 소수점 7자리까지 표현                                  | float f = 3.14f;   |
| double  | 8 bytes | 소수점 15자리까지 표현                                 | double d = 3.1415; |
| char    | 2 bytes | 유니코드 문자 1개                                      | char c = 'A';      |
| boolean | 1 byte  | true/false                                             | boolean b = true;  |

---

## 2. 변수(Variables)

- 변수 선언: `타입 변수명 = 값;`
- 변수명은 소문자로 시작, 의미 있는 이름 사용 권장
- 선언과 동시에 초기화 가능

---

## 3. 타입 변환(Casting)

- 자동 변환: 작은 타입 → 큰 타입 (예: int → long)
- 강제 변환: 큰 타입 → 작은 타입 (예: long → int, 데이터 손실 가능)

---

## 4. 실무 팁

- 실무에서는 `int`, `double`, `boolean`을 가장 많이 사용
- 숫자 연산 시 오버플로우/언더플로우 주의
- `char`는 유니코드(국제 문자) 지원
- 변수명은 명확하게, 일관성 있게 작성

---

## 5. 실습 가이드

- 모든 타입을 직접 선언/초기화/출력해보기
- 타입 변환(캐스팅) 실습
- 변수명, 타입, 값의 관계 이해
- 공식 문서 예제도 직접 따라해보기

---

## 6. 추가 참고

- [Java Naming Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)
- [Java Primitive Data Types (공식 문서)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

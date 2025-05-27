# 자바 연산자(Operators)

## 공식 문서

- [Operators - Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

---

## 1. 산술 연산자 (Arithmetic Operators)

산술 연산자는 숫자 타입(정수, 실수)에 대해 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행합니다.

| 연산자 | 설명   | 예시   | 결과 |
| ------ | ------ | ------ | ---- |
| +      | 덧셈   | 5 + 3  | 8    |
| -      | 뺄셈   | 5 - 3  | 2    |
| \*     | 곱셈   | 5 \* 3 | 15   |
| /      | 나눗셈 | 5 / 2  | 2    |
| %      | 나머지 | 5 % 2  | 1    |

> 정수/정수의 나눗셈은 소수점 이하가 버려집니다. 실수 연산은 double 또는 float 사용.

---

## 2. 비교 연산자 (Comparison Operators)

비교 연산자는 두 값을 비교하여 true/false(논리값)를 반환합니다.

| 연산자 | 설명        | 예시   | 결과  |
| ------ | ----------- | ------ | ----- |
| ==     | 같다        | 5 == 3 | false |
| !=     | 다르다      | 5 != 3 | true  |
| >      | 크다        | 5 > 3  | true  |
| <      | 작다        | 5 < 3  | false |
| >=     | 크거나 같다 | 5 >= 3 | true  |
| <=     | 작거나 같다 | 5 <= 3 | false |

---

## 3. 논리 연산자 (Logical Operators)

논리 연산자는 boolean 타입(논리값)에 대해 논리적 AND, OR, NOT 연산을 수행합니다.

| 연산자 | 설명     | 예시          | 결과    |
| ------ | -------- | ------------- | ------- | ---- | --- | ----- | ---- |
| &&     | 논리 AND | true && false | false   |
|        |          |               | 논리 OR | true |     | false | true |
| !      | 논리 NOT | !true         | false   |

---

## 4. 삼항 연산자 (Ternary Operator)

삼항 연산자는 조건에 따라 값을 선택할 때 사용합니다.  
형식: `조건 ? 참일 때 값 : 거짓일 때 값`

예시:

```java
int a = 10, b = 3;
String msg = (a > b) ? "a가 더 큼" : "b가 더 큼";
System.out.println(msg); // "a가 더 큼"
```

---

## 5. 비트 연산자 (Bitwise Operators)

비트 연산자는 정수형 변수의 비트 단위로 AND, OR, XOR, NOT, 시프트 연산을 수행합니다.

| 연산자 | 설명                    | 예시     | 결과(2진수) |
| ------ | ----------------------- | -------- | ----------- | --- | -------- |
| &      | 비트 AND                | 5 & 3    | 1 (0001)    |
|        |                         | 비트 OR  | 5           | 3   | 7 (0111) |
| ^      | 비트 XOR                | 5 ^ 3    | 6 (0110)    |
| ~      | 비트 NOT                | ~5       | -6          |
| <<     | 왼쪽 시프트             | 5 << 1   | 10 (1010)   |
| >>     | 오른쪽 시프트           | 5 >> 1   | 2 (0010)    |
| >>>    | 부호 없는 오른쪽 시프트 | -8 >>> 2 | 1073741822  |

> 비트 연산은 주로 성능이 중요한 로우레벨 프로그래밍에서 사용됩니다.

---

## 6. 통합 실습 예제

아래 코드를 IDE에서 직접 작성해보고, 각 연산자의 결과를 확인해보세요.

```java
package com.example.jarchive.basic;

public class OperatorPractice {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // 1. 산술 연산자
        System.out.println("=== 산술 연산자 ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. 비교 연산자
        System.out.println("\n=== 비교 연산자 ===");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. 논리 연산자
        System.out.println("\n=== 논리 연산자 ===");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        // 조건식과 함께 사용
        boolean result = (a > 5) && (b < 5);
        System.out.println("(a > 5) && (b < 5): " + result);

        // 4. 삼항 연산자
        System.out.println("\n=== 삼항 연산자 ===");
        String msg = (a > b) ? "a가 더 큼" : "b가 더 큼";
        System.out.println(msg);

        // 5. 비트 연산자
        System.out.println("\n=== 비트 연산자 ===");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}
```

---

## 7. 실습 체크리스트

- 각 연산자의 결과를 예측하고, 실제 결과와 비교해보기
- 산술/비교/논리/삼항/비트 연산자를 모두 실습해보기
- 값을 바꿔가며 다양한 케이스 실험해보기

---

## 8. 추가 참고

- [Operators - Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

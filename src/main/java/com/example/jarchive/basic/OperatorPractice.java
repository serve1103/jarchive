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
        System.out.println("a & b = " + (a & b));   // 2진수: 0101 & 0011 = 0001 (1)
        System.out.println("a | b = " + (a | b));   // 2진수: 0101 | 0011 = 0111 (11)
        System.out.println("a ^ b = " + (a ^ b));   // 2진수: 0101 ^ 0011 = 0110 (9)
        System.out.println("~a = " + (~a));         // 2진수: ~00001010 = 11110101 (-11)
        System.out.println("a << 1 = " + (a << 1)); // 2진수: 00001010 << 1 = 00010100 (20)
        System.out.println("a >> 1 = " + (a >> 1)); // 2진수: 00001010 >> 1 = 00000101 (5)
    }
}
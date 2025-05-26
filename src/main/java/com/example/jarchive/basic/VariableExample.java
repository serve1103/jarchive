package com.example.jarchive.basic;
/**
 * [기본 데이터 타입]
 * 정수형
 * - byte: 1바이트 (-128 ~ 127)
 * - short: 2바이트 (-32,768 ~ 32,767)
 * - int: 4바이트 (약 ±21억)
 * - long: 8바이트 (매우 큰 정수)
 * 실수형
 * - float: 4바이트 (소수점 7자리)
 * - double: 8바이트 (소수점 15자리)
 * 문자형
 * - char: 2바이트 (유니코드 문자)
 * 논리형
 * - boolean: true/false
 * */
public class VariableExample {
    public static void main(String[] args) {
        // 1. 정수형 데이터 타입
        byte byteValue = 127;                    // 1바이트, -128 ~ 127
        short shortValue = 32767;               // 2바이트, -32,768 ~ 32,767
        int intValue = 2147483647;              // 4바이트, -2^31 ~ 2^31-1
        long longValue = 9223372036854775807L;  // 8바이트, -2^63 ~ 2^63-1

        // 2. 실수형 데이터 타입
        float floatValue = 3.14f;               // 4바이트, 32비트 부동소수점
        double doubleValue = 3.14159265359;     // 8바이트, 64비트 부동소수점

        // 3. 문자형 데이터 타입
        char charValue = 'A';                   // 2바이트, 유니코드 문자

        // 4. 논리형 데이터 타입
        boolean booleanValue = true;            // 1바이트, true/false

        // 데이터 타입 출력
        System.out.println("=== 정수형 데이터 타입 ===");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        System.out.println("\n=== 실수형 데이터 타입 ===");
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        System.out.println("\n=== 문자형 데이터 타입 ===");
        System.out.println("char: " + charValue);

        System.out.println("\n=== 논리형 데이터 타입 ===");
        System.out.println("boolean: " + booleanValue);

        // 데이터 타입의 범위 확인
        System.out.println("\n=== 데이터 타입의 범위 ===");
        System.out.println("byte 범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short 범위: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
    }
}
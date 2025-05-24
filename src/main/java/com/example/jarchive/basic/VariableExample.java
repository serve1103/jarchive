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
        // 정수형
        int age = 25;
        long population = 7000000000L;  // L 접미사 필요

        // 실수형
        double height = 175.5;
        float weight = 70.5f;  // f 접미사 필요

        // 문자형
        char grade = 'A';

        // 논리형
        boolean isStudent = true;

        // 출력
        System.out.println("나이: " + age);
        System.out.println("인구: " + population);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);
        System.out.println("학점: " + grade);
        System.out.println("학생여부: " + isStudent);
    }
}
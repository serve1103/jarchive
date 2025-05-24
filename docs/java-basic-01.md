# 자바 기초 학습 1: 개발 환경 설정과 Hello World

## 1. 개발 환경 설정

### [필요한 도구]

- **JDK 17**: 자바 개발 키트
- **IntelliJ IDEA**: 통합 개발 환경(IDE)
- **Gradle**: 빌드 도구

### [프로젝트 구조]

```
jarchive/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── jarchive/
│                       └── basic/        # 자바 기초
├── build.gradle
└── settings.gradle
```

### [build.gradle 설정]

```groovy
plugins {
    id 'java'
}

//group = 'com.example'
//version = '1.0-SNAPSHOT'

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    // Lombok
    compileOnly 'org.projectlombok:lombok:1.18.30'
    annotationProcessor 'org.projectlombok:lombok:1.18.30'

    // Test
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}
```

## 2. Hello World 프로그램

### [기본 구조]

```java
package com.example.jarchive.basic;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World. Java!");
    }
}
```

### [코드 설명]

- **패키지 선언**: `package com.example.jarchive.basic;`

  - `com.example`: 회사/조직 도메인
  - `jarchive`: 프로젝트명
  - `basic`: 기능/모듈명

- **클래스 선언**: `public class HelloWorld`

  - `public`: 다른 클래스에서 접근 가능
  - `class`: 자바의 기본 단위
  - `HelloWorld`: 클래스 이름 (파일명과 동일해야 함)

- **main 메서드**: `public static void main(String[] args)`

  - `public`: 다른 클래스에서 접근 가능
  - `static`: 객체 생성 없이 실행 가능
  - `void`: 반환값 없음
  - `main`: 프로그램 시작점
  - `String[] args`: 명령행 인자 배열

- **출력문**: `System.out.println("Hello World. Java!");`
  - `System.out`: 표준 출력 스트림
  - `println`: 줄바꿈과 함께 출력

## 3. 실행 방법

### [IntelliJ에서 실행]

1. `main` 메서드 옆의 녹색 실행(▶️) 버튼 클릭
2. 또는 Mac: `Control + R`, Windows: `Shift + F10`

### [터미널에서 실행]

```bash
# 컴파일
javac HelloWorld.java

# 실행
java HelloWorld
```

## 4. 다음 학습 내용

- 변수와 데이터 타입
- 제어문 (if-else, switch)
- 반복문 (for, while)
- 배열과 컬렉션

---

> 작성일: 2024년 3월
> 작성자: serve1103

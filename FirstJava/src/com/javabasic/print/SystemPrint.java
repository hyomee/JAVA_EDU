package com.javabasic.print;

/**
 * 모든 출력을 한 줄로 출력
 * 다음 줄 출력을 위해서는 개행 문자 사용
 */
public class SystemPrint {
    public static void main(String[] args) {
        System.out.print("안녕");
        System.out.print("자바");
        System.out.print("다음행 출력\n");  // 안녕자바다음행 출력
        System.out.print("2.1");
        System.out.print("안녕");          // 2.1안녕
    }
}


package com.javabasic.print;

public class SystemPrintf {
    public static void main(String[] args) {
        System.out.printf("%d\n", 10);              // 10진수 : 10
        System.out.printf("%o\n", 7);               // 8진수 : 7
        System.out.printf("%x\n", 15);              // 16진수 : f
        System.out.printf("%s\n", "안녕");           // 문자열 : 안녕
        System.out.printf("%f\n", 2.2);             // 실수 ( 소수점 6자) : 2.200000
        System.out.printf("%.2f\n", 2.2);           // 실수 ( .뒤에 자리수 ) : 2.20
        System.out.printf("%d, %.2f\n", 2, 2.2);    // 2, 2.20
    }
}

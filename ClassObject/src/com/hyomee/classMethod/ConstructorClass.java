package com.hyomee.classMethod;

public class ConstructorClass {

  private int num01;
  private int num02;

  // 기본 생성자 : 생략시 컴파일러에 의해 생성
  // public ConstructorClass() {} : 다른 package에서 생성시
  ConstructorClass() {};

  ConstructorClass(int num01) {
    this.num01 = num01;
  }

  ConstructorClass(int num01, int num02) {
    this.num01 = num01;
    this.num02 = num02;
  }
}

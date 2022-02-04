package com.hyomee.classMethod;

public class ConstructorClass {

  private int num01;
  private int num02;

  // 기본 생성자 : 생략시 컴파일러에 의해 생성
  // public ConstructorClass() {} : 다른 package에서 생성시
  ConstructorClass() {
    System.out.println("== ConstructorClass() ");
  };

  ConstructorClass(int num01) {
    this();
    System.out.println("== ConstructorClass(int num01) ");
    this.num01 = num01;
    System.out.println(String.format("매개변수 1개 this.num01 : %s ",
            this.num01));
  }

  ConstructorClass(int num01, int num02) {
    this(num01);
    System.out.println("== ConstructorClass(int num01) ");
    System.out.println("== call this(num01) 후후== ");
    this.num01 = num01;
    this.num02 = num02;
    System.out.println(String.format("매개변수 2개 this.num01 : %s, this.num02 %s",
            this.num01, this.num02));
  }
}

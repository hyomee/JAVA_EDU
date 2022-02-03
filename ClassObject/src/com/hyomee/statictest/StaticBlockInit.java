package com.hyomee.statictest;

public class StaticBlockInit {

  int num;
  static int snum;

  static {
    snum = 10;
    System.out.println("Static Block Init......");
  }

  public StaticBlockInit() {
    this.num = 3;
    System.out.println("생성 this.num Init......");
  }
}

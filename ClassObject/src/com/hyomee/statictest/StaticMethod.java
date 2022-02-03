package com.hyomee.statictest;

public class StaticMethod {
  int mnum = 10;
  static int snum = 20;
  void instanceMethod() {
    mnum = mnum + 1;
    snum = snum + 10;

    System.out.println("instanceMethod instance 변수 mnum : " + mnum);
    System.out.println("instanceMethod static 변수 snum : " + snum);
  }

  static void staticMethod() {
    int num = 1;
    num = num + 1;
    snum = snum + 10;

    // 오류 Cannot resolve symbol 'nnum'
    // static 에서는 static 변수만 접근 가능
    // mnum = nnum + 1;

    // 인스턴스 변수는 접근 가능
    StaticMember staticMember = new StaticMember();
    staticMember.vNum = staticMember.vNum + 1;

    System.out.println("staticMethod local num : " + num);
    System.out.println("staticMethod static snum : " + snum);

  }
}

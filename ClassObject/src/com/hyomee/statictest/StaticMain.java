package com.hyomee.statictest;

public class StaticMain {
  public static void main(String[] args) {
    System.out.println("static member num " + StaticMember.num);
    StaticMember staticMember = new StaticMember();
    System.out.println("instance member num " + staticMember.vNum);

    StaticMember staticMember01 = new StaticMember();
    StaticMember staticMember02 = new StaticMember();

    staticMember01.vNum = 1;
    staticMember02.vNum = 2;
    staticMember01.setStaticNum(5);

    System.out.println("instance member num " + staticMember01.vNum);
    System.out.println("instance member num " + staticMember02.vNum);
    System.out.println("static member 01 staticNum "
            + staticMember01.getStaticNum());
    System.out.println("static member 01 staticNum "
            + staticMember02.getStaticNum());

    // 정적 메서드
    StaticMethod.staticMethod();
    StaticMethod staticMethod = new StaticMethod();
    staticMethod.instanceMethod();
    
    // 블럭 초기화
    StaticBlockInit staticBlockInit = new StaticBlockInit();
    System.out.println("static block 초기화 "  + StaticBlockInit.snum);;

  }
}

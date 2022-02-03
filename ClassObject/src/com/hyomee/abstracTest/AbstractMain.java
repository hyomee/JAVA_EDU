package com.hyomee.abstracTest;

public class AbstractMain {
  public static void main(String[] args) {
    // 오류 : 'AbastractClass' is abstract; cannot be instantiated
    // AbastractClass abastractClass = new AbastractClass() ;
    AbastractClass abastractClass = new AbastractClass() {
      @Override
      int abstractmethod() {
        // 구현 .........
        System.out.println("main에서 abstractmethod ..... 구현 ..... ");
        return 0;
      }
    };
    System.out.println("main.abastractClass 객체 생성 추상 메서드 구현 : "
            + abastractClass.abstractmethod());
    System.out.println("main.abastractClass 객체 생성 Method 실행 : "
            + abastractClass.method());

    AbstractChild abstractChild = new AbstractChild();
    System.out.println("abstractChild 객체 생성 : "
            + abstractChild.abstractmethod()); ;
  }
}

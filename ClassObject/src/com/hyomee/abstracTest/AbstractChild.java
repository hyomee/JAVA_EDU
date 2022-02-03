package com.hyomee.abstracTest;

public class AbstractChild extends AbastractClass{

  @Override
  public int abstractmethod() {
    // 오류 : Abstract method 'abstractmethod()'
    //       cannot be accessed directly
    // super.abstractmethod();
    System.out.println("AbstractChild.abstractmethod : Override 구현 ..... ");
    super.method();
    return 0;
  }
}

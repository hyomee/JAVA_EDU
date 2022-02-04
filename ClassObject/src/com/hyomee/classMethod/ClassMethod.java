package com.hyomee.classMethod;

public class ClassMethod {
  public ClassMethod() {
    System.out.println("==== ClassMethod 생성 ");
  }

  public void publicMethod() {
    System.out.println("==== publicMethod    ");
  }

  protected void protectedMethod() {
    System.out.println("==== protectedMethod ");
  }

  void defaultMethod() {
    System.out.println("==== defaultMethod   ");
  }

  private void privateMethod() {
    System.out.println("==== privateMethod   ");
  }
}


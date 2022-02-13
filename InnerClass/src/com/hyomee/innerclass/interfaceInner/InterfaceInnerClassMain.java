package com.hyomee.innerclass.interfaceInner;

public class InterfaceInnerClassMain {
  public static void main(String... args) {
    InnerfaceHuman innerfaceHuman = new InnerfaceHuman();
    InnerfaceHuman.student student = innerfaceHuman.new StudentImpl("SB-000-0001", "한국학교");
    student.viewStudent();
  }
}

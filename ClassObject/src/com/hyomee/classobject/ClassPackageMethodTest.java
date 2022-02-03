package com.hyomee.classobject;
public class ClassPackageMethodTest {
  public void ClassPackageMethodTest() {
    ClassMethod classMethod = new ClassMethod();
    classMethod.publicMethod();
    classMethod.protectedMethod();
    classMethod.defaultMethod();
    // classMethod.privateMethod(); 동일 class 에서만 접근 가능
  }
}

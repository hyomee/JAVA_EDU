package com.hyomee.classMethod;

import com.hyomee.classobject.ClassMethod;

public class ClassMethodTest {

  public void DefaultMethodTest() {
    ClassMethod classMethod = new ClassMethod();
    classMethod.publicMethod();
    //classMethod.protectedMethod(); 상속을 통해서만 접근 가능
    //classMethod.defaultMethod(); 동일 Package 접근 가능
    //classMethod.privateMethod(); 동일 class 접근 가능
  }
}




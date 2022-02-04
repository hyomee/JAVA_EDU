package com.hyomee.classobject;

import com.hyomee.classMethod.ConstructorClass;

public class ClassObject {
   public static void main(String[] args) {
      ClassStruct classStruct = new ClassStruct();


      int num = classStruct.getNum();
      int num01 = classStruct.getNum01();
      System.out.println("num = " + num);
      System.out.println("num01 = " + num01);

      classStruct.setNum(10);
      System.out.println("num = " + num);
   }
}

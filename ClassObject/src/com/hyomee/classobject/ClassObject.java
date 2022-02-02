package com.hyomee.classobject;

public class ClassObject {
   public static void main(String[] args) {
      ClassStruct classStruct = new ClassStruct();
      classStruct.setNum(10);
      int num = classStruct.getNum();
      System.out.println("num = " + num);
   }
}

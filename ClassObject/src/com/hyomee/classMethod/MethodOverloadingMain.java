package com.hyomee.classMethod;

public class MethodOverloadingMain {
  public static void main(String[] args){
    MethodOverloadingClass methodOverloadingClass = new MethodOverloadingClass();
    methodOverloadingClass.logPrint("매개변수 1개");
    methodOverloadingClass.logPrint("매개변수 1개", "매개변수 1개");
  }
}

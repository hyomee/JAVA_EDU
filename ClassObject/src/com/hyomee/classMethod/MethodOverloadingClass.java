package com.hyomee.classMethod;

public class MethodOverloadingClass {

  public void logPrint(String str){
    System.out.println(String.format("MethodOverloading String Parameter %s ", str));
  }
  public void logPrint(String str, String str01){
    System.out.println(String.format("MethodOverloading String Parameter %s, %s ", str, str01));
  }
}

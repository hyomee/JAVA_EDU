package com.hyomee.classMethod;

public class VariableArgumentMethodMain {
  public static void main(String[] args){
    VariableArgumentMethod vam = new VariableArgumentMethod();
    System.out.println("=== 입력 매개 변수 1개");
    vam.variableArgment(1);
    System.out.println("=== 입력 매개 변수 2개");
    vam.variableArgment(10,20);
    System.out.println("=== 입력 매개 변수 3개");
    vam.variableArgment(10,20,30);
  }
}

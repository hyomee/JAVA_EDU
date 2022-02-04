package com.hyomee.classMethod;

public class VariableArgumentMethod {
  public void variableArgment(int... nums){
    for(int num: nums) {
      System.out.println("입력 매개 변수 num : " + String.valueOf(num));
    }
  }
}

package com.hyomee.exception.checkexception;

public class UnCheckedException {

  public void arithmeticExveption() {
    try {
      int num = 10 / 0;
    } catch (ArithmeticException ex) {
      System.out.println("예러 발생 .... " +  ex.getMessage());
    }
    int[] arrNum = {1,2,3};
    try {
      System.out.println(arrNum[3]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("예러 발생 .... " +  ex.getMessage());
    }
  }
}

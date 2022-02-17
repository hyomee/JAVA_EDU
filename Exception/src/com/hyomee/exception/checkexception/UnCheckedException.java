package com.hyomee.exception.checkexception;

public class UnCheckedException {

  public void arithmeticExveption() {
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    int num  = 10/0;

    int[] arrNum = {1,2,3};
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    System.out.println(arrNum[3]);
  }
}

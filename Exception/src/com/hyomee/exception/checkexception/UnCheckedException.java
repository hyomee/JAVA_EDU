package com.hyomee.exception.checkexception;

public class UnCheckedException {

  public void arithmeticExveption() {
    try {
      int num = 10 / 0;
      int[] arrNum = {1,2,3};
    } catch (ArithmeticException ex) {
      System.out.println("예러 발생 .... " +  ex.getMessage());
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("예러 발생 .... " +  ex.getMessage());
    } finally {
      System.out.println("무조건 실행 ");
    }
  }
}

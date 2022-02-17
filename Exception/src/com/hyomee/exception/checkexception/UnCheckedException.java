package com.hyomee.exception.checkexception;

public class UnCheckedException {

  public void arithmeticExveption() {
    try {
      int num = 10 / 1;
      arrayIndexErr();
    } catch (ArithmeticException ex ) {
      System.out.println("예러 발생 .... " +  ex.getMessage());
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("예러 발생 .... " +  ex.getMessage());
    } catch (Exception ex) {
      System.out.println("모든 예외는 이곳으로.... " +  ex.getMessage());
    } finally {
      System.out.println("무조건 실행 ");
    }
  }

  public void arrayIndexErr() throws ArrayIndexOutOfBoundsException {
    int[] arrNum = {1, 2, 3};
    System.out.println(arrNum[3]);
  }
}

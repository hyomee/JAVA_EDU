package com.hyomee.exception.checkexception;

public class MyException extends Exception{
  MyException() { }
  MyException(String errStr) {
    System.out.println("예외 : " + errStr);
  }
}

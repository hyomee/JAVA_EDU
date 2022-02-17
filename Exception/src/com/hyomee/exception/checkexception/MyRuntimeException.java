package com.hyomee.exception.checkexception;

public class MyRuntimeException extends RuntimeException{
  MyRuntimeException() { }
  MyRuntimeException(String errStr) {
    System.out.println("Runtime 예외 : " + errStr);
  }
}

package com.hyomee.exception;

import com.hyomee.exception.checkexception.UnCheckedException;

public class ExceptionMain {
  public static void main(String... args) {
    UnCheckedException unCheckedException = new UnCheckedException();
    unCheckedException.arithmeticExveption();
  }
}

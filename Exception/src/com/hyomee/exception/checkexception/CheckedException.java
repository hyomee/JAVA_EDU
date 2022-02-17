package com.hyomee.exception.checkexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
/*
  void checkExceptionThread()  {
    // Unhandled exception: java.lang.InterruptedException
    Thread.sleep(100);
  }
*/

  void checkExceptionThread() throws InterruptedException {
    // Unhandled exception: java.lang.InterruptedException
    Thread.sleep(100);
  }

  void checkExceptionThread01() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

/*
  void iofileExceptioStream() {
    InputStreamReader is = new InputStreamReader(System.in);
    // Unhandled exception: java.io.IOException
    is.read();

    // Unhandled exception: java.io.FileNotFoundException
    FileInputStream fis = new FileInputStream("readme.md");

  }
*/

  void iofileExceptioStream() throws IOException {
    InputStreamReader is = new InputStreamReader(System.in);
    // Unhandled exception: java.io.IOException
    is.read();

    // Unhandled exception: java.io.FileNotFoundException
    FileInputStream fis = new FileInputStream("readme.md");

  }

  void iofileExceptioStream01()   {
    InputStreamReader is = new InputStreamReader(System.in);
    try {
      is.read();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileInputStream fis = new FileInputStream("readme.md");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  void userEx()   {
    InputStreamReader is = new InputStreamReader(System.in);
    try {
      is.read();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileInputStream fis = new FileInputStream("readme.md");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}

package com.hyomee.thread.extend;



public class MyThreadRunnable implements Runnable{
  @Override
  public void run() {
    System.out.println("MyThreadRunable Start : " + Thread.currentThread().getId());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MyThreadRunable End : "+ Thread.currentThread().getId());
  }
}

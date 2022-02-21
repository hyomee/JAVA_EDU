package com.hyomee.thread.extend;

public class MythreadA extends Thread{
  @Override
  public void run() {
    System.out.println("MythreadA Start : " + currentThread().getId());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MythreadA End : "+ currentThread().getId());
  }
}

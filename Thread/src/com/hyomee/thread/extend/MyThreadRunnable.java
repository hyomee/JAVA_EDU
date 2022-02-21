package com.hyomee.thread.extend;



public class MyThreadRunnable implements Runnable{
  @Override
  public void run() {
    ThreadExtendMain.ThreadView( Thread.currentThread(), this.getClass() , "Start");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    ThreadExtendMain.ThreadView( Thread.currentThread(), this.getClass() , "End");
  }
}

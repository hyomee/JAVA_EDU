package com.hyomee.thread.extend;



public class MythreadA extends Thread{
  @Override
  public void run() {

    ThreadExtendMain.ThreadView( Thread.currentThread(), this.getClass() , "Start");

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    ThreadExtendMain.ThreadView( Thread.currentThread(), this.getClass() , "end");
  }
}

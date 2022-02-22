package com.hyomee.thread.state;

class BasicThread implements Runnable {
  @Override
  public void run() {
    Thread thread = Thread.currentThread();
    try{

      System.out.println("5초 동안 BasicThread Sleep");
      thread.sleep(5000);
      synchronized (thread) {
        thread.wait();
      }
    }catch(InterruptedException iException){
      iException.printStackTrace();
    }
  }
}

public class StateMain {
  public static void main(String... args) {
    // BasicThread 생성
    Thread threadInstance=new Thread(new BasicThread());
    threadInstance.start();
    System.out.println("BasicThread State: "
            + threadInstance.getState());
    try {
      boolean keepRunning=true;
      int count=1;
      while(keepRunning) {
        Thread.sleep(2000);
        System.out.println(count*2+ " 초 경과 - BasicThread State: "
                + threadInstance.getState());
        count++;
        if(count==4){
          //  6 초 경과
          synchronized(threadInstance) {
            threadInstance.notify();
          }
        }
        if(Thread.State.TERMINATED == threadInstance.getState()){
          keepRunning = false;
        }
      }
    }catch(InterruptedException iException){
      iException.printStackTrace();
    }
  }
}

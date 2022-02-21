package com.hyomee.thread.extend;

public class ThreadExtendMain {
  public static void main(String... args) {
    System.out.println("Main Start .... ");
    // Thread 를 상속 받은 객체
    MythreadA myThreadA = new MythreadA();
    myThreadA.start();
    System.out.println("MyThreadA id " + myThreadA.getId());

    // Runable을 상속 받은 객체
    MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
    myThreadRunnable.run();

    // Runable를 상속 받으면 start가 없어서 Thread 객체 생성 후 start
    Runnable myRunnable = new MyThreadRunnable();
    Thread myThread = new Thread(myRunnable);
    myThread.start();
    System.out.println("myThread id " + myThread.getId());

    // innerClass 사용
    Thread myInnerThread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("myInnerThread Start : " + Thread.currentThread().getId());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("myInnerThread End : "+ Thread.currentThread().getId());
      }
    });
    myInnerThread.start();
    System.out.println("myInnerThread id " + myInnerThread.getId());
    System.out.println("Main End .... ");
  }
}

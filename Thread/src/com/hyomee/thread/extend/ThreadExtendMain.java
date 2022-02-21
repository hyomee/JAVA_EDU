package com.hyomee.thread.extend;

import java.sql.Timestamp;

public class ThreadExtendMain {
  public static void main(String... args) {
    Thread currentThread = Thread.currentThread();
    ThreadView( currentThread, ThreadExtendMain.class, "Start");

    // Thread 를 상속 받은 객체
    MythreadA myThreadA = new MythreadA();
    myThreadA.start();


    // Runable을 상속 받은 객체
    MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
    myThreadRunnable.run();

    // Runable를 상속 받으면 start가 없어서 Thread 객체 생성 후 start
    Runnable myRunnable = new MyThreadRunnable();
    Thread myThread = new Thread(myRunnable);
    myThread.start();


    // innerClass 사용
    Thread myInnerThread = new Thread(new Runnable() {
      @Override
      public void run() {
        ThreadView( Thread.currentThread(), this.getClass() , "Start");
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
          ThreadView( Thread.currentThread(), this.getClass() , "Kill 1");
        } catch (IllegalThreadStateException e) {
          e.printStackTrace();
          ThreadView( Thread.currentThread(), this.getClass() , "Kill 2");
        }
        ThreadView( Thread.currentThread(), this.getClass() , "End");

      }
    });
    myInnerThread.setPriority(10);
    myInnerThread.setDaemon(true);
    myInnerThread.start();
    ;

    System.out.println("실행 중인 Thread 갯수 : " + Thread.activeCount());

    ThreadView( currentThread, ThreadExtendMain.class, "end ........");
  }

  static void ThreadView( Thread t, Class obj, String startEnd) {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println(String.format("[%s][%s][%s] %s\t" +
                    "Thread Name\t : %S\n" +
                    "-- Thread Id\t : %S\n" +
                    "-- Thread Priority\t : %S\n",
            timestamp.toString(),
            obj.getName().toString(),
            t.isDaemon()?"데몬":"일반",
            startEnd,
            t.getName(),
            t.getId(),
            t.getPriority()));
  }
}

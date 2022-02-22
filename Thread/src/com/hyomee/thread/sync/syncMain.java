package com.hyomee.thread.sync;

class SyncTest {
  int num = 1;

  void add() {
    int num = this.num;
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.num = num + 1;
  }

  synchronized void addSync()  {
    int num = this.num;
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.num = num + 1;
  }

  void addSyncBlock()  {
      synchronized(this) {
        int num = this.num;
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        this.num = num + 1;
    }
  }
}

class MyThread extends Thread {
  SyncTest syncTest;
  MyThread(SyncTest syncTest) {
    this.syncTest = syncTest;
  }

  @Override
  public void run() {
    this.syncTest.add();
    System.out.println(Thread.currentThread().getName() + ".." + this.syncTest.num);
  }
}
public class syncMain {
  public static void main(String... args) {
    SyncTest syncTest = new SyncTest();
    MyThread myA = new MyThread(syncTest);
    myA.start();

    MyThread myB = new MyThread(syncTest);
    myB.start();
    System.out.println(myA.currentThread().getName() + ".." + myA.getState());
  }
}

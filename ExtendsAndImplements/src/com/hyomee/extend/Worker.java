package com.hyomee.extend;

public class Worker extends Adult {
  String workerId;
  void goToWork() {
    System.out.println("출근 한다.");
  };
  void study() {
    System.out.println("공부 한다..");
  };
  void doWork() {
    System.out.println("일을 한다.");
  };
}

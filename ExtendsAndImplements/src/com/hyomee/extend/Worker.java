package com.hyomee.extend;

public class Worker extends Adult {

  private String workerId;
  Worker() { }
  Worker(String name) {
    super(name);
    System.out.println("Worker OverLoading 생성자 호출");
  }

  void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  String getWorkerId() {
    return this.workerId;
  }

  void setHumanName(String name) {
    super.setName(name);
  }


  void goToWork() {
    System.out.println("출근 한다.");
  };
  void study() {
    System.out.println("공부 한다..");
  };
  void doWork() {
    System.out.println("일을 한다.");
  };



  @Override
  void drinking() {
    super.drinking();
    System.out.println("맥주를 마신다.");
  };

}

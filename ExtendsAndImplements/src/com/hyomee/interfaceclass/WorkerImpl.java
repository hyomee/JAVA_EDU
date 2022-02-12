package com.hyomee.interfaceclass;

public class WorkerImpl implements Worker {
  WorkerVO workerVO = new WorkerVO();

  @Override
  public void goToWorkAndDoWork(String workerId) {
    this.workerVO.setWorkerId(workerId);
    goToWork();
    doWork();
  }

  @Override
  public String getWorkerId() {
    return workerVO.getWorkerId();
  }

  void goToWork() {
     System.out.println(getWorkerId() + " 가 출근 한다.");
  }

  void study() {
    System.out.println(getWorkerId() + " 가 공부 한다..");
  }

  void doWork() {
    System.out.println(getWorkerId() + " 가 일을 한다.");
  }
}

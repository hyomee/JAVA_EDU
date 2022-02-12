package com.hyomee.interfaceclass;

public class InterfaceMain {
  public static void main(String... args) {

    System.out.println(Worker.workerId);

    Worker worker = new WorkerImpl();
    System.out.println(worker.defaultWorkerId());
    worker.goToWorkAndDoWork("FC-00003");
  }
}

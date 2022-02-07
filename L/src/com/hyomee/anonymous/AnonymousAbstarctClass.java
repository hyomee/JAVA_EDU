package com.hyomee.anonymous;

class AnonymousAbstarctClass {

  private String workerName = "기본작업자";

  // 인스턴스 변수
  AnonymousAbstract workerMember = new AnonymousAbstract() {
    String getWorkerName() {
      return workerName;
    }
    @Override
    void doWork() {
      System.out.println("작업자 : " + workerName);
    }
    @Override
    void doWork(String str) {
        System.out.println("작업자 : " + str);
    }
  };

  // 인스턴스 Method
  void workerMethod(String workerNm) {
    AnonymousAbstract worker = new AnonymousAbstract() {
      @Override
      void doWork() {
        System.out.println("기본 작업자 : " + workerName + ", 작업자 : " + workerNm);
      }
      @Override
      void doWork(String str) {
        System.out.println("작업자 : " + str);
      }
    };
    worker.doWork();;
    worker.doWork("홍길동");
  }

  // 인스턴스 메서드의 파라메터
  void workerMethod(AnonymousAbstract worker) {
    worker.doWork();
    worker.doWork("익명객체 파라메터");
  }
}

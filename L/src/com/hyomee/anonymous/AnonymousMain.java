package com.hyomee.anonymous;

public class AnonymousMain {
  public static void main(String... args) {

    AnonymousAbstarctClass anonymousClass = new AnonymousAbstarctClass();
    anonymousClass.workerMember.doWork();
    anonymousClass.workerMember.doWork("인스턴변수");
    // anonymousClass.workerMember.getWorkerName() 익명 함수 참조 불가
    anonymousClass.workerMethod("인스턴스의 지역변수");

    anonymousClass.workerMethod(new AnonymousAbstract() {
      @Override
      void doWork() {
        // private String workerName 접근 못함
        System.out.println("기본 작업자 없습니다.");
      }

      @Override
      void doWork(String str) {
        System.out.println("작업자 : " + str);
      }
    });

    AnonymousChild anonymousChild = new AnonymousChild();
    String str = anonymousChild.action.action("홍길동");
    System.out.println(str);

    anonymousChild.actionMethod("인스턴스메서드");
  }

}


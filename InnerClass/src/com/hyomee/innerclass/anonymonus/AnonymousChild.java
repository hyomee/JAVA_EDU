package com.hyomee.innerclass.anonymonus;

public class AnonymousChild {
  // 인스턴스 멤버
  public AnonymousClass action = new AnonymousClass(){
    @Override
    public <T> String action(T t) {
      return  "작업자 : " + t;
    }
  };

  // 인스턴스 메서드
  public String actionMethod(String worker) {
    AnonymousClass action = new AnonymousClass() {
      @Override
      public <T> String action(T t) {
        return  "작업자 : " + t;
      }
    };

    return action.action(worker);
  }

}

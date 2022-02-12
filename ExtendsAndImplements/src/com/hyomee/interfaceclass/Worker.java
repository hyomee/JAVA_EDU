package com.hyomee.interfaceclass;

public interface Worker{
  // 상속 받는 객체에 자동으로 추가 됨
  String workerId = "F0-00001";
  void goToWorkAndDoWork(String workerId);
  String getWorkerId() ;

  default String defaultWorkerId () {
    return "F0-00000";
  }
}

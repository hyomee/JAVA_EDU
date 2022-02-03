package com.hyomee.statictest;

public class StaticMember {
  int vNum = 1;
  static int num = 10;
  static int staticNum;

  void setStaticNum(int num) {
    staticNum = num;
  }

  int getStaticNum() {
    return staticNum;
  }
}



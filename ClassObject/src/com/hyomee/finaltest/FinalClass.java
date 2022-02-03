package com.hyomee.finaltest;

public class FinalClass {

  final int instanceNum01 ;
  final int instanceNum02 = 10;
  final int[] instanceArray = new int[]{10,20,30};

  public FinalClass(int num) {
    this.instanceNum01 = num;
  }

  public void finalVarible() {
    int localNum = 10;
    final int finalLocalNum ;

    finalLocalNum = 30;
    localNum = localNum + 1;

    // 오류 : Variable 'finalLocalNum' might already have been assigned to
    // finalLocalNum = finalLocalNum + 2; // final 지역변수
    // instanceNum02 = instanceNum02 + 2; // final instance 변수

    instanceArray[2] = 30;
    // 오류 :  Cannot assign a value to final variable 'instanceArray'
    // instanceArray = new int[]{10,20,30};

  }
}


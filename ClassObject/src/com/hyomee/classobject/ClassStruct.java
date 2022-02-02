package com.hyomee.classobject;


public class ClassStruct {

   // 필드
   private int num;
   private int num01 = 20;

   // 생성자
   public ClassStruct() {
      System.out.println("1 ... 생성함");
   }

   // 메서드
   public int getNum() {
      System.out.println("3 ... 인스턴스 변수 num 값 읽어오기");
      return num;
   }

   public void setNum(int num) {
      System.out.println("2 ... 인스턴스 변수 num 설정");
      this.num = num;
   }

   public int sum(int pNum) {
      return this.num + (this.num01 + pNum);
   }
}

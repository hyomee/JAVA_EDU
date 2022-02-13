package com.hyomee.innerclass.interfaceInner;

public class InnerfaceHuman {
  String name ;
  String school;

  void eat() {
    System.out.println("사람이 밥을 먹는다.");
  }

  static interface student {
    void viewStudent();
  }

  class StudentImpl implements InnerfaceHuman.student {
    String studentId = "SB-000-0000" ;

    StudentImpl(String studentId, String school) {
      this.studentId = studentId;
      InnerfaceHuman.this.school = school;
    }

    @Override
    public void viewStudent() {
      System.out.println("학교 : " + InnerfaceHuman.this.school);
      System.out.println("학번 : " + this.studentId);
    }
  }



}

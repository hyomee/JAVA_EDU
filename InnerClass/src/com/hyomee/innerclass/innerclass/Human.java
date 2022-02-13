package com.hyomee.innerclass.innerclass;

public class Human {
  String name ;
  String school;

  void eat() {
    System.out.println("사람이 밥을 먹는다.");
  }

  class Student {
    String studentId;

    Student(String studentId, String school) {
      this.studentId = studentId;
      Human.this.school = school;
      CollegeStudent collegeStudent = new CollegeStudent();
      collegeStudent.drinking();
    }

    void eat() {
      System.out.println("* 학생 이너 클래스 *");
      Human.this.eat();
      System.out.println("학생이 밥을 먹는다.");
    }

    void viewStudent() {
      System.out.println("학교 : " + Human.this.school);
      System.out.println("학번 : " + this.studentId);
    }
  }

  class CollegeStudent {
    void drinking() {
      System.out.println("술을 마신다.");
    };
  }
}

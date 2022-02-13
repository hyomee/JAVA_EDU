package com.hyomee.innerclass.innerclass;

public class StaticHuman {
  String name = "홍길동";
  static String school;

  static void eat() {
    System.out.println("사람이 밥을 먹는다.");
  }

  static class StaticStudent {
    String studentId;

    StaticStudent(String studentId, String school) {
      this.studentId = studentId;
      // 오류 : StaticHuman.this.name = "홍길동";
      StaticHuman.school = school;
      CollegeStudent collegeStudent = new CollegeStudent();
      collegeStudent.drinking();;
    }

    void eat() {
      System.out.println("* 학생 이너 클래스 *");
      StaticHuman.eat();
      System.out.println("학생이 밥을 먹는다.");
    }

    void viewStudent() {
      System.out.println("학교 : " + StaticHuman.school);
      System.out.println("학번 : " + this.studentId);
    }
  }

  static class CollegeStudent {
    void drinking() {
      System.out.println("술을 마신다.");
    };
  }
}

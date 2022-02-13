package com.hyomee.innerclass.innerclass;

public class LocalHuman {
  String name ;
  String school;

  void eat() {
    System.out.println("사람이 밥을 먹는다.");
  }

  void student() {
    class Student {
      String studentId = "SB-000-0000" ;
      LocalHuman localHuman = new LocalHuman();

      Student(String studentId, String school) {
        this.studentId = studentId;
        localHuman.school = school;
      }

      void viewStudent() {
        System.out.println("학교 : " + localHuman.school);
        System.out.println("학번 : " + this.studentId);
      }
      void setStudentId(String studentId) {
        this.studentId = studentId;
      }
    }

    Student student = new Student("SB-000-0001", "한국학교");
    student.localHuman.eat();
    student.viewStudent();
    student.setStudentId("SB-000-0002");
    student.viewStudent();
  }
}

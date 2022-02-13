package com.hyomee.innerclass.innerclass;

public class InnerClassMain {
  public static void main(String... args) {
    Human human = new Human();
    human.eat();
    Human.Student student = human.new Student("SB-000-0001", "한국학교");
    student.eat();
    student.viewStudent();
  }

}

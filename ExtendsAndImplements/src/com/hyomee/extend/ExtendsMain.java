package com.hyomee.extend;

public class ExtendsMain {

  public static void main(String... args) {

    Student student = new Student();
    Human human = student;

    Human studentHuman = new Student();

    // Student student01 = new Human();

    // Student student02 = (Student) new Human();


  }
}

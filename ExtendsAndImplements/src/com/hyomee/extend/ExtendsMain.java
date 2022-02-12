package com.hyomee.extend;

public class ExtendsMain {

  public static void main(String... args) {

    Student student = new Student();
    Human human = student;

    Human studentHuman = new Student();
    Student student01 = (Student) studentHuman;

    // class com.hyomee.extend.Human cannot be cast to class com.hyomee.extend.Student
    // Student student02 = new Human();

    // java.lang.ClassCastException: class com.hyomee.extend.Human cannot be cast to class com.hyomee.extend.Student
    // (com.hyomee.extend.Human and com.hyomee.extend.Student are in unnamed module of loader 'app')
    // Student student03 = (Student) new Human();

    // java.lang.ClassCastException: class com.hyomee.extend.Human cannot be cast to class com.hyomee.extend.Student
    // (com.hyomee.extend.Human and com.hyomee.extend.Student are in unnamed module of loader 'app')
    // Human human01 = new Human();
    // Student student04 = (Student) human01;

  }
}

package com.hyomee.extend;

public class ExtendsMain {

  public static void main(String... args) {

    Student student = new Student();
    Human human = student;

    Human studentHuman = new Student();
    Student student01;
    if (studentHuman instanceof Student) {
      System.out.println("human01을 Student로 Castring 가능 합니다.");
      student01 = (Student) studentHuman;
    } else {
      System.out.println("human01을 Student로 Castring 불가 합니다.");
    }


    // class com.hyomee.extend.Human cannot be cast to class com.hyomee.extend.Student
    // Student student02 = new Human();

    // java.lang.ClassCastException: class com.hyomee.extend.Human cannot be cast to class com.hyomee.extend.Student
    // (com.hyomee.extend.Human and com.hyomee.extend.Student are in unnamed module of loader 'app')
    // Student student03 = (Student) new Human();

    // java.lang.ClassCastException: class com.hyomee.extend.Human cannot be cast to class com.hyomee.extend.Student
    // (com.hyomee.extend.Human and com.hyomee.extend.Student are in unnamed module of loader 'app')
    // Human human01 = new Human();
    // Student student04 = (Student) human01;

    Human human01 = new Human();
    Student student04 ;
    if (human01 instanceof Student) {
      System.out.println("human01을 Student로 Castring 가능 합니다.");
      student04 = (Student) human01;
    } else {
      System.out.println("human01을 Student로 Castring 불가 합니다.");
    }

    Worker worker = new Worker();
    worker.drinking();
    worker.setName("홍길동");
    System.out.println("Human.name " + worker.getName());
    worker.setHumanName("홍당무");
    System.out.println("Human.name " + worker.getName());
    worker.setWorkerId("ID100001");
    System.out.println("Human.name " + worker.getWorkerId());


    Worker workerSetName = new Worker("봉선화");
    System.out.println("Human.name " + workerSetName.getName());
  }
}

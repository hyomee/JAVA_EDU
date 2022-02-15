package com.hyomee.streamedu.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterace {
  interface FunctionalInterface {
    public abstract void doWork(String text);
  }
  public static void main(String[] strings) {

    // 익명 클래스 사용
    FunctionalInterface func01 = new FunctionalInterface() {
      @Override
      public void doWork(String text) {
        System.out.println(text);
      }
    };
    func01.doWork("익명 클래스 :: 내가 하는 일");
    // 람다 사용
    FunctionalInterface func = text -> System.out.println(text);
    func.doWork("람다 :: 내가 하는 일");

    // Runable
    Runnable runnable = () -> System.out.println("Runnable....");
    runnable.run();

    //Supplier
    Supplier supplier = () -> "Supplier .... ";
    String str = (String) supplier.get();
    System.out.println(str);

    //Consumer
    Consumer<String> consumer = text -> System.out.println("Consumer...." + text);
    Consumer<String> consumerandThen = text -> System.out.println("Consumer andThen...." + text);
    consumer.andThen(consumerandThen).accept("String type");

    //Function
    Function<Integer, Integer> multiply = (value) -> value * 2;
    Integer result = multiply.apply(5);
    System.out.println("Function...." + result);


    Function<Integer, Integer> add = (value) -> value + 2;
    Function<Integer, Integer> addMultiply = multiply.compose(add);
    result = addMultiply.apply(5);
    System.out.println("Function....addMultiply :: " + result);

    // Predicate
    Predicate<Integer> predicate = (num) -> num > 10;
    System.out.println("Predicate.... :: " + predicate.test(5));

    Predicate<Integer> predicate1 = (num) -> num < 20;

    System.out.println("Predicate.... 10 < num < 20 :: " + predicate.and(predicate1).test(25));
    System.out.println("Predicate.... 10 < num or num  < 20 :: " + predicate.or(predicate1).test(25));
  }
}

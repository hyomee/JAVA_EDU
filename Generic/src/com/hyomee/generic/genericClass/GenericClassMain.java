package com.hyomee.generic.genericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericClassMain {
  public static void main(String... args) {

    List<GenericClass<String, Integer>> cars = new ArrayList<>();
    cars.add((new GenericClass<>("쏘나타", 10000)));
    cars.add((new GenericClass<>("그랜저", 20000)));

    for(GenericClass<String, Integer> car: cars) {
      System.out.println(car.getName() + "\t가격 : " + String.format("%,d", car.getPrice() )
              + " (부가세 : " + String.format("%,.1f",car.getPrice().floatValue() * 0.1) +")");
    }

    cars.clear();

    List<GenericClass<String, Integer>> fruit = new ArrayList<>();
    cars.add((new GenericClass<>("사과", 2000)));
    cars.add((new GenericClass<>("복숭아", 4000)));

    for(GenericClass<String, Integer> car: cars) {
      System.out.println(String.format("%s \t가격 : %,d ( 부가세 : %,.1f )"
              , car.getName()
              , car.getPrice()
              , car.getPrice().floatValue() * 0.1 ));

    }
   }
}

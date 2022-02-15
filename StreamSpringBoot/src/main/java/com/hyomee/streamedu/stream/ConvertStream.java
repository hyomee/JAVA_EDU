package com.hyomee.streamedu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStream {

  public static void main(String[] strings) {
    List<String> stringList = new ArrayList<>();
    stringList.add("c");
    stringList.add("java");
    stringList.add("java script");
    stringList.add("c++");
    stringList.add("c#");

    System.out.println("===== Stream 변환 ======= :: " );
    Stream<String> stringStream = stringList.stream();

    System.out.println("===== IntStream 변환 ======= :: " );
    IntStream lenths = stringStream.mapToInt(String::length);
    lenths.forEach(i -> System.out.println(i));

    System.out.println("===== Stream 변환 ======= :: " );
    Stream<Integer> integerStream = IntStream.range(0,5).boxed();
    integerStream.forEach(i -> System.out.println(i));
  }
}

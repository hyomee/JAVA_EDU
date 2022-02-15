package com.hyomee.streamedu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {

  public static void main(String[] arg) {

    List<String> stringList = new ArrayList<>();
    stringList.add("c");
    stringList.add("java");
    stringList.add("java script");
    stringList.add("c++");
    stringList.add("c#");

    // Stream 변환
    System.out.println("===== Stream 변환 ======= :: " );
    Stream<String> stringStream = stringList.stream();
    stringStream.forEach(s -> System.out.println(s));

    System.out.println("===== parallelStream 변환 =======");
    Stream<String> stringParallelStream = stringList.parallelStream();
    stringParallelStream.forEach(s -> System.out.println(s));
  }

}

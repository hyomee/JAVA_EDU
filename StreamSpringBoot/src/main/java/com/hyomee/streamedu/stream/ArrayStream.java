package com.hyomee.streamedu.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {
  public static void main(String[] arg) {

    List<String> words = new ArrayList<>();
    words.add("java");
    words.add("javascript");
    words.add("python");
    words.add("c#");

    int count = 0;
    for ( String s : words) {
      if ( s.length() > 4) count++;
    }
    System.out.println("count :: " + count);

    long streamCnt = words.stream().filter(s->s.length()>4).count();
    System.out.println("streamCnt :: " + streamCnt);

    System.out.println("===== Stream 변환 =======");
    String[] strings = new String[]{"c#", "java", "java script"};
    Stream<String> stringStream = Arrays.stream(strings);
    stringStream.forEach(s -> System.out.println(s));

    System.out.println("===== 배열에서 원하는 요소 찾기 =======");
    Stream<String> stringStreamOfElement = Arrays.stream(strings, 1,3) ;
    stringStreamOfElement.forEach(s -> System.out.println(s));
  }
}

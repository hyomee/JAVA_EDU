package com.javavariable.array;

import java.util.Arrays;

public class ArrayRead {
   public static void main(String[] args) {
      int[] numArray = new int[] {10,20,30};

      // 요소 하나씩 읽어 오기
      // 배열에 있는 2번 째 요소를 읽어 온다.
      int num = numArray[2];
      System.out.println("num : " + num);

      // 베열에 있는 모든 요소를 String 로 변환 한다.
      String numStr = Arrays.toString(numArray);
      System.out.println("num : " + numStr);

      // 배열의 요소를 하나씩 읽어 오기
      // 배열의 길이-1 까지 반복문을 사용
      int numArrayLength = numArray.length;
      for ( int i = 0; i < numArrayLength; i++) {
         System.out.println(String.format("배열 %d 번째 값 %s", i, numArray[i]));
      }

      // for-each 문을 이용 헤서 읽어 오기
      for(int value: numArray) {
         System.out.println(String.format("배열 값 %s",  value));
      }
   }

}

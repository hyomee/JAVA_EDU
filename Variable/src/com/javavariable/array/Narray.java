package com.javavariable.array;

public class Narray {
   public static void main(String[] args) {
      int[][] numNarray = {{10,20,30},{40,50,60}};

      for ( int i = 0; i < numNarray.length ; i++) {
         System.out.println(String.format("배열 %d행, 값: %s"
                 , i
                 ,String.valueOf(numNarray[i])));
         for (int j = 0; j < numNarray[i].length; j++) {
            System.out.println(String.format("배열 %d열, 값: %s"
                    , i
                    ,String.valueOf(numNarray[i][j])));
         }
      }

      for (int[] row:numNarray) {
         for(int column: row) {
            System.out.println(String.format("값: %s"
                    , String.valueOf(column)));
         }
      }
   }
}

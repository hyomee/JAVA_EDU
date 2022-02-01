package com.hyomee.operator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InstanceofOperator {
   public static void main(String[] args) {
      ArrayList list = new ArrayList();

      System.out.println(list instanceof ArrayList);
      System.out.println(list instanceof List);
      System.out.println(list instanceof Set);
   }
}

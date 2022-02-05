package com.hyomee.genericMethod;

import java.util.HashMap;
import java.util.Map;

public class GenericMethod {
  <T> T method(T t) {
    return t;
  }

  <T> String methodRnString(T t1, T t2){
    // t1 +  t2 : Operator '+' cannot be applied to 'T', 'T'
    return t1 + "" + t2;
  }

  <K,V> void methodPrint(K t1, V v1){
    // t1 +  t2 : Operator '+' cannot be applied to 'T', 'T'
    System.out.println(t1 + " : " + v1 );
  }

  <K,V> V methodPrintRnString(K t1, V v1){
    // t1 +  t2 : Operator '+' cannot be applied to 'T', 'T'
    System.out.println(t1 + " : " + v1 );
    return (V) (t1 + " : " + v1);
  }

  <T, V> boolean checkEquals(V v1, V v2){
    return v1.equals(v2);
  }

  <T extends String, I extends Integer, V> String extednsMethod(T t, I i, V v){
    char ch = t.charAt(i);
    return  v.toString() + ch ;
  }

}

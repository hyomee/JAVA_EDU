package com.hyomee.generic.genericMethod;

import java.util.HashMap;
import java.util.Map;

public class GenericMethod {
  <T> T method(T t) {
    return t;
  }

  // Generic Method 내부에서 매개변수의 산술 연산 되지 않음 ->  Object
  <T> String methodRnString(T t1, T t2){
    // t1 +  t2 : Operator '+' cannot be applied to 'T', 'T'
    return t1 + "" + t2;
  }

  <K,V> void methodPrint(K t1, V v1){
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
  // Generic Method 내부에서는 매개변수로 한 참조 변수의 메서드로
  // Object Class의 Method만 가능
  <T extends String, I extends Integer, V> String extednsMethod(T t, I i, V v){
    char ch = t.charAt(i);
    return  v.toString() + ch ;
  }

}

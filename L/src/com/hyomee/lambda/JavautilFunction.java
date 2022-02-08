package com.hyomee.lambda;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavautilFunction {

  public void javautil () {

    // Runnable은 인자를 받지 않고 리턴값도 없는 인터페이스
    Runnable runnable = () -> System.out.println("실행하기!");
    runnable.run();

    // Supplier<T>는 인자를 받지 않고 T 타입의 객체를 리턴
    Supplier<String> fnGetStr = () -> "문장을 리턴!";
    String str = fnGetStr.get();
    System.out.println(str);

    // Consumer<T>는 T 타입의 객체를 인자로 받고 리턴 값은 없습니다
    Consumer<String> fnPrint00 = text -> System.out.println("나는 " + text + "?");
    fnPrint00.accept("온달");

    Consumer<String> fnPrint01 = text -> System.out.println("너는 " + text + "?");
    Consumer<String> fnPrint02 = text -> System.out.println("왜 같이 살았을까?");
    fnPrint01.andThen(fnPrint02).accept("평가");

    // Function<T, R>는 T타입의 인자를 받고, R타입의 객체를 리턴합니다.
    Function<Integer, Integer> fnMultiply = (value) -> value * 2;
    Integer result = fnMultiply.apply(3);
    System.out.println(result);

    Function<Integer, Integer> fnAdd      = (value) -> value + 3;

    // fnAdd 먼저 수행되고 그 이후에 fnMultiply 수행됨
    Function<Integer, Integer> fnAddThenMultiply = fnMultiply.compose(fnAdd);
    Integer rst = fnAddThenMultiply.apply(3);
    System.out.println(rst);

    // Predicate<T>는 T타입 인자를 받고 결과로 boolean을 리턴
    Predicate<Integer> fnIsUp = num -> num > 5;
    System.out.println("10은 5보다 크다 -> " + fnIsUp.test(10));
    Predicate<Integer> fnisDown= num -> num < 6;
    System.out.println(fnIsUp.and(fnisDown).test(10));
    System.out.println(fnIsUp.or(fnisDown).test(10));

    Predicate<String> isEquals = Predicate.isEqual("선화");
    System.out.println(isEquals.test("선화"));

  }
}

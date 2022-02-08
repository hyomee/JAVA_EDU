package com.hyomee.lambda;

import java.util.function.BiFunction;

class Customer {
  private int custNo;
  private String custName;

  static int ages = 30;

  Customer(int custNo, String custName) {
    this.custNo = custNo;
    this.custName = custName;
  }

  int getCustNo() {
    return this.custNo;
  }

  String getCustName() {
    return this.custName;
  }
  void printCust() {
    System.out.println(this.custNo + "," + this.custName);
  }

  void changeName(String custName) {
    this.custName = custName;
  }

  static int staticMethod(int a) {
    return a;
  }


}

interface IfExistsClassCreate {
  Customer create(int custNo, String CustNm);
}

interface IfExistsClass {
  Customer getCust(String name);
}

interface IfExistsClassMethod {
  String getCust();
}

interface IfExistsClassMethod01 {
  void changeName(String name);
}

interface IfExistsClassStaticMethod {
  int runStaticMethod(int ages);
}



public class ExistsClassLamda {
  private static Customer getCust(String name) {
    // Customer customer = new Customer(20, "춘향") ;

    // BiFunction<Integer, String, Customer> customerFn = (custNo, custNm) -> new Customer(custNo, custNm);
    // Customer customer = customerFn.apply(20, "춘향");

    BiFunction<Integer, String, Customer> customerFn = Customer::new;
    Customer customer = customerFn.apply(20, "춘향");


    customer.printCust();
    customer.changeName(name);
    customer.printCust();
    return customer;
  }

  public void printCust() {
    IfExistsClass iec = ExistsClassLamda::getCust;

    Customer customer = iec.getCust("이도령");
    System.out.println(customer.getCustNo());
    System.out.println(customer.getCustName());

    IfExistsClassCreate iecmc = Customer ::new;;
    Customer customer01 = iecmc.create(10, "온달");
    //Customer customer01 = new Customer(10, "온달");

    IfExistsClassMethod iecm = customer01::getCustName;
    System.out.println("iecm :: " + iecm.getCust());

    IfExistsClassMethod01 iecm01 = customer01::changeName;
    iecm01.changeName("평강");
    System.out.println("iecm01 :: " + customer01.getCustNo());
    System.out.println("iecm01 :: " + customer01.getCustName());

    // static 메서드
    IfExistsClassStaticMethod iecsm = Customer::staticMethod;
    System.out.println("iecsm :: " + iecsm.runStaticMethod(20));
    ;
  }



}

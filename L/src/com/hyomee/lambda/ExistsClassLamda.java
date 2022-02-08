package com.hyomee.lambda;

class Customer {
  private int custNo;
  private String custName;
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

public class ExistsClassLamda {
  public void printCust() {
    IfExistsClass iec = (name) -> {
      Customer customer = new Customer(20, "춘향") ;
      customer.printCust();
      customer.changeName(name);
      customer.printCust();
      return customer;
    };

    Customer customer = iec.getCust("이도령");
    System.out.println(customer.getCustNo());
    System.out.println(customer.getCustName());

    Customer customer01 = new Customer(10, "온달");
    IfExistsClassMethod iecm = customer01::getCustName;
    System.out.println("iecm :: " + customer01.getCustName());
    IfExistsClassMethod01 iecm01 = customer01::changeName;
    iecm01.changeName("평강");
    System.out.println("iecm01 :: " + customer01.getCustNo());
    System.out.println("iecm01 :: " + customer01.getCustName());

  }



}

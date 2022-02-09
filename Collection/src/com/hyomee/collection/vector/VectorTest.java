package com.hyomee.collection.vector;


import java.util.*;


public class VectorTest {
  private final List<String> strList;

  public VectorTest() {
    strList = new Vector<>();

    Stack s = new Stack();
  }

  public void VectorApiTest() {
    System.out.println("========== VectorApiTest ===========");
    addtMethod();
    removeMethod();
    getMethod();
    sortMethod();
    copyMethod();
    shallowCopyObjectMethod();
    deepCopyObjectMethod();
  }

  // 요소에 데이터 추가
  private void addtMethod() {
    // 요소 추가
    strList.add("현대자동차");
    strList.add("기아자동차");

    System.out.println("strList " + strList.toString());
    // 결과 : [현대자동차, 기아자동차]

    // 특정 요소에 데이터 추가
    strList.add(0, "삼성자동차");
    System.out.println("strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 기아자동차]

    // 컬렉션을 요소에 추가
    List<String> strCollection =  new Vector<>();
    strCollection.add("포드자동차");
    strCollection.add("도시바자동차");
    System.out.println("strCollection " + strCollection.toString());
    // 결과 : [포드자동차, 도시바자동차]

    // 컬렉션을 마지막 요소에 추가
    strList.addAll(strCollection);
    System.out.println("strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 기아자동차, 포드자동차, 도시바자동차]

    List<String> strCollection01 =  new Vector<>();
    strCollection01.add("포르쉐자동차");
    strCollection01.add("BMW자동차");
    System.out.println("strCollection01 " + strCollection01.toString());
    // 결과 : [포르쉐자동차, BMW자동차]

    // 컬렉션을 특정 요소에 추가
    strList.addAll(3, strCollection01);
    System.out.println("strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 기아자동차, 포르쉐자동차, BMW자동차, 포드자동차, 도시바자동차]
  }

  private void removeMethod() {
    // 지정한 위치  요소 삭제
    strList.remove(2);
    System.out.println("removeMethod : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 포르쉐자동차, BMW자동차, 포드자동차, 도시바자동차]


    List<String> strCollection01 =  new Vector<>();
    strCollection01.add("포르쉐자동차");
    strCollection01.add("BMW자동차");
    System.out.println("removeMethod : strCollection01 " + strCollection01.toString());
    // 결과 : [포르쉐자동차, BMW자동차]

    // Collection 객체에 있는 모든 요소 삭제
    strList.removeAll(strCollection01);
    System.out.println("removeMethod : removeAll : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 포드자동차, 도시바자동차]

    strList.add("포드자동차");
    System.out.println("removeMethod :  strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 포드자동차, 도시바자동차, 포드자동차]

    // 중복되는 요소 값의 첫번째 삭제
    strList.remove("포드자동차");
    System.out.println("removeMethod :  remove : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 도시바자동차, 포드자동차]

    // 마지막 index 삭제
    strList.remove(strList.size() -1 );
    System.out.println("removeMethod :  remove : strList " + strList.toString());
    // 결과 : [삼성자동차, 현대자동차, 도시바자동차]

    // 전체 삭제
    strList.clear();
    System.out.println("removeMethod : strList " + strList.toString());
    // 결과 : []


  }

  private void getMethod() {

    // 리스트에 데이터가 없으면 데이터 생성
    if (strList.isEmpty()) {
      addtMethod();
    }

    // 순회 하면서 정보 읽기
    int size = strList.size();
    for ( int i = 0; i < size; i++) {
      // i 변수는 지역변수로 개발자 실수에 의해서 오염 될 수 있음
      // i = i + 4; // List에 값이 없어서 오류 발생 할수 있음
      // java.lang.IndexOutOfBoundsException: 발생
      System.out.println("getMethod : strList i " + i + " , 정보 : " + strList.get(i));
    }
    /*
     * 결과 :
     * getMethod : strList i 0 , 정보 : 삼성자동차
     * getMethod : strList i 1 , 정보 : 현대자동차
     * getMethod : strList i 2 , 정보 : 기아자동차
     * getMethod : strList i 3 , 정보 : 포르쉐자동차
     * getMethod : strList i 4 , 정보 : BMW자동차
     * getMethod : strList i 5 , 정보 : 포드자동차
     * getMethod : strList i 6 , 정보 : 도시바자동차
     */

    // foreach 로 표현
    for(String str: strList) {
      System.out.println("getMethod : strList " + str);
    }
    /*
     * 결과 :
     * getMethod : strList 삼성자동차
     * getMethod : strList 현대자동차
     * getMethod : strList 기아자동차
     * getMethod : strList 포르쉐자동차
     * getMethod : strList BMW자동차
     * getMethod : strList 포드자동차
     * getMethod : strList 도시바자동차
     */

    // 특정 요소가 있는지 체크
    // index는 존재 하면 해당 index를 돌려 주고 없으면 -1
    int isExistIndex = strList.indexOf("현대자동차");
    if (isExistIndex > 0) {
      System.out.println("현대자동차는 존재 합니다.");
      strList.add(isExistIndex, "현대자동차대신");
    }
    // 결과 : 현대자동차는 존재 합니다.

    if (!strList.contains("현대02자동차")) {
      System.out.println("현대자동차는 존재 하지 않습니다.");
    }
    // 결과 : 현대자동차는 존재 하지 않습니다.
  }

  private void sortMethod() {
    strList.add("A");
    strList.add("Z");
    strList.add("a");

    // 오름차순으로 정렬
    strList.sort(Comparator.naturalOrder());
    System.out.println("오름차순 : " + strList);
    // 결과 : [A, BMW자동차, Z, a, 기아자동차, 도시바자동차, 삼성자동차, 포드자동차, 포르쉐자동차, 현대자동차, 현대자동차대신]

    // 내림차순으로 정렬
    strList.sort(Comparator.reverseOrder());
    System.out.println("내림차순 : " + strList);
    // 결과 : [현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, a, Z, BMW자동차, A]

    // 대소문자 구분없이 오름차순 정렬
    strList.sort(String.CASE_INSENSITIVE_ORDER);
    System.out.println("대소문자 구분없이 오름차순 : " + strList);
    // 결과 : [a, A, BMW자동차, Z, 기아자동차, 도시바자동차, 삼성자동차, 포드자동차, 포르쉐자동차, 현대자동차, 현대자동차대신]

    // 대소문자 구분없이 내림차순 정렬
    strList.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
    System.out.println("대소문자 구분없이 내림차순 : " + strList);
    // 결과 : [현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, Z, BMW자동차, a, A]

  }

  private void  copyMethod() {
    List<String> strListTemp = strList;
    System.out.println("복사 : strListTemp : " + strListTemp);
    // 결과 : [현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, Z, BMW자동차, a, A]
    strListTemp.add(0, "추가");

    System.out.println("원본 : strList : " + strList);
    // 결과 : [추가, 현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, Z, BMW자동차, a, A]
    System.out.println("복사 : strListTemp : " + strListTemp);
    // 결과 : [추가, 현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, Z, BMW자동차, a, A]

    List<String> strListTemp01 = new Vector<>();;
    for (String str : strList ) {
      strListTemp01.add(str);
    }
    strListTemp01.add(0, "더추가");
    System.out.println("원본 : strList : " + strList);
    // 결과 : [추가, 현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, Z, BMW자동차, a, A]
    System.out.println("복사 : strListTemp01 : " + strListTemp01);
    // 결과 : [더추가, 추가, 현대자동차대신, 현대자동차, 포르쉐자동차, 포드자동차, 삼성자동차, 도시바자동차, 기아자동차, Z, BMW자동차, a, A]

  }


  private void  shallowCopyObjectMethod() {

    Vector<Customer> customerVector = new Vector<>();
    customerVector.add(new Customer("홍길동", 18));
    customerVector.add(new Customer("홍당무", 20));
    Vector<Customer> copyOfcustomerVector = (Vector<Customer>) customerVector.clone();
    System.out.println("원본 : customerVector : " + customerVector);
    // 결과 : [Customer{name='홍길동', age=18}, Customer{name='홍당무', age=20}]
    System.out.println("복사 : copyOfcustomerVector : " + copyOfcustomerVector);
    // 결과 : [Customer{name='홍길동', age=18}, Customer{name='홍당무', age=20}]

    Customer customer = copyOfcustomerVector.get(0);
    customer.setName("김순길");
    customer.setAge(25);
    System.out.println("원본 : customerVector : " + customerVector);
    // 결과 : [Customer{name='김순길', age=25}, Customer{name='홍당무', age=20}]
    System.out.println("복사 : copyOfcustomerVector : " + copyOfcustomerVector);
    // 결과 : [Customer{name='김순길', age=25}, Customer{name='홍당무', age=20}]

  }

  private void  deepCopyObjectMethod() {
    Vector<CustomerClone> customerVector = new Vector<>();
    customerVector.add(new CustomerClone("홍길동", 18));
    customerVector.add(new CustomerClone("홍당무", 20));
    Vector<CustomerClone> copyOfcustomerVector = new Vector<>();
    for ( CustomerClone customerClone : customerVector) {
      copyOfcustomerVector.add(customerClone.clone());
    }

    System.out.println("원본 : customerVector : " + customerVector);
    // 결과 : [Customer{name='홍길동', age=18}, Customer{name='홍당무', age=20}]
    System.out.println("복사 : copyOfcustomerVector : " + copyOfcustomerVector);
    // 결과 : [Customer{name='홍길동', age=18}, Customer{name='홍당무', age=20}]

    CustomerClone customerClone = copyOfcustomerVector.get(0);
    customerClone.setName("김순길");
    customerClone.setAge(25);

    System.out.println("원본 : customerVector : " + customerVector);
    // 결과 : [Customer{name='홍길동', age=18}, Customer{name='홍당무', age=20}]
    System.out.println("복사 : copyOfcustomerVector : " + copyOfcustomerVector);
    // 결과 : [Customer{name='김순길', age=25}, Customer{name='홍당무', age=20}]
  }


}


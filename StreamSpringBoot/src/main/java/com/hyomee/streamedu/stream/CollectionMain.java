package com.hyomee.streamedu.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionMain {
  public static void main(String[] arg) {
    List<ProductInfo> productList =
            Arrays.asList(new ProductInfo(1, "요금상품1", 10000, "P"),
                    new ProductInfo(2, "부가상품1", 1000, "R"),
                    new ProductInfo(3, "요금상품2", 20000, "P"),
                    new ProductInfo(4, "부가상품2", 2000, "R"),
                    new ProductInfo(5, "옵션상품1", 3000, "O"));

    List<String> productNmList = productList.stream().map(ProductInfo::getProductNm).collect(Collectors.toList());
    productNmList.forEach(System.out::println);

    String productNmStr = productList.stream().map(ProductInfo::getProductNm).collect(Collectors.joining());
    System.out.println( "productNmStr ::" + productNmStr);

    productNmStr = productList.stream().map(ProductInfo::getProductNm).collect(Collectors.joining(",","[","]"));
    System.out.println( "productNmStr ::" + productNmStr);

    Double priceAvarag = productList.stream().filter(productInfo -> productInfo.getProductType().equals("P")).collect(Collectors.averagingInt(ProductInfo::getPrice));
    System.out.println( "priceAvarag ::" + priceAvarag);

    Double allPriceAvarag = productList.stream().collect(Collectors.averagingInt(ProductInfo::getPrice));
    System.out.println( "allPriceAvarag ::" + allPriceAvarag);

    int sumP = productList.stream().filter(productInfo -> productInfo.getProductType().equals("P")).collect(Collectors.summingInt(ProductInfo::getPrice));
    System.out.println( "sumP ::" + sumP);

    int sum = productList.stream().collect(Collectors.summingInt(ProductInfo::getPrice));
    System.out.println( "sum ::" + sum);



    IntSummaryStatistics sumavgP = productList.stream().filter(productInfo -> productInfo.getProductType().equals("P")).collect(Collectors.summarizingInt(ProductInfo::getPrice));
    System.out.println( "sumavgP ::" + sumavgP);

    IntSummaryStatistics sumavg = productList.stream().collect(Collectors.summarizingInt(ProductInfo::getPrice));
    System.out.println( "sumavg ::" + sumavg);

    HashMap groupByProduct = (HashMap) productList.stream().collect(Collectors.groupingBy(ProductInfo::getProductType));
    groupByProduct.forEach((k,v) -> {
      System.out.println( "key ::" + k);
      List<ProductInfo> values = (List<ProductInfo>) v;
      values.forEach(productInfo -> System.out.println("Values:: " + productInfo.getProductNm()));
    });

  }

}

class ProductInfo {
  private int productId;
  private String productNm;
  private int price;
  private String productType;

  public ProductInfo(int productId,
                     String productNm,
                     int price,
                     String productType
                    ) {
    this.productId = productId;
    this.productNm = productNm;
    this.price = price;
    this.productType = productType;
  }

  public String getProductNm() {
    return this.productNm;
  }

  public int getPrice() {
    return this.price;
  }

  public String getProductType() {
    return this.productType;
  }
}

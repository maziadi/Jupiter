package com.dali.jupiter.factory;

public class HighRangeProduct extends ProductImpl {

  public String getProductName() {
    return productName;
  }

  public String getProductRange() {
    return "high";
  }

  public String[] getProductInformations() {
    return  new String [] {"reference", "material", "color", getProductRange(), "price"};
  }
}

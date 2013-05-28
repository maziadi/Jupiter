package com.dali.jupiter.factory;

public class BadRangeProduct extends ProductImpl {

  public String getProductRange() {
    return "bad";
  }

  public String[] getProductInformations() {
    return  new String [] {"reference", "material", "color", getProductRange(), "price"};
  }
}

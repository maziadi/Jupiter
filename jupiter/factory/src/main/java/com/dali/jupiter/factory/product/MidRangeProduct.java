package com.dali.jupiter.factory;

public class MidRangeProduct extends ProductImpl {

  public String getProductRange() {
    return "middle";
  }

  public String[] getProductInformations() {
    return  new String [] {"reference", "material", "color", getProductRange(), "price"};
  }
}

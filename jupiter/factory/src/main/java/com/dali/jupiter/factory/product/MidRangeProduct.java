package com.dali.jupiter.factory;

import java.util.Arrays;

public class MidRangeProduct extends ProductImpl {

  public String getProductRange() {
    return "middle";
  }

  public String[] getProductInformations() {
    return  new String[] {"reference", "material", "color", getProductRange(), "price"};
  }
  public void mainMidRangeProduct  () {
    MidRangeProduct M = new MidRangeProduct();
    System.out.println(M.getProductRange());
    System.out.println(Arrays.toString(M.getProductInformations()));
  }
}

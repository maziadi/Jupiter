package com.dali.jupiter.factory;

import java.util.Arrays;

public class MidRangeProduct extends ProductImpl {

  Caracteristics M = new Caracteristics();

  public String getProductRange() {
    return "middle";
  }

  public String[] getProductInformations() {
    M.setCaracteristics("corraps", "REF-XX-222", "blue", 30);
    System.out.println("Name  is :" + M.getName());
    return new String[] {M.getName(), M.getReference(), M.getColor(), Integer.toString(M.getPrice())};
  }

  public void main() {
    MidRangeProduct M = new MidRangeProduct();
    System.out.println(M.getProductRange());
    //System.out.println(Arrays.toString(M.getProductInformations()));
  }
}

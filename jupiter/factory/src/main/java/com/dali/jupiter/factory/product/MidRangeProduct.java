package com.dali.jupiter.factory;

import java.util.Arrays;

public class MidRangeProduct extends ProductImpl {

  private Caracteristics M;

  public String getProductRange() {
    return "middle";
  }

  public Caracteristics getProductInformations() {
    M.setCaracteristics("corraps", "REF-XX-333", "blue", 30);
    return M;
  }

  public void main() {
    MidRangeProduct M = new MidRangeProduct();
    System.out.println(M.getProductRange());
    //System.out.println(Arrays.toString(M.getProductInformations()));
  }
}

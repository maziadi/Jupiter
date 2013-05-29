package com.dali.jupiter.factory;

public class BadRangeProduct extends ProductImpl {

  private Caracteristics B;

  public String getProductRange() {
    return "bad";
  }

  public Caracteristics getProductInformations() {
    B.setCaracteristics("corraps", "REF-XX-333", "blue", 30);
    return B;
  }
}

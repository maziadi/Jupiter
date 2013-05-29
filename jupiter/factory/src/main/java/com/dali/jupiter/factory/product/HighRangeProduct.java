package com.dali.jupiter.factory;

public class HighRangeProduct extends ProductImpl {

  private Caracteristics H;

  public String getProductRange() {
    return "high";
  }

  public Caracteristics getProductInformations() {
    H.setCaracteristics("corraps", "REF-XX-333", "blue", 30);
    return H;
  }
}

package com.dali.jupiter.factory;

public class HighRangeProduct extends ProductImpl {

  Caracteristics H = new Caracteristics();

  public String getProductRange() {
    return "high";
  }

  public String[] getProductInformations() {
    H.setCaracteristics("corraps", "REF-XX-111", "blue", 30);
    return new String[] {H.getName(), H.getReference(), H.getColor(), Integer.toString(H.getPrice())};
  }
}

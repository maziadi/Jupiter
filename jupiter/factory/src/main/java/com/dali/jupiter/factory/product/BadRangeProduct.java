package com.dali.jupiter.factory;

public class BadRangeProduct extends ProductImpl {

  Caracteristics B = new Caracteristics();

  public String getProductRange() {
    return "bad";
  }

  public String[] getProductInformations() {
    B.setCaracteristics("corraps", "REF-XX-333", "blue", 30);
    return new String[] {B.getName(), B.getReference(), B.getColor(), Integer.toString(B.getPrice())};
  }
}

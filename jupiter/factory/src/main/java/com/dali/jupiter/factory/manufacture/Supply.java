package com.dali.jupiter.factory;

public class Supply extends  FactoryImpl {

  private String material;

  private int reference;

  public String getMaterial () {
    return material;
  }

  public void setMaterial (String material) {
    this.material = material;
  }

  public int getReference () {
    return reference;
  }

  public void setReference (int reference) {
    this.reference = reference;
  }

  public boolean supplyProduct() {
    return true;
  }
}

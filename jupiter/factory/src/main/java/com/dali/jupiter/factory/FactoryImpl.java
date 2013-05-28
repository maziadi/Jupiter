package com.dali.jupiter.factory;

public abstract class FactoryImpl implements  Factory {

  private String factoryName, productRange;

  public String getFactoryName() {
    return factoryName;
  }

  public void setFactoryName (String factoryName) {
    this.factoryName = factoryName;
  }
  
  public String getProductRange() {
    return productRange;
  }
  
  public void setProductRange(String productRange) {
    this.productRange = productRange;
  }

  public boolean designProduct() {
    return true;
  }

  public boolean supplyProduct() {
    return true;
  }

  public boolean manufactureProduct() {
    return true;
  }

  public boolean validateProduct() {
    return true;
  }

  public boolean packageProduct() {
    return true;
  }
}

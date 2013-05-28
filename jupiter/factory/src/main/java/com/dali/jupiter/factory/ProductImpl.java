package com.dali.jupiter.factory;

public abstract class ProductImpl implements Product {

  private String productName, productRange;

  private String[] productInformations;

  public String getProductName() {
    return productName;
  }

  public void setProductName (String productName) {
    this.productName = productName;
  }

  public String getProductRange() {
    return productRange;
  }
  
  public void setProductRange(String productRange) {
    this.productRange = productRange;
  }

  public String[] getProductInformations() {
    return productInformations;
  }

  public void setProductInformations() {
    this.productInformations = productInformations;
  }
}

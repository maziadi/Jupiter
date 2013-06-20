package com.dali.jupiter.factory;

public abstract class ProductImpl implements Product {

  protected String productName;

  public String getProductName() {
    return productName;
  }

  public void setProductName (String productName) {
    this.productName = productName;
  }

  public String getProductInformations() {
    return new String ("infos");
  }
}

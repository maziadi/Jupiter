package com.dali.jupiter.factory;

public abstract class ProductImpl implements Product {

  protected String productName, productRange;

  protected String[] productInformations;
   
  private Caracteristics C;

  public String getProductName() {
    return productName;
  }

  public void setProductName (String productName) {
    this.productName = productName;
  }

  public String getProductRange() {
    return productRange;
  }

  public Caracteristics getProductInformations() {
    return C;
  }
}

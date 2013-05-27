package com.dali.jupiter.factory;

public interface Factory {

  public String getFactoryName();

  public void setFactoryName (String factoryName);

  public String getProductRange();

  public void setProductRange(String productRange);

  public boolean designProduct();

  public boolean supplyProduct();

  public boolean manufactureProduct();

  public boolean validateProduct();

  public boolean packageProduct();
}

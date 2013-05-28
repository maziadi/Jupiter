package com.dali.jupiter.factory;

import org.apache.commons.lang.ArrayUtils;

public interface Product {

  public String getProductName();

  public void setProductName (String factoryName);

  public String getProductRange();

  public String[] getProductInformations();
}

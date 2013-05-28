package com.dali.jupiter.factory;

public class Validation extends  FactoryImpl {

  private String model, color, dimensions;

  private int reference;

  public String getModel () {
    return model;
  }

  public void setModel (String model) {
    this.model = model;
  }

  public String getColor () {
    return color;
  }

  public void setColor (String color) {
    this.color = color;
  }

  public String getDimensions () {
    return dimensions;
  }

  public void setDimensions (String dimensions) {
    this.dimensions = dimensions;
  }

  public int getReference () {
    return reference;
  }

  public void setReference (int reference) {
    this.reference = reference;
  }

  public boolean designProduct() {
    return true;
  }
}

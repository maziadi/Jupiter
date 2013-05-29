package com.dali.jupiter.factory;

public enum Caracteristics {
  NAME, REFERENCE, COLOR, PRICE;

  protected String name ;
  protected String reference;
  protected String color;
  protected int price;

  public void setCaracteristics(String name, String reference, String color, int price) {
    this.name = name;
    this.reference = reference;
    this.color = color;
    this.price = price;
  }
    public String getName() {
      return name;
    }

    public String getReference() {
      return reference;
    }

    public String getColor() {
      return color;
    }

    public int getPrice() {
      return price;
    }
}

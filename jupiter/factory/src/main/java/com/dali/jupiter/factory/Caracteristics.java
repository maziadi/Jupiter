package com.dali.jupiter.factory;

public class Caracteristics {

  protected String name ;
  protected String reference;
  protected String color;
  protected int range;
  protected int price;

  public void setCaracteristics(String name, String reference, String color, int range, int price) {
    this.name = name;
    this.reference = reference;
    this.color = color;
    this.range = range;
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

    public int getRange() {
      return range;
    }

    public int getPrice() {
      return price;
    }
}

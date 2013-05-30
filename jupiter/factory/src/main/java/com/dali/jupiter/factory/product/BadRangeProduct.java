package com.dali.jupiter.factory;

public class BadRangeProduct extends ProductImpl {

  Caracteristics B = new Caracteristics();

  public String getProductRange() {
    return "bad";
  }

  public String[] getProductInformations() {
    B.setCaracteristics("QUINZER", "REF-XX-333", "blue", 30);
    System.out.println("Printing Product informations :");
    System.out.println("  Name : " + B.getName());
    System.out.println("  Reference : " + B.getReference());
    System.out.println("  Color : " + B.getColor());
    System.out.println("  Range : 3");
    System.out.println("  Price : " + B.getPrice());
    System.out.println("------------------------------\n");
    return new String[] {B.getName(), B.getReference(), B.getColor(), Integer.toString(B.getPrice())};
  }
}

package com.dali.jupiter.factory;

public class HighRangeProduct extends ProductImpl {

  Caracteristics H = new Caracteristics();

  public String[] getProductInformations() {
    H.setCaracteristics("QUINZER", "REF-XX-111", "blue", 1,  100);
    System.out.println("Printing Product informations :");
    System.out.println("  Name : " + H.getName());
    System.out.println("  Reference : " + H.getReference());
    System.out.println("  Color : " + H.getColor());
    System.out.println("  Range : " + H.getRange());
    System.out.println("  Price : " + H.getPrice());
    System.out.println("------------------------------\n");
    return new String[] {H.getName(), H.getReference(), H.getColor(), Integer.toString(H.getPrice())};
  }
}

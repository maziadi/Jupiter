package com.dali.jupiter.factory;

import java.util.Arrays;

public class MidRangeProduct extends ProductImpl {

  Caracteristics M = new Caracteristics();

  public String[] getProductInformations() {
    M.setCaracteristics("QUINZER", "REF-XX-222", "blue", 2, 60);
    System.out.println("Printing Product informations :");
    System.out.println("  Name : " + M.getName());
    System.out.println("  Reference : " + M.getReference());
    System.out.println("  Color : " + M.getColor());
    System.out.println("  Range : " + M.getRange());
    System.out.println("  Price : " + M.getPrice());
    System.out.println("------------------------------\n");
    return new String[] {M.getName(), M.getReference(), M.getColor(), Integer.toString(M.getPrice())};
  }

  public void main() {
    MidRangeProduct M = new MidRangeProduct();
    //System.out.println(Arrays.toString(M.getProductInformations()));
  }
}

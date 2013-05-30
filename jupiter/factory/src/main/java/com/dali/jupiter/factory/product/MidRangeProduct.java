package com.dali.jupiter.factory;

import java.util.Arrays;

public class MidRangeProduct extends ProductImpl {

  Caracteristics Carac = new Caracteristics();

  public String[] getProductInformations() {
    Carac.setCaracteristics("QUINZER", "REF-XX-222", "blue", 2, 60);
    System.out.println("Printing Product informations :"
        + "\n\tName : " + Carac.getName()
        + "\n\tReference : " + Carac.getReference()
        + "\n\tColor : " + Carac.getColor()
        + "\n\tRange : " + Carac.getRange()
        + "\n\tPrice : " + Carac.getPrice()
        + "\n------------------------------\n");
    return new String[] {Carac.getName(), Carac.getReference(), Carac.getColor(), Integer.toString(Carac.getPrice())};
  }

  public void main() {
    MidRangeProduct M = new MidRangeProduct();
    //System.out.println(Arrays.toString(M.getProductInformations()));
  }
}

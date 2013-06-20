package com.dali.jupiter.factory;

import java.util.Arrays;

public class MidRangeProduct extends ProductImpl {

  Caracteristics Carac = new Caracteristics();
  Consumption Cons = new Consumption();

  @Override
  public String getProductInformations() {
    Carac.setCaracteristics("QUINZER", "REF-XX-222", "blue", 2, 60);
    Cons.setConsumption(10, 20, 100, 50);

    return new String ("Printing Product informations :"
        + "\n\tName : " + Carac.getName()
        + "\n\tReference : " + Carac.getReference()
        + "\n\tColor : " + Carac.getColor()
        + "\n\tRange : " + Carac.getRange()
        + "\n\tPrice : " + Carac.getPrice()
        + "\n\tConsumption :"
        + "\n\t\t* iron : " + Cons.getIronCons()
        + "\n\t\t* plastic : " + Cons.getPlasticCons()
        + "\n\t\t* liquid : " + Cons.getLiquidCons()
        + "\n\t\t* carton : " + Cons.getCartonCons()
        + "\n------------------------------\n");
  }

  public void main() {
    MidRangeProduct M = new MidRangeProduct();
  }
}

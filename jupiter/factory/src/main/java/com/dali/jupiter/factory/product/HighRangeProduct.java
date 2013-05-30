package com.dali.jupiter.factory;

public class HighRangeProduct extends ProductImpl {

  Caracteristics Carac = new Caracteristics();
  Consumption Cons = new Consumption();

  public String[] getProductInformations() {
    Carac.setCaracteristics("QUINZER", "REF-XX-111", "blue", 1, 90);
    Cons.setConsumption(13, 24, 150, 50);

    System.out.println("Printing Product informations :"
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
    return new String[] {Carac.getName(), Carac.getReference(), Carac.getColor(), Integer.toString(Carac.getPrice())};
  }
}

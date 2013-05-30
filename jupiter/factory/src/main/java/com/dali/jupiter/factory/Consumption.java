package com.dali.jupiter.factory;

public class Consumption {

  protected int ironCons;
  protected int plasticCons;
  protected int liquidCons;
  protected int cartonCons;

  public void setConsumption(int ironCons, int plasticCons, int liquidCons, int cartonCons) {
    this.ironCons  = ironCons ;
    this.plasticCons = plasticCons;
    this.liquidCons = liquidCons;
    this.cartonCons = cartonCons;
  }
    public int getIronCons() {
      return ironCons;
    }

    public int getPlasticCons() {
      return plasticCons;
    }

    public int getLiquidCons() {
      return liquidCons;
    }

    public int getCartonCons() {
      return cartonCons;
    }
}

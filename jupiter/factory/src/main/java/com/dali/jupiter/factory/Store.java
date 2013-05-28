package com.dali.jupiter.factory;

import java.util.Arrays;

public class Store {

  private String[][] availableMaterials={{"iron", "100"}, {"plastic", "100"}, {"liquid", "100"}, {"cartoon", "100"} };

  private int[] quantities;

  public int getMaterialAvailability(String Material) {
    for (int i=0; i<availableMaterials.length;i++) {
      if (Material.equals(availableMaterials[i][0])) {
        return Integer.parseInt(availableMaterials[i][1]);
      } else {
        return -1;
      }
    }
    return 0;
  }

  public String[][] getAllStatistics () {
    return availableMaterials;
  }

  public static void main(String[] args) {
    System.out.println( "--- Classe de Test ---" );
    Store S = new Store();
    System.out.println(Arrays.toString(S.getAllStatistics()[0]));
    for (int i=0; i<S.availableMaterials.length; i++) {
      System.out.println(S.getAllStatistics()[i][0]);
    }
    System.out.println("Availability = " + S.getMaterialAvailability("iron"));
  }
}

package com.dali.jupiter.factory;

import java.util.Arrays;

public class Store {

  private String[][] availableMaterials;

  private int[] quantities;

  public int getMaterialAvailability(String Material) {
    return 5;
  }

  public String[][] getAllStatistics () {
    return new String[][] {{"aze", "rty"}, {"uio", "pqs"}};
  }

  public static void main(String[] args) {
    System.out.println( "--- Classe de Test ---" );
    Store S = new Store();
    System.out.println(S.getMaterialAvailability("iron"));
    System.out.println(Arrays.toString(S.getAllStatistics()));
  }
}

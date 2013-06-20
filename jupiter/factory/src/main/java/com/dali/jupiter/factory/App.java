package com.dali.jupiter.factory;

import javax.swing.JFrame;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        + "\n*** TESTING FACTORY APPLICATION ***"
        + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        + "\n");

    HighRangeProduct Hrp = new HighRangeProduct();
    MidRangeProduct Mrp = new MidRangeProduct();
    BadRangeProduct Brp = new BadRangeProduct();

    System.out.println(Hrp.getProductInformations());
    Mrp.getProductInformations();
    Brp.getProductInformations();

    JFrame fenetre = new JFrame();
    fenetre.setTitle("Product informations");
    fenetre.setSize(1000, 900);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);
  }
}

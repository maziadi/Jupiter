package com.dali.jupiter.factory;

import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class App {
  public static void main(String[] args) {
    System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        + "\n*** TESTING FACTORY APPLICATION ***"
        + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        + "\n");

    HighRangeProduct Hrp = new HighRangeProduct();
    MidRangeProduct Mrp = new MidRangeProduct();
    BadRangeProduct Brp = new BadRangeProduct();

    JFrame fenetre = new JFrame();
    fenetre.setTitle("Product informations");
    fenetre.setSize(500, 700);
    fenetre.setLocationRelativeTo(null);

    JPanel panel = new JPanel();
    panel.setBackground(Color.YELLOW);        

    JTextArea textarea1 = new JTextArea (Hrp.getProductInformations());
    JTextArea textarea2 = new JTextArea (Mrp.getProductInformations());
    JTextArea textarea3 = new JTextArea (Brp.getProductInformations());
    panel.add(textarea1);
    panel.add(textarea2);
    panel.add(textarea3);
    fenetre.setContentPane(panel);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);
  }
}

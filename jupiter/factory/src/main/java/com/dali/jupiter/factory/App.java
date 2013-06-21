package com.dali.jupiter.factory;

import java.awt.Color; 
import javax.swing.*;


public class App extends JFrame{
  public App(){             

    JPanel pan = new JPanel();
    pan.setBackground(Color.WHITE);        
    JButton send = new JButton ("Envoyer");
    JTextField text = new JTextField ("Bonjour !");
    Box bottom = Box.createHorizontalBox();
    bottom.add (text);
    bottom.add (send);
    this.setContentPane(pan);               
    this.setVisible(true);
  }       

  public static void main(String[] args) {
    System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        + "\n*** TESTING FACTORY APPLICATION ***"
        + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        + "\n");

    HighRangeProduct Hrp = new HighRangeProduct();
    MidRangeProduct Mrp = new MidRangeProduct();
    BadRangeProduct Brp = new BadRangeProduct();

    System.out.println(Hrp.getProductInformations());
    System.out.println(Mrp.getProductInformations());
    System.out.println(Brp.getProductInformations());

    App fenetre = new App();
    fenetre.setTitle("Product informations");
    fenetre.setSize(500, 700);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);

    JPanel panel = new JPanel();

    JTextArea textarea1 = new JTextArea (Hrp.getProductInformations());
    JTextArea textarea2 = new JTextArea (Mrp.getProductInformations());
    JTextArea textarea3 = new JTextArea (Brp.getProductInformations());
    panel.add(textarea1);
    panel.add(textarea2);
    panel.add(textarea3);
    fenetre.setContentPane(panel);
  }
}

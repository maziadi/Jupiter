package com.dali.jupiter.factory;

import java.awt.Color; 
import javax.swing.*;


public class App extends JFrame{
  public App(){             

    JPanel pan = new JPanel();
    pan.setBackground(Color.BLACK);        
    JButton send = new JButton ("Envoyer");
    JTextField text = new JTextField ("Bonjour !");
    text.setSize (250, 250);
    Box bottom = Box.createHorizontalBox();
    bottom.add (text);
    bottom.add (send);
    JTextArea textarea = new JTextArea ("Dicussion ...");
    textarea.setSize (350, 350);
    textarea.setEditable (true);
    Box main = Box.createVerticalBox();
    main.setSize (400, 600);
    main.add (textarea);
    main.add (bottom);
    pan.add (main);
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
    Mrp.getProductInformations();
    Brp.getProductInformations();

    App fenetre = new App();
    fenetre.setTitle("Product informations");
    fenetre.setSize(500, 700);
    fenetre.setLocationRelativeTo(null);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);
  }
}

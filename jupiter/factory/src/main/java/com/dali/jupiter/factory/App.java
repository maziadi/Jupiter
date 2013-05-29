package com.dali.jupiter.factory;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println( "--- Classe de Test ---" );
        MidRangeProduct Mr = new MidRangeProduct();
        for (int i=0; i<10; i++) {
          Mr.setProductName("MRP");
          //M.main();
        }
        System.out.println(Arrays.toString(Mr.getProductInformations()));
    }
}

package com.dali.jupiter.factory;

public class App {
    public static void main(String[] args) {
        System.out.println( "--- Classe de Test ---" );
        MidRangeProduct M = new MidRangeProduct();
        for (int i=0; i<10; i++) {
          M.setProductName("MRP");
          System.out.println(M.getProductName());
          M.main();
        }
    }
}

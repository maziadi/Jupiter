package com.dali.jupiter.factory;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
            + "\n*** TESTING FACTORY APPLICATION ***"
            + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
            +"\n");

        HighRangeProduct Hrp = new HighRangeProduct();
        MidRangeProduct Mrp = new MidRangeProduct();
        BadRangeProduct Brp = new BadRangeProduct();

        Hrp.getProductInformations();
        Mrp.getProductInformations();
        Brp.getProductInformations();
        //System.out.println(Arrays.toString(Mr.getProductInformations()));
    }
}

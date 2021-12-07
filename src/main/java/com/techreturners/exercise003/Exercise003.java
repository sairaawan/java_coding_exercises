package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        
        if(iceCreamFlavour.equalsIgnoreCase("Mint Chocolate Chip"))
        return 3;
        if(iceCreamFlavour.equalsIgnoreCase("Mango Sorbet"))
        return 5;
        if(iceCreamFlavour.equalsIgnoreCase("Raspberry Ripple"))
        return 1;
        if(iceCreamFlavour.equalsIgnoreCase("Vanilla"))
        return 2;
        if(iceCreamFlavour.equalsIgnoreCase("Chocolate"))
        return 4;
        if(iceCreamFlavour.equalsIgnoreCase("Pistachio"))
        return 0;
        return 6;
        
    }

    String[] iceCreamFlavours() {
        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return expected;
    }

}

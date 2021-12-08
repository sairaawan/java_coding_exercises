package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        input = input.toUpperCase();
        boolean result= true;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (!input.contains(String.valueOf(ch))) 
                result = false;    
             }
        return result;
    }
}

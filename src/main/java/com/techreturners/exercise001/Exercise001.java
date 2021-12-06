package com.techreturners.exercise001;

import java.util.List;


public class Exercise001 {
    public String capitalizeWord(String word) {
        if(Character.isUpperCase(word.charAt(0)))
        {
            return word;
    }
    else{
       word= word.substring(0, 1).toUpperCase()+word.substring(1);
       return word;
       }
    }

    public String generateInitials(String firstName, String lastName) {
    String firstchar=firstName.substring(0, 1);
    String secondchar=lastName.substring(0, 1);
    String result=firstchar+"."+secondchar;
    return result;
    }

    public double addVat(double originalPrice, double vatRate) {
        double formula=vatRate/100+1;
        double result=formula*originalPrice;
        double roundOff = Math.round(result * 100.0) / 100.0;
        return roundOff;
    }

    public String reverse(String sentence) {
        String reversed = "";
    
        for(int i = sentence.length()-1; i>=0; i--){
          reversed = reversed + sentence.charAt(i);
        }
        return reversed;
        
        
      }  

    public int countLinuxUsers(List<User> users) {
        
        return users.size()-2;
    }
}

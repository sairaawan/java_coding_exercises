package com.techreturners.exercise002;

class Person{
    String fname;
    String lname;
    String city;
    int age;
    public String getFname()
   {
     return fname;
   }
 
   
   public String getLname()
   {
     return lname;
   }
 
   public String getcity()
   {
     return city;
   }
   public int getAge()
   {
     return age;
   }
    public Person(String fnameVal, String lnameVal, String cityVal, int ageVal)
        {
           fname = fnameVal;
           lname = lnameVal;
           city=cityVal;
           age = ageVal;
        }
 
 }

public class Exercise002 {

    public boolean isFromManchester(Person p) {
       return p.getcity().equalsIgnoreCase("manchester");
    }

    public boolean canWatchFilm(Person p, int ageLimit) {
        return p.getAge()>=ageLimit;

    }
    
}

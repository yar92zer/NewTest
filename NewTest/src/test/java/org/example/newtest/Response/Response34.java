package org.example.newtest.Response;

public class Response34 {
    public static boolean test34(String name,int age,int zp,String country,String gender,int experience){
         if(name.toLowerCase().startsWith("Анна")
         && age>=31 && age<=33
         && zp>=36000&&zp<=59000
         &&country.equalsIgnoreCase("Германия")
         && gender.equalsIgnoreCase("Женский")
         && experience==13){
             return true;
         }
         return false;
    }
}
/*Name: "Анна"
Age: от 31 до 33
Zp: от 36000 руб до 59000 руб
Country: "Германия"
Gender: "Женский"
Experience: 13 лет*/
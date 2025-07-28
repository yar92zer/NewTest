package org.example.newtest.Response;

public class Response13 {
    public static boolean test13(String name, int age,int zp,String country,String gender,int experience){
        if (name.toLowerCase().startsWith("Е")
        && age >=21&& age <=23
        && zp>=21000&& zp<=33000
        && country.equalsIgnoreCase("З")
        && gender.equalsIgnoreCase("Мужской")
        && experience==26){
            return true;
        }
        return false;
    }
}
/*Name: "Е"
Age: от 21 до 23
Zp: от 21000 руб до 33000 руб
Country: "З"
Gender: "Мужской"
Experience: 26 лет*/
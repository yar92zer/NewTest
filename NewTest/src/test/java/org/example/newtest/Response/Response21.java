package org.example.newtest.Response;

public class Response21 {
    public static boolean test21(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Г")
        && age <=26 && age >=40
        && zp <= 26000 && zp >=34000
        && country.equalsIgnoreCase("Франция")
        && gender.equalsIgnoreCase("Мужской")
        && experience==2){
            return true;
        }
        return false;
    }
}
/*Name: "Г"
Age: от 26 до 40
Zp: от 26000 руб до 34000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 2 года*/
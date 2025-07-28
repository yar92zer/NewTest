package org.example.newtest.Response;

public class Response5 {
    public static boolean test5(String name, int age, int zp,String country,String gender,int experience){
        if (name.toLowerCase().startsWith("В")
        && age >=34 && age <=39
        && zp >=44000 && zp <=48000
        && country.equalsIgnoreCase("Р")
        && gender.equalsIgnoreCase("Мужской")
        && experience ==7){
            return true;
        }
        return false;
    }
}
/*Name: "В"
Age: от 34 до 39
Zp: от 44000 руб до 48000 руб
Country: "Р"
Gender: "Мужской"
Experience: 7 лет*/
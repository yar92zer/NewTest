package org.example.newtest.Response;

public class Response22 {
    public static boolean test22(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("В")
        && age >=21&& age <=24
        && zp>=32000 && zp<=34000
        && country.equalsIgnoreCase("Р")
        && gender.equalsIgnoreCase("Мужской")
        && experience==20){
            return true;
        }
        return false;
    }
}
/*Name: "В"
Age: от 21 до 24
Zp: от 32000 руб до 34000 руб
Country: "Р"
Gender: "Мужской"
Experience: 20 лет*/
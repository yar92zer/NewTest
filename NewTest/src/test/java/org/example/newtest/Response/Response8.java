package org.example.newtest.Response;

public class Response8 {
    public static boolean test8(String name,int age,int zp,String country,String gender,int experience){
        if (name.toLowerCase().startsWith("Ч")
        && age >=44 && age <=64
        && zp >=20000 && zp <=35000
        && country.equalsIgnoreCase("Л")
        && gender.equalsIgnoreCase("Женский")
        && experience==17){
            return true;
        }
        return false;
    }
}
/*Name: "Ч"
Age: от 44 до 64
Zp: от 20000 руб до 35000 руб
Country: "Л"
Gender: "Женский"
Experience: 17 лет*/
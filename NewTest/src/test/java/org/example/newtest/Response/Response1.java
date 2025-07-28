package org.example.newtest.Response;

public class Response1 {
    public static boolean test(String name, int age, int zp,String country,String gender,int experience) {
        if (name.toLowerCase().startsWith("Ш")
                && age >= 29 && age <= 33
                && zp >= 20000 && zp <= 25000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience==33){
            return true;
        }
        return false;
    }
}
/*Name: "Ш"
Age: от 29 до 33
Zp: от 20000 руб до 25000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 33 лет*/
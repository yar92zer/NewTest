package org.example.newtest.Response;

public class Response7 {
    public static boolean test7(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("П")
                && age >=24 && age <=2
                && zp >= 34000 && zp <= 39000
                && country.equalsIgnoreCase("З")
                && gender.equalsIgnoreCase("Мужской")
                && experience==35) {
            return true;
        }
        return false;
    }
}
/*Name: "П"
Age: от 24 до 29
Zp: от 34000 руб до 39000 руб
Country: "Э"
Gender: "Мужской"
Experience: 35 лет*/
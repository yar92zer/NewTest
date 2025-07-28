package org.example.newtest.Response;

public class Response41 {
    public static boolean test41(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 31 && age <= 52
                && zp >= 34000 && zp <= 38000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }

}
/*Name: "Дмитрий"
Age: от 31 до 52
Zp: от 34000 руб до 38000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 6 лет*/
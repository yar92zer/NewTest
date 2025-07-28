package org.example.newtest.Response;

public class Response40 {
    public static boolean test40(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 20 && age <= 28
                && zp >= 22000 && zp <= 29000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 20 до 28
Zp: от 22000 руб до 29000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 2 года*/
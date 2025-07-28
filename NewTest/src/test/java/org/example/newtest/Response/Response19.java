package org.example.newtest.Response;

public class Response19 {
    public static boolean test19(String name, int age, int zp, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("З")
                && age >= 26000 && age <= 42000
                && zp >= 26000 && zp <= 42000
                && country.equalsIgnoreCase("Ц")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 35) {
            return true;
        }
        return false;
    }
}
/*Name: "З"
Age: от 20 до 29
Zp: от 26000 руб до 42000 руб
Country: "Ц"
Gender: "Мужской"
Experience: 35 лет*/
package org.example.newtest.Response;

public class Response75 {
    public static boolean test75(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 48 && age <= 54
                && salary >= 24000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 48 до 54
Salary: от 24000 руб до 36000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 7 лет*/
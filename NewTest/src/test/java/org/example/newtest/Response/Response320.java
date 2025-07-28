package org.example.newtest.Response;

public class Response320 {
    public static boolean test320(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 28 && age <= 46
                && salary >= 35000 && salary <= 36000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 28 до 46
Salary: от 35000 руб до 36000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 13 лет*/
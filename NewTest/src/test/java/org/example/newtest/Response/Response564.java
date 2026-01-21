package org.example.newtest.Response;

public class Response564 {
    public static boolean test564(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 33 && age <= 36
                && salary >= 35000 && salary <= 48000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 33 до 36
Salary: от 35000 руб до 48000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 11 лет*/
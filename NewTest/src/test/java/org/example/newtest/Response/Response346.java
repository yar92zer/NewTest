package org.example.newtest.Response;

public class Response346 {
    public static boolean test346(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 32 && age <= 34
                && salary >= 35000 && salary <= 37000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 32 до 34
Salary: от 35000 руб до 37000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 8 лет*/
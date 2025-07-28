package org.example.newtest.Response;

public class Response414 {
    public static boolean test414(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 49 && age <= 51
                && salary >= 59000 && salary <= 61000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 49 до 51
Salary: от 59000 руб до 61000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 4 года*/
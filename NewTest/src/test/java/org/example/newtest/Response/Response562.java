package org.example.newtest.Response;

public class Response562 {
    public static boolean test562(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 22 && age <= 51
                && salary >= 23000 && salary <= 36000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 22 до 51
Salary: от 23000 руб до 36000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 4 года*/
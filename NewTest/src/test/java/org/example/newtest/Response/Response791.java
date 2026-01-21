package org.example.newtest.Response;

public class Response791 {
    public static boolean test791(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 38 && age <= 45
                && salary >= 20000 && salary <= 37000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Иван"
Age: от 38 до 45
Salary: от 20000 руб до 37000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 14 лет*/
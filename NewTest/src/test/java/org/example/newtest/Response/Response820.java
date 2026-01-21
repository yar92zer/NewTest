package org.example.newtest.Response;

public class Response820 {
    public static boolean test820(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 19 && age <= 49
                && salary >= 58000 && salary <= 60000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Иван"
Age: от 19 до 49
Salary: от 58000 руб до 60000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 9 лет*/
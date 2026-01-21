package org.example.newtest.Response;

public class Response860 {
    public static boolean test860(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 31 && age <= 32
                && salary >= 21000 && salary <= 23000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Иван"
Age: от 31 до 32
Salary: от 21000 руб до 23000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 3 года*/
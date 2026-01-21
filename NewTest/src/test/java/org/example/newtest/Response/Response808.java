package org.example.newtest.Response;

public class Response808 {
    public static boolean test808(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 22 && age <= 26
                && salary >= 30000 && salary <= 31000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Иван"
Age: от 22 до 26
Salary: от 30000 руб до 31000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/
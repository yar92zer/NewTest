package org.example.newtest.Response;

public class Response890 {
    public static boolean test890(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 20 && age <= 26
                && salary >= 28000 && salary <= 33000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Андрей"
Age: от 20 до 26
Salary: от 28000 руб до 33000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 4 года*/
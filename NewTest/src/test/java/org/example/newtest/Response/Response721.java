package org.example.newtest.Response;

public class Response721 {
    public static boolean test721(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 24 && age <= 25
                && salary >= 27000 && salary <= 45000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Дмитрий"
Age: от 24 до 25
Salary: от 27000 руб до 45000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/
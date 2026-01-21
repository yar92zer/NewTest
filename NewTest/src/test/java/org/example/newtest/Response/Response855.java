package org.example.newtest.Response;

public class Response855 {
    public static boolean test855(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 41 && age <= 45
                && salary >= 33000 && salary <= 44000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Егор"
Age: от 41 до 45
Salary: от 33000 руб до 44000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/
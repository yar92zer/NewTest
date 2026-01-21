package org.example.newtest.Response;

public class Response916 {
    public static boolean test916(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 23 && age <= 34
                && salary >= 24000 && salary <= 35000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Иван"
Age: от 23 до 34
Salary: от 24000 руб до 35000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 9 лет*/
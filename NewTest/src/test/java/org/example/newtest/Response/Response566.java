package org.example.newtest.Response;

public class Response566 {
    public static boolean test566(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 36 && age <= 53
                && salary >= 21000 && salary <= 33000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 36 до 53
Salary: от 21000 руб до 33000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 15 лет*/
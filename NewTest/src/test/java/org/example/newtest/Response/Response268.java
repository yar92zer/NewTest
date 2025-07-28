package org.example.newtest.Response;

public class Response268 {
    public static boolean test268(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 19 && age <= 21
                && salary >= 20000 && salary <= 22000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 19 до 21
Salary: от 20000 руб до 22000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 2 года*/
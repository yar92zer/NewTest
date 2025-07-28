package org.example.newtest.Response;

public class Response264 {
    public static boolean test264(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 25 && age <= 37
                && salary >= 40000 && salary <= 41000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 25 до 37
Salary: от 40000 руб до 41000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 3 года*/
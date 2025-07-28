package org.example.newtest.Response;

public class Response94 {
    public static boolean test94(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 20 && age <= 26
                && salary >= 33000 && salary <= 44000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 20 до 26
Salary: от 33000 руб до 44000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 6 лет*/
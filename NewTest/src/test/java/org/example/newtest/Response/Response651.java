package org.example.newtest.Response;

public class Response651 {
    public static boolean test651(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 35 && age <= 41
                && salary >= 28000 && salary <= 30000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Алина"
Age: от 35 до 41
Salary: от 28000 руб до 30000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 8 лет*/
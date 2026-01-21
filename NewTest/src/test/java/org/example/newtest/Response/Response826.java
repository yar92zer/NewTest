package org.example.newtest.Response;

public class Response826 {
    public static boolean test826(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 43 && age <= 54
                && salary >= 41000 && salary <= 42000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Юлия"
Age: от 43 до 54
Salary: от 41000 руб до 42000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 5 лет*/
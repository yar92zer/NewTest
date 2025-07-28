package org.example.newtest.Response;

public class Response119 {
    public static boolean test119(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 20 && age <= 49
                && salary >= 25000 && salary <= 51000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 20 до 49
Salary: от 25000 руб до 51000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 6 лет*/
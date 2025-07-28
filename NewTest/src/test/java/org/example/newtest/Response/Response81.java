package org.example.newtest.Response;

public class Response81 {
    public static boolean test81(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 44 && age <= 49
                && salary >= 26000 && salary <= 26000
                && country.equalsIgnoreCase("Автстрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 44 до 49
Salary: от 26000 руб до 26000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 9 лет*/
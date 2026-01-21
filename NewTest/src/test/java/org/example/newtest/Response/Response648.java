package org.example.newtest.Response;

public class Response648 {
    public static boolean test648(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 43 && age <= 45
                && salary >= 26000 && salary <= 29000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 43 до 45
Salary: от 26000 руб до 29000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 10 лет*/
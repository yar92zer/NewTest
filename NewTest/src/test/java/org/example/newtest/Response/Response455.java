package org.example.newtest.Response;

public class Response455 {
    public static boolean test455(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 36 && age <= 58
                && salary >= 26000 && salary <= 28000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 36 до 58
Salary: от 26000 руб до 28000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 4 года*/
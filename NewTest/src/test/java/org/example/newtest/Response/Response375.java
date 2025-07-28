package org.example.newtest.Response;

public class Response375 {
    public static boolean test375(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 25 && age <= 42
                && salary >= 42000 && salary <= 44000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }

    public static class Response376 {
    }
}
/*Name: "Екатерина"
Age: от 25 до 42
Salary: от 42000 руб до 44000 руб
Country: "Италия"
Gender: "Женский"
Experience: 13 лет*/
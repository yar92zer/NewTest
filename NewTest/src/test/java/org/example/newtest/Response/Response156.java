package org.example.newtest.Response;

public class Response156 {
    public static boolean test156(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 27 && age <= 30
                && salary >= 20000 && salary <= 55000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 27 до 30
Salary: от 20000 руб до 55000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 10 лет*/
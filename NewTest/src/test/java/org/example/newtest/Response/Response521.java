package org.example.newtest.Response;

public class Response521 {
    public static boolean test521(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 27 && age <= 34
                && salary >= 28000 && salary <= 30000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 27 до 34
Salary: от 28000 руб до 30000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 9 лет*/
package org.example.newtest.Response;

public class Response381 {
    public static boolean test381(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 18 && age <= 34
                && salary >= 32000 && salary <= 37000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 18 до 34
Salary: от 32000 руб до 37000 руб
Country: "Германия"
Gender: "Женский"
Experience: 8 лет*/
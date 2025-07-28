package org.example.newtest.Response;

public class Response169 {
    public static boolean test169(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 40 && age <= 42
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 40 до 42
Salary: от 26000 руб до 27000 руб
Country: "Франция"
Gender: "Женский"
Experience: 3 года*/
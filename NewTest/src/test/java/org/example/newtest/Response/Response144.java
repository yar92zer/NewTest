package org.example.newtest.Response;

public class Response144 {
    public static boolean test144(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Франция")
                && age >= 18 && age <= 26
                && salary >= 23000 && salary <= 24000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 18 до 26
Salary: от 23000 руб до 24000 руб
Country: "Франция"
Gender: "Женский"
Experience: 6 лет*/
package org.example.newtest.Response;

public class Response446 {
    public static boolean test446(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 41 && age <= 42
                && salary >= 24000 && salary <= 34000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 41 до 42
Salary: от 24000 руб до 34000 руб
Country: "Италия"
Gender: "Женский"
Experience: 7 лет*/
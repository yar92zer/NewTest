package org.example.newtest.Response;

public class Response286 {
    public static boolean test286(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 40 && age <= 42
                && salary >= 60000 && salary <= 61000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 40 до 42
Salary: от 60000 руб до 61000 руб
Country: "Италия"
Gender: "Женский"
Experience: 8 лет*/
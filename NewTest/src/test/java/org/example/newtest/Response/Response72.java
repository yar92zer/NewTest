package org.example.newtest.Response;

public class Response72 {
    public static boolean test72(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 23 && age <= 23
                && salary >= 2200 && salary <= 28000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 23 до 23
Salary: от 22000 руб до 28000 руб
Country: "Италия"
Gender: "Женский"
Experience: 3 года*/
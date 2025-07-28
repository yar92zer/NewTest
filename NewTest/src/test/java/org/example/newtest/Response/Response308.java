package org.example.newtest.Response;

public class Response308 {
    public static boolean test308(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 25 && age <= 28
                && salary >= 40000 && salary <= 56000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 25 до 28
Salary: от 40000 руб до 56000 руб
Country: "Польша"
Gender: "Женский"
Experience: 7 лет*/
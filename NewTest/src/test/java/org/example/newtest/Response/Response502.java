package org.example.newtest.Response;

public class Response502 {
    public static boolean test502(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 36 && age <= 37
                && salary >= 28000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 36 до 37
Salary: от 28000 руб до 36000 руб
Country: "Польша"
Gender: "Женский"
Experience: 3 года*/
package org.example.newtest.Response;

public class Response362 {
    public static boolean test362(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 21 && age <= 47
                && salary >= 47000 && salary <= 48000
                && country.equalsIgnoreCase("Польща")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 21 до 47
Salary: от 47000 руб до 48000 руб
Country: "Польша"
Gender: "Женский"
Experience: 3 года*/
package org.example.newtest.Response;

public class Response464 {
    public static boolean test464(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 29 && age <= 46
                && salary >= 21000 && salary <= 27000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 29 до 46
Salary: от 21000 руб до 27000 руб
Country: "Польша"
Gender: "Женский"
Experience: 12 лет*/
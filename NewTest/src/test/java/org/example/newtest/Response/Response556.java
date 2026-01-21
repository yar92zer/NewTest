package org.example.newtest.Response;

public class Response556 {
    public static boolean test556(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизовета")
                && age >= 37 && age <= 43
                && salary >= 31000 && salary <= 60000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 37 до 43
Salary: от 31000 руб до 60000 руб
Country: "Польша"
Gender: "Женский"
Experience: 7 лет*/
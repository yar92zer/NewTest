package org.example.newtest.Response;

public class Response305 {
    public static boolean test305(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 35 && age <= 44
                && salary >= 31000 && salary <= 34000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 35 до 44
Salary: от 31000 руб до 34000 руб
Country: "Польша"
Gender: "Женский"
Experience: 8 лет*/
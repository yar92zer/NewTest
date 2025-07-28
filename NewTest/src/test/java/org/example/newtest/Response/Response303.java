package org.example.newtest.Response;

public class Response303 {
    public static boolean test303(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 18 && age <= 22
                && salary >= 22000 && salary <= 27000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 18 до 22
Salary: от 22000 руб до 27000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/
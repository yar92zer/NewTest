package org.example.newtest.Response;

public class Response342 {
    public static boolean test342(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 23 && age <= 41
                && salary >= 27000 && salary <= 44000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 23 до 41
Salary: от 27000 руб до 44000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 5 лет*/
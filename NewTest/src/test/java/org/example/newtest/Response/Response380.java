package org.example.newtest.Response;

public class Response380 {
    public static boolean test380(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 21 && age <= 26
                && salary >= 28000 && salary <= 41000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 21 до 26
Salary: от 28000 руб до 41000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/
package org.example.newtest.Response;

public class Response620 {
    public static boolean test620(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизовета")
                && age >= 41 && age <= 52
                && salary >= 40000 && salary <= 44000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 41 до 52
Salary: от 40000 руб до 44000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 14 лет*/
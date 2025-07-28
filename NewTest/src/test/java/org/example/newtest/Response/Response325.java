package org.example.newtest.Response;

public class Response325 {
    public static boolean test325(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 44 && age <= 47
                && salary >= 40000 && salary <= 45000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 44 до 47
Salary: от 40000 руб до 45000 руб
Country: "Польша"
Gender: "Женский"
Experience: 6 лет*/
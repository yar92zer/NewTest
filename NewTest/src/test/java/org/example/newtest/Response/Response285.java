package org.example.newtest.Response;

public class Response285 {
    public static boolean test285(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 23 && age <= 25
                && salary >= 27000 && salary <= 39000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женская")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 23 до 25
Salary: от 37000 руб до 39000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 7 лет*/
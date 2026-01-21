package org.example.newtest.Response;

public class Response576 {
    public static boolean test576(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 34 && age <= 37
                && salary >= 27000 && salary <= 30000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 34 до 37
Salary: от 27000 руб до 30000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 1 год*/
package org.example.newtest.Response;

public class Response297 {
    public static boolean test297(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 34 && age <= 38
                && salary >= 32000 && salary <= 35000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 34 до 38
Salary: от 32000 руб до 35000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 3 года*/
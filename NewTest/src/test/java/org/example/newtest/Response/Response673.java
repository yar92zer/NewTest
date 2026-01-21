package org.example.newtest.Response;

public class Response673 {
    public static boolean test673(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 55 && age <= 60
                && salary >= 36000 && salary <= 40000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Елизавета"
Age: от 55 до 60
Salary: от 36000 руб до 40000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 3 года*/
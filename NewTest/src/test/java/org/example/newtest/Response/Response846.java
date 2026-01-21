package org.example.newtest.Response;

public class Response846 {
    public static boolean test846(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 23 && age <= 25
                && salary >= 46000 && salary <= 47000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Елизавета"
Age: от 23 до 25
Salary: от 46000 руб до 47000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 4 года*/
package org.example.newtest.Response;

public class Response415 {
    public static boolean test415(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 37 && age <= 50
                && salary >= 28000 && salary <= 32000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 37 до 50
Salary: от 28000 руб до 32000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 11 лет*/
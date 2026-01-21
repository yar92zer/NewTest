package org.example.newtest.Response;

public class Response841 {
    public static boolean test841(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 28 && age <= 39
                && salary >= 36000 && salary <= 41000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Светлана"
Age: от 28 до 39
Salary: от 36000 руб до 41000 руб
Country: "Польша"
Gender: "Женский"
Experience: 7 лет*/
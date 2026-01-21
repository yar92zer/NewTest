package org.example.newtest.Response;

public class Response889 {
    public static boolean test889(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 20 && age <= 21
                && salary >= 46000 && salary <= 47000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Екатерина"
Age: от 20 до 21
Salary: от 46000 руб до 47000 руб
Country: "Франция"
Gender: "Женский"
Experience: 1 год*/
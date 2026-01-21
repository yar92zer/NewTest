package org.example.newtest.Response;

public class Response982 {
    public static boolean test982(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 53 && age <= 56
                && salary >= 22000 && salary <= 31000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Светлана"
Age: от 53 до 56
Salary: от 22000 руб до 31000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 5 лет*/
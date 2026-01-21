package org.example.newtest.Response;

public class Response960 {
    public static boolean test960(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 46 && age <= 50
                && salary >= 33000 && salary <= 50000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Светлана"
Age: от 46 до 50
Salary: от 33000 руб до 50000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 9 лет*/
package org.example.newtest.Response;

public class Response154 {
    public static boolean test154(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 28 && age <= 38
                && salary >= 36000 && salary <= 61000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 28 до 38
Salary: от 36000 руб до 61000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 7 лет*/
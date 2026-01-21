package org.example.newtest.Response;

public class Response627 {
    public static boolean test627(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 39 && age <= 41
                && salary >= 39000 && salary <= 56000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 39 до 41
Salary: от 39000 руб до 56000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 9 лет*/
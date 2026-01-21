package org.example.newtest.Response;

public class Response861 {
    public static boolean test861(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 30 && age <= 31
                && salary >= 26000 && salary <= 37000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Наталья"
Age: от 30 до 31
Salary: от 26000 руб до 37000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 4 года*/
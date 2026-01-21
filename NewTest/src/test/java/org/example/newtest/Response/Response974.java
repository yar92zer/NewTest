package org.example.newtest.Response;

public class Response974 {
    public static boolean test974(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 39 && age <= 51
                && salary >= 44000 && salary <= 45000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Алина"
Age: от 39 до 51
Salary: от 44000 руб до 45000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 3 года*/
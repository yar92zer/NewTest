package org.example.newtest.Response;

public class Response763 {
    public static boolean test763(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 35 && age <= 36
                && salary >= 24000 && salary <= 25000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Оксана"
Age: от 35 до 36
Salary: от 24000 руб до 25000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 14 лет*/
package org.example.newtest.Response;

public class Response953 {
    public static boolean test953(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 40 && age <= 43
                && salary >= 35000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Анна"
Age: от 40 до 43
Salary: от 35000 руб до 36000 руб
Country: "Польша"
Gender: "Женский"
Experience: 12 лет*/
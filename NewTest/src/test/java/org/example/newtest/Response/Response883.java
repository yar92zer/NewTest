package org.example.newtest.Response;

public class Response883 {
    public static boolean test883(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 20 && age <= 27
                && salary >= 49000 && salary <= 50000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Дмитрий"
Age: от 20 до 27
Salary: от 49000 руб до 50000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 3 года*/
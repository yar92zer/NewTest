package org.example.newtest.Response;

public class Response812 {
    public static boolean test812(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 41
                && salary >= 28000 && salary <= 32000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 41
Salary: от 28000 руб до 32000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 7 лет*/
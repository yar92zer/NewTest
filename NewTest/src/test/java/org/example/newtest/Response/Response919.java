package org.example.newtest.Response;

public class Response919 {
    public static boolean test919(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 19 && age <= 25
                && salary >= 58000 && salary <= 59000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Дмитрий"
Age: от 19 до 25
Salary: от 58000 руб до 59000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 3 года*/
package org.example.newtest.Response;

public class Response892 {
    public static boolean test892(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 19 && age <= 20
                && salary >= 51000 && salary <= 64000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Анна"
Age: от 19 до 20
Salary: от 51000 руб до 64000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/
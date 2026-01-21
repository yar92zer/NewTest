package org.example.newtest.Response;

public class Response675 {
    public static boolean test675(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 30 && age <= 50
                && salary >= 50000 && salary <= 51000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Екатерина"
Age: от 30 до 50
Salary: от 50000 руб до 51000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/
package org.example.newtest.Response;

public class Response938 {
    public static boolean test938(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталья")
                && age >= 23 && age <= 33
                && salary >= 45000 && salary <= 49000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Наталья"
Age: от 23 до 33
Salary: от 45000 руб до 49000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/
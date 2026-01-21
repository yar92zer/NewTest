package org.example.newtest.Response;

public class Response766 {
    public static boolean test766(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 20 && age <= 37
                && salary >= 21000 && salary <= 51000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Елизавета"
Age: от 20 до 37
Salary: от 21000 руб до 51000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 2 года*/
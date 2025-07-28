package org.example.newtest.Response;


public class Response391 {
    public static boolean test391(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 22 && age <= 25
                && salary >= 60000 && salary <= 62000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}

/*Name: "Елена"
Age: от 22 до 25
Salary: от 60000 руб до 62000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/
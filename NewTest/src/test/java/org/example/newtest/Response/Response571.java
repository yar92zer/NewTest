package org.example.newtest.Response;

public class Response571 {
    public static boolean test571(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталия")
                && age >= 38 && age <= 46
                && salary >= 31000 && salary <= 33000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 38 до 46
Salary: от 31000 руб до 33000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/
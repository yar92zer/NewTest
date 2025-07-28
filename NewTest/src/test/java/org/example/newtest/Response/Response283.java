package org.example.newtest.Response;

public class Response283 {
    public static boolean test283(String name, int age, int salary, String gender, String country, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 19 && age <= 26
                && salary >= 50000 && salary <= 56000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 19 до 26
Salary: от 50000 руб до 56000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/
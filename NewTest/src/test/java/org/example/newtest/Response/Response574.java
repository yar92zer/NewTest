package org.example.newtest.Response;

public class Response574 {
    public static boolean test574(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 50 && age <= 51
                && salary >= 22000 && salary <= 30000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 50 до 51
Salary: от 22000 руб до 30000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 5 лет*/
package org.example.newtest.Response;

public class Response389 {
    public static boolean test389(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 40 && age <= 45
                && salary >= 21000 && salary <= 33000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 40 до 45
Salary: от 21000 руб до 33000 руб
Country: "Германия"
Gender: "Женский"
Experience: 9 лет*/
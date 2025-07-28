package org.example.newtest.Response;

public class Response417 {
    public static boolean test417(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 34 && age <= 37
                && salary >= 38000 && salary <= 41000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 34 до 37
Salary: от 38000 руб до 41000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 8 лет*/
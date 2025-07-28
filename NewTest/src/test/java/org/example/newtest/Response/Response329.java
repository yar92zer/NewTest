package org.example.newtest.Response;

public class Response329 {
    public static boolean test329(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 21 && age <= 23
                && salary >= 21 && salary <= 23
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 21 до 23
Salary: от 38000 руб до 46000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 4 года*/
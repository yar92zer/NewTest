package org.example.newtest.Response;

public class Response467 {
    public static boolean test467(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 19 && age <= 24
                && salary >= 29000 && salary <= 31000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }

}
/*Name: "Виктория"
Age: от 19 до 24
Salary: от 29000 руб до 31000 руб
Country: "Германия"
Gender: "Женский"
Experience: 4 года*/
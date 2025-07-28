package org.example.newtest.Response;

public class Response124 {
    public static boolean test124(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 27 && age <= 45
                && salary >= 21000 && salary <= 33000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 27 до 45
Salary: от 21000 руб до 33000 руб
Country: "Германия"
Gender: "Женский"
Experience: 1 год*/
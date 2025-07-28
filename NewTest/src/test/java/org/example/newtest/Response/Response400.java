package org.example.newtest.Response;

public class Response400 {
    public static boolean test400(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age>= 33 && age<= 59
                && salary >= 23000 && salary <= 38000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 33 до 59
Salary: от 23000 руб до 38000 руб
Country: "Германия"
Gender: "Женский"
Experience: 12 лет*/
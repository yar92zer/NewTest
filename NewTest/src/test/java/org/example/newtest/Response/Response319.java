package org.example.newtest.Response;

public class Response319 {
    public static boolean test319(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 21 && age <= 33
                && salary >= 59000 && salary <= 68000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 21 до 33
Salary: от 59000 руб до 68000 руб
Country: "Германия"
Gender: "Женский"
Experience: 11 лет*/
package org.example.newtest.Response;

public class Response517 {
    public static boolean test517(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталия")
                && age >= 18 && age <= 34
                && salary >= 54000 && salary <= 56000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 18 до 34
Salary: от 54000 руб до 56000 руб
Country: "Германия"
Gender: "Женский"
Experience: 2 года*/
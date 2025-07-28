package org.example.newtest.Response;

public class Response134 {
    public static boolean test134(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 18 && age <= 29
                && salary >= 18 && salary <= 29
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 18 до 29
Salary: от 29000 руб до 30000 руб
Country: "Германия"
Gender: "Женский"
Experience: 2 года*/
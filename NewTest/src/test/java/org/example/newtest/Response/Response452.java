package org.example.newtest.Response;

public class Response452 {
    public static boolean test452(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 33 && age <= 34
                && salary >= 40000 && salary <= 41000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 33 до 34
Salary: от 40000 руб до 41000 руб
Country: "Германия"
Gender: "Женский"
Experience: 13 лет*/
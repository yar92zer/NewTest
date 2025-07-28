package org.example.newtest.Response;

public class Response436 {
    public static boolean test436(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 44 && age <= 47
                && salary >= 30000 && salary <= 32000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 44 до 47
Salary: от 30000 руб до 32000 руб
Country: "Германия"
Gender: "Женский"
Experience: 5 лет*/
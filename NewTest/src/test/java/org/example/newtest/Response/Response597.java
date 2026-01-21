package org.example.newtest.Response;

public class Response597 {
    public static boolean test597(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 26 && age <= 46
                && salary >= 33000 && salary <= 37000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 26 до 46
Salary: от 33000 руб до 37000 руб
Country: "Германия"
Gender: "Женский"
Experience: 13 лет*/
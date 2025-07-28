package org.example.newtest.Response;

public class Response535 {
    public static boolean test535(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 21 && age <= 34
                && salary >= 41000 && salary <= 46000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 21 до 34
Salary: от 41000 руб до 46000 руб
Country: "Франция"
Gender: "Женский"
Experience: 7 лет*/
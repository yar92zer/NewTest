package org.example.newtest.Response;

public class Response499 {
    public static boolean test499(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 32 && age <= 33
                && salary >= 37000 && salary <= 40000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 32 до 33
Salary: от 37000 руб до 40000 руб
Country: "Польша"
Gender: "Женский"
Experience: 9 лет*/
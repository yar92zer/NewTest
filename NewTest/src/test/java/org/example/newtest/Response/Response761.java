package org.example.newtest.Response;

public class Response761 {
    public static boolean test761(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 57 && age <= 58
                && salary >= 30000 && salary <= 31000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Оксана"
Age: от 57 до 58
Salary: от 30000 руб до 31000 руб
Country: "Италия"
Gender: "Женский"
Experience: 4 года*/
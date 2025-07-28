package org.example.newtest.Response;

public class Response465 {
    public static boolean test465(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 50 && age <= 58
                && salary >= 35000 && salary <= 66000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 50 до 58
Salary: от 35000 руб до 66000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 13 лет*/
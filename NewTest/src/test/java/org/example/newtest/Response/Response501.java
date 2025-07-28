package org.example.newtest.Response;

public class Response501 {
    public static boolean test501(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 36 && age <= 38
                && salary >= 28000 && salary <= 47000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 36 до 38
Salary: от 28000 руб до 47000 руб
Country: "Италия"
Gender: "Женский"
Experience: 12 лет*/
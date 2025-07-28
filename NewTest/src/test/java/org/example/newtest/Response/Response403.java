package org.example.newtest.Response;

public class Response403 {
    public static boolean test403(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 23 && age <= 26
                && salary >= 21000 && salary <= 26000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return true;
    }
}
/*Name: "Елена"
Age: от 23 до 26
Salary: от 21000 руб до 26000 руб
Country: "Франция"
Gender: "Женский"
Experience: 4 года*/
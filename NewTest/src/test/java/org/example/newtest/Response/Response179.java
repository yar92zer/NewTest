package org.example.newtest.Response;

public class Response179 {
    public static boolean test179(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 22 && age <= 26
                && salary >= 32000 && salary <= 46000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 22 до 26
Salary: от 32000 руб до 46000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 4 года*/
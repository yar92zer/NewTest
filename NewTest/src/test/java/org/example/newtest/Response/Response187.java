package org.example.newtest.Response;

public class Response187 {
    public static boolean test187(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 24 && age <= 25
                && salary >= 31000 && salary <= 39000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 24 до 25
Salary: от 31000 руб до 39000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 4 года*/
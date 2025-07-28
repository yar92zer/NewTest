package org.example.newtest.Response;

public class Response328 {
    public static boolean test328(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 20 && age <= 26
                && salary >= 39000 && salary <= 50000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 20 до 26
Salary: от 39000 руб до 50000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 2 года*/
package org.example.newtest.Response;

public class Response168 {
    public static boolean test168(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 21 && age <= 27
                && salary >= 24000 && salary <= 29000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 21 до 27
Salary: от 24000 руб до 29000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 4 года*/
package org.example.newtest.Response;

public class Response162 {
    public static boolean test162(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 43 && age <= 52
                && salary >= 47000 && salary <= 53000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 43 до 52
Salary: от 47000 руб до 53000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 4 года*/
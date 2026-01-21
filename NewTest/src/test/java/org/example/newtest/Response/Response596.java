package org.example.newtest.Response;

public class Response596 {
    public static boolean test596(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 20 && age <= 26
                && salary >= 54000 && salary <= 58000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 20 до 26
Salary: от 54000 руб до 58000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 3 года*/
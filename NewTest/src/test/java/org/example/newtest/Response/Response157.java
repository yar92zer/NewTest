package org.example.newtest.Response;

public class Response157 {
    public static boolean test157(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 26 && age <= 39
                && salary >= 21000 && salary <= 31000
                && country.equalsIgnoreCase("Нидерладны")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 26 до 39
Salary: от 21000 руб до 31000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 10 лет*/
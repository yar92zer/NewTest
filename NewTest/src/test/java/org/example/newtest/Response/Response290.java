package org.example.newtest.Response;

public class Response290 {
    public static boolean test290(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 34000 && age <= 54000
                && salary >= 34000 && salary <= 54000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 31 до 33
Salary: от 34000 руб до 54000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 5 лет*/
package org.example.newtest.Response;

public class Response315 {
    public static boolean test315(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 40 && age <= 46
                && salary >= 26000 && salary <= 31000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 40 до 46
Salary: от 26000 руб до 31000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 1 год*/
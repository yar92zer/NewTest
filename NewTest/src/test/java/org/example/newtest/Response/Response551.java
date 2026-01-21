package org.example.newtest.Response;

public class Response551 {
    public static boolean test551(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 23 && age <= 26
                && salary >= 52000 && salary <= 59000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 23 до 26
Salary: от 52000 руб до 59000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 5 лет*/
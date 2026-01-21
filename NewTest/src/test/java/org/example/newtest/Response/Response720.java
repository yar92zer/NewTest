package org.example.newtest.Response;

public class Response720 {
    public static boolean test720(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 26 && age <= 30
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Николай"
Age: от 26 до 30
Salary: от 26000 руб до 27000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/
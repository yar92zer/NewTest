package org.example.newtest.Response;

public class Response440 {
    public static boolean test440(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 20 && age <= 32
                && salary >= 28000 && salary <= 44000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 20 до 32
Salary: от 28000 руб до 44000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 7 лет*/
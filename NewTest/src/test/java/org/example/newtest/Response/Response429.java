package org.example.newtest.Response;

public class Response429 {
    public static boolean test429(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 19 && age <= 38
                && salary >= 36000 && salary <= 52000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 19 до 38
Salary: от 36000 руб до 52000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 4 года*/
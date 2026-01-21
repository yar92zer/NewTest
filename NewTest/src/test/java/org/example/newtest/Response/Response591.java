package org.example.newtest.Response;

public class Response591 {
    public static boolean test591(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 45 && age <= 50
                && salary >= 27000 && salary <= 30000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 45 до 50
Salary: от 27000 руб до 30000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 2 года*/
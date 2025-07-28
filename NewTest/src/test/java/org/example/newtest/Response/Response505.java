package org.example.newtest.Response;

public class Response505 {
    public static boolean test505(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 20 && age <= 27
                && salary >= 22000 && salary <= 36000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 20 до 27
Salary: от 22000 руб до 36000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 2 года*/
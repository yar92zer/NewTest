package org.example.newtest.Response;

public class Response205 {
    public static boolean test205(String name, int age, int salary, String gender, String country, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 24 && age <= 26
                && salary >= 34000 && salary <= 51000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 24 до 26
Salary: от 34000 руб до 51000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 1 год*/
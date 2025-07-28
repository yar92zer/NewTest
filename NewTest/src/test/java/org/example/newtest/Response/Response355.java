package org.example.newtest.Response;

public class Response355 {
    public static boolean test355(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 23 && age <= 49
                && salary >= 27000 && salary <= 30000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 23 до 49
Salary: от 27000 руб до 30000 руб
Country: "Польша"
Gender: "Женский"
Experience: 4 года*/
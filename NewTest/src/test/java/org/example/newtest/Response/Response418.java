package org.example.newtest.Response;

public class Response418 {
    public static boolean test418(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 32 && age <= 36
                && salary >= 64000 && salary <= 65000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 32 до 36
Salary: от 64000 руб до 65000 руб
Country: "Польша"
Gender: "Женский"
Experience: 5 лет*/
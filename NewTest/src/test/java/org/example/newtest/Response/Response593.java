package org.example.newtest.Response;

public class Response593 {
    public static boolean test593(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 38 && age <= 44
                && salary >= 22000 && salary <= 28000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 38 до 44
Salary: от 22000 руб до 28000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 1 год*/
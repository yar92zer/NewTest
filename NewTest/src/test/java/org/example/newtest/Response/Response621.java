package org.example.newtest.Response;

public class Response621 {
    public static boolean test621(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 25 && age <= 27
                && salary >= 25000 && salary <= 28000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 25 до 27
Salary: от 25000 руб до 28000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 3 года*/
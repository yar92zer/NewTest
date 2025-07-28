package org.example.newtest.Response;

public class Response309 {
    public static boolean test309(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 36 && age <= 39
                && salary >= 40000 && salary <= 42000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 36 до 39
Salary: от 40000 руб до 42000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 2 года*/
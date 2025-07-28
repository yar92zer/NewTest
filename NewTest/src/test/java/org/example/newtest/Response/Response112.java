package org.example.newtest.Response;

public class Response112 {
    public static boolean test112(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 26 && age <= 39
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 26 до 39
Salary: от 27000 руб до 28000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/
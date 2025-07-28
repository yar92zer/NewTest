package org.example.newtest.Response;

public class Response89 {
    public static boolean test89(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 32 && age <= 43
                && salary >= 44000 && salary <= 45000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 32 до 43
Salary: от 44000 руб до 45000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 6 лет*/
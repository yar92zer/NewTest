package org.example.newtest.Response;

public class Response428 {
    public static boolean test428(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 50 && age <= 52
                && salary >= 25000 && salary <= 42000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 50 до 52
Salary: от 25000 руб до 42000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 13 лет*/
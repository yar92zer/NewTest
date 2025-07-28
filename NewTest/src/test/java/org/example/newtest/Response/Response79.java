package org.example.newtest.Response;

public class Response79 {
    public static boolean test79(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 20 && age <= 54
                && salary >= 32000 && salary <= 43000
                && country.equalsIgnoreCase("Автстрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 20 до 54
Salary: от 32000 руб до 43000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 11 лет*/
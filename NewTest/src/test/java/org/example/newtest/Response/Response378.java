package org.example.newtest.Response;

public class Response378 {
    public static boolean test378(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 26 && age <= 51
                && salary >= 41000 && salary <= 45000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 26 до 51
Salary: от 41000 руб до 45000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 7 лет*/
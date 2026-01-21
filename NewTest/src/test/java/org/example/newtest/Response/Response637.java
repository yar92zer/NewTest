package org.example.newtest.Response;

public class Response637 {
    public static boolean test637(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 48 && age <= 50
                && salary >= 33000 && salary <= 35000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 48 до 50
Salary: от 33000 руб до 35000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 6 лет*/
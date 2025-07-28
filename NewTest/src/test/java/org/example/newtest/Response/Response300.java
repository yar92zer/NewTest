package org.example.newtest.Response;

public class Response300 {
    public static boolean test300(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 33 && age <= 54
                && salary >= 26000 && salary <= 28000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 33 до 54
Salary: от 26000 руб до 28000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 7 лет*/
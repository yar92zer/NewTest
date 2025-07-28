package org.example.newtest.Response;

public class Response203 {
    public static boolean test203(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 37 && age <= 49
                && salary >= 27000 && salary <= 31000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 37 до 49
Salary: от 27000 руб до 31000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 6 лет*/
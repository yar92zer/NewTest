package org.example.newtest.Response;

public class Response366 {
    public static boolean test366(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 37 && age <= 38
                && salary >= 23000 && salary <= 26000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 37 до 38
Salary: от 23000 руб до 26000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 9 лет*/
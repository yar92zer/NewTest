package org.example.newtest.Response;

public class Response100 {
    public static boolean test100(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 20 && age <= 27
                && salary >= 52000 && salary <= 53000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 20 до 27
Salary: от 52000 руб до 53000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 7 лет*/
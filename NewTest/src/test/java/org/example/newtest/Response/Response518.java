package org.example.newtest.Response;

public class Response518 {
    public static boolean test518(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 29
                && salary >= 21000 && salary <= 24000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 29
Salary: от 21000 руб до 24000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 2 года*/
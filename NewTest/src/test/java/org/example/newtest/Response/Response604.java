package org.example.newtest.Response;

public class Response604 {
    public static boolean test604(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 19 && age <= 26
                && salary >= 29000 && salary <= 60000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 19 до 26
Salary: от 29000 руб до 60000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 4 года*/
package org.example.newtest.Response;

public class Response468 {
    public static boolean test468(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 21 && age <= 26
                && salary >= 34000 && salary <= 41000
                && country.equalsIgnoreCase("Бельгия")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 21 до 26
Salary: от 34000 руб до 41000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 6 лет*/
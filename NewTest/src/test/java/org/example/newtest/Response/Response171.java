package org.example.newtest.Response;

public class Response171 {
    public static boolean test171(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 20 && age <= 26
                && salary >= 31000 && salary <= 34000
                && country.equalsIgnoreCase("Австрия")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 20 до 26
Salary: от 31000 руб до 34000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 8 лет*/
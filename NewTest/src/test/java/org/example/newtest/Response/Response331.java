package org.example.newtest.Response;

public class Response331 {
    public static boolean test331(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 33 && age <= 36
                && salary >= 44000 && salary <= 48000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 33 до 36
Salary: от 44000 руб до 48000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 10 лет*/
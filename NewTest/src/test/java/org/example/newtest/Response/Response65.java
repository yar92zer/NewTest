package org.example.newtest.Response;

public class Response65 {
    public static boolean test65(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 37 && age <= 40
                && salary >= 26000 && salary <= 26000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 37 до 40
Salary: от 26000 руб до 26000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 12 лет*/
package org.example.newtest.Response;

public class Response163 {
    public static boolean test163(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 19 && age <= 40
                && salary >= 37000 && salary <= 41000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 19 до 40
Salary: от 37000 руб до 41000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 11 лет*/
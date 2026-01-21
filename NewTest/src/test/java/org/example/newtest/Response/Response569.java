package org.example.newtest.Response;

public class Response569 {
    public static boolean test569(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 39 && age <= 53
                && salary >= 31000 && salary <= 52000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 39 до 53
Salary: от 31000 руб до 52000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 1 год*/
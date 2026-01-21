package org.example.newtest.Response;

public class Response922 {
    public static boolean test922(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 21 && age <= 25
                && salary >= 41000 && salary <= 50000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Максим"
Age: от 21 до 25
Salary: от 41000 руб до 50000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 4 года*/
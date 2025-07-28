package org.example.newtest.Response;

public class Response451 {
    public static boolean test451(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 47 && age <= 49
                && salary >= 35000 && salary <= 51000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 47 до 49
Salary: от 35000 руб до 51000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 15 лет*/
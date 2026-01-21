package org.example.newtest.Response;

public class Response634 {
    public static boolean test634(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 21 && age <= 41
                && salary >= 35000 && salary <= 37000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 21 до 41
Salary: от 35000 руб до 37000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 12 лет*/
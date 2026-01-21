package org.example.newtest.Response;

public class Response575 {
    public static boolean test575(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юля")
                && age >= 24 && age <= 25
                && salary >= 30000 && salary <= 38000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 24 до 25
Salary: от 30000 руб до 38000 руб
Country: "Испания"
Gender: "Женский"
Experience: 5 лет*/
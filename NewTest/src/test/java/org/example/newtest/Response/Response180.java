package org.example.newtest.Response;

public class Response180 {
    public static boolean test180(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 25 && age <= 48
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 25 до 48
Salary: от 27000 руб до 29000 руб
Country: "Испания"
Gender: "Женский"
Experience: 10 лет*/
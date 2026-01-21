package org.example.newtest.Response;

public class Response626 {
    public static boolean test626(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 26 && age <= 52
                && salary >= 39000 && salary <= 42000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 26 до 52
Salary: от 39000 руб до 42000 руб
Country: "Испания"
Gender: "Женский"
Experience: 9 лет*/
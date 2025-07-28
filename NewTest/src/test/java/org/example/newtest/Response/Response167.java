package org.example.newtest.Response;

public class Response167 {
    public static boolean test167(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 23 && age <= 40
                && salary >= 26000 && salary <= 43000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Испания")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 23 до 40
Salary: от 26000 руб до 43000 руб
Country: "Испания"
Gender: "Женский"
Experience: 10 лет*/
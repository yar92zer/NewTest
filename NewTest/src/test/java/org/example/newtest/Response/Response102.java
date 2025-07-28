package org.example.newtest.Response;

public class Response102 {
    public static boolean test102(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 18 && age <= 34
                && salary >= 26000 && salary <= 34000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 18 до 34
Salary: от 26000 руб до 34000 руб
Country: "Испания"
Gender: "Женский"
Experience: 1 год*/
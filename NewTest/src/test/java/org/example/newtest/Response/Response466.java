package org.example.newtest.Response;

public class Response466 {
    public static boolean test466(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 44 && age <= 47
                && salary >= 36000 && salary <= 38000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 44 до 47
Salary: от 36000 руб до 38000 руб
Country: "Испания"
Gender: "Женский"
Experience: 3 года*/
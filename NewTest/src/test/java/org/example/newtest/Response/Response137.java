package org.example.newtest.Response;

public class Response137 {
    public static boolean test137(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Анна")
                && age >= 20 && age <= 39
                && salary >= 30000 && salary <= 32000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Анна"
Age: от 20 до 39
Salary: от 30000 руб до 32000 руб
Country: "Испания"
Gender: "Женский"
Experience: 5 лет*/
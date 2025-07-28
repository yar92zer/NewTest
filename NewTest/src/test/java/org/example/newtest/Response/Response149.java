package org.example.newtest.Response;

public class Response149 {
    public static boolean test149(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 32 && age <= 33
                && salary >= 28000 && salary <= 45000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужсокй")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 32 до 33
Salary: от 28000 руб до 45000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 12 лет*/
package org.example.newtest.Response;

public class Response397 {
    public static boolean test397(String name, int age, int salary, String country, String gender, int experienc) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 18 && age <= 33
                && salary >= 47000 && salary <= 58000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experienc == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 18 до 33
Salary: от 47000 руб до 58000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 6 лет*/
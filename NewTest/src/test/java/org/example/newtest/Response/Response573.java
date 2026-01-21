package org.example.newtest.Response;

public class Response573 {
    public static boolean test573(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 40 && age <= 46
                && salary >= 32000 && salary <= 34000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 40 до 46
Salary: от 32000 руб до 34000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 3 года*/
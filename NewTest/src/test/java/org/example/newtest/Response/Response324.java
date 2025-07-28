package org.example.newtest.Response;

public class Response324 {
    public static boolean test324(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 22 && age <= 44
                && salary >= 33000 && salary <= 54000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 22 до 44
Salary: от 33000 руб до 54000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 5 лет*/
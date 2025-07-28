package org.example.newtest.Response;

public class Response186 {
    public static boolean test186(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 21 && age <= 25
                && salary >= 23000 && salary <= 54000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 21 до 25
Salary: от 23000 руб до 54000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 3 года*/
package org.example.newtest.Response;

public class Response158 {
    public static boolean test158(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 18 && age <= 20
                && salary >= 18 && salary <= 20
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 18 до 20
Salary: от 44000 руб до 49000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 2 года*/
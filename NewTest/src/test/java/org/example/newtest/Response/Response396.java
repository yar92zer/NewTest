package org.example.newtest.Response;

public class Response396 {
    public static boolean test396(String name, int age, int salary, String country, String gender,int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 43 && age <= 44
                && salary >= 23000 && salary <= 61000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 43 до 44
Salary: от 23000 руб до 61000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 2 года*/
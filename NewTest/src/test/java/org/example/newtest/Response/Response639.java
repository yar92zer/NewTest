package org.example.newtest.Response;

public class Response639 {
    public static boolean test639(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 46 && age <= 51
                && salary >= 26000 && salary <= 45000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 46 до 51
Salary: от 26000 руб до 45000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 3 года*/
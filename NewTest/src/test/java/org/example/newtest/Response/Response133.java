package org.example.newtest.Response;

public class Response133 {
    public static boolean test133(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 30 && age <= 31
                && salary >= 21000 && salary <= 28000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 30 до 31
Salary: от 21000 руб до 28000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 4 года*/
package org.example.newtest.Response;

public class Response442 {
    public static boolean test442(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 36 && age <= 37
                && salary >= 26000 && salary <= 30000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 36 до 37
Salary: от 26000 руб до 30000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 5 лет*/
package org.example.newtest.Response;

public class Response330 {
    public static boolean test330(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 23 && age <= 26
                && salary >= 34000 && salary <= 46000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 23 до 26
Salary: от 34000 руб до 46000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 6 лет*/
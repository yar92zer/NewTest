package org.example.newtest.Response;

public class Response618 {
    public static boolean test618(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 18 && age <= 25
                && salary >= 18 && salary <= 25
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 18 до 25
Salary: от 34000 руб до 35000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 4 года*/
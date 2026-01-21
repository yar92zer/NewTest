package org.example.newtest.Response;

public class Response640 {
    public static boolean test640(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 34 && age <= 38
                && salary >= 33000 && salary <= 44000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 34 до 38
Salary: от 33000 руб до 44000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 9 лет*/
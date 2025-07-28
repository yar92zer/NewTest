package org.example.newtest.Response;

public class Response54 {
    public static boolean test54(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 27 && age <=37
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 27 до 37
Salary: от 27000 руб до 28000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 2 года*/
package org.example.newtest.Response;

public class Response83 {
    public static boolean test83(String name, int age, int salary, String country, String gender, int experinence) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 20 && age <= 37
                && salary >= 25000 && salary <= 27000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experinence == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 20 до 37
Salary: от 25000 руб до 27000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 11 лет*/
package org.example.newtest.Response;

public class Response806 {
    public static boolean test806(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 53 && age <= 58
                && salary >= 52000 && salary <= 54000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Дмитрий"
Age: от 53 до 58
Salary: от 52000 руб до 54000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 8 лет*/
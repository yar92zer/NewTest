package org.example.newtest.Response;

public class Response917 {
    public static boolean test917(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 31 && age <= 32
                && salary >= 54000 && salary <= 56000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Николай"
Age: от 31 до 32
Salary: от 54000 руб до 56000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 3 года*/
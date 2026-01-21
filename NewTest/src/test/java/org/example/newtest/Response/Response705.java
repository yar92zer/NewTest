package org.example.newtest.Response;

public class Response705 {
    public static boolean test705(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 58 && age <= 59
                && salary >= 53000 && salary <= 54000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Юлия"
Age: от 58 до 59
Salary: от 53000 руб до 54000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 4 года*/
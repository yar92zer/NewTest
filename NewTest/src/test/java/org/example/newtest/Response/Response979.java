package org.example.newtest.Response;

public class Response979 {
    public static boolean test979(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 48 && age <= 49
                && salary >= 42000 && salary <= 45000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Светлана"
Age: от 48 до 49
Salary: от 42000 руб до 45000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 9 лет*/
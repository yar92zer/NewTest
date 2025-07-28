package org.example.newtest.Response;

public class Response170 {
    public static boolean test170(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 20 && age <= 31
                && salary >= 30000 && salary <= 34000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 20 до 31
Salary: от 30000 руб до 34000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 8 лет*/
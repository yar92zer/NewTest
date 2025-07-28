package org.example.newtest.Response;

public class Response401 {
    public static boolean test401(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 35 && age <= 37
                && salary >= 54000 && salary <= 55000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 35 до 37
Salary: от 54000 руб до 55000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 4 года*/
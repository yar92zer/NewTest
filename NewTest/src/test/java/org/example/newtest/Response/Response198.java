package org.example.newtest.Response;

public class Response198 {
    public static boolean test198(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 31 && age <= 57
                && salary >= 54000 && salary <= 57000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женская")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 31 до 57
Salary: от 54000 руб до 57000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 9 лет*/
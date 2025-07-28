package org.example.newtest.Response;

public class Response318 {
    public static boolean test318(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 22 && age <= 25
                && salary >= 23000 && salary <= 26000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 22 до 25
Salary: от 23000 руб до 26000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 7 лет*/
package org.example.newtest.Response;

public class Response172 {
    public static boolean test172(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 25 && age <= 42
                && salary >= 26000 && salary <= 42000
                && country.equalsIgnoreCase("Чехия")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 25 до 42
Salary: от 26000 руб до 42000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 10 лет*/
package org.example.newtest.Response;

public class Response103 {
    public static boolean test103(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Каталья")
                && age >= 30 && age <= 44
                && salary >= 23000 && salary <= 46000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 30 до 44
Salary: от 23000 руб до 46000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 14 лет*/
package org.example.newtest.Response;

public class Response586 {
    public static boolean test586(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 32 && age <= 35
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 32 до 35
Salary: от 26000 руб до 27000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 5 лет*/
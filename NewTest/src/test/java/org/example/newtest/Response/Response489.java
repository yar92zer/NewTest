package org.example.newtest.Response;

public class Response489 {
    public static boolean test489(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 25 && age <= 29
                && salary >= 21000 && salary <= 26000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 25 до 29
Salary: от 21000 руб до 26000 руб
Country: "Германия"
Gender: "Женский"
Experience: 5 лет*/
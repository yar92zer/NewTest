package org.example.newtest.Response;

public class Response409 {
    public static boolean test409(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 32 && age <= 37
                && salary >= 45000 && salary <= 49000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 32 до 37
Salary: от 45000 руб до 49000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 13 лет*/
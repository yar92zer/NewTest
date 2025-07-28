package org.example.newtest.Response;

public class Response343 {
    public static boolean test343(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 32 && age <= 35
                && salary >= 30000 && salary <= 35000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 32 до 35
Salary: от 30000 руб до 35000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 10 лет*/
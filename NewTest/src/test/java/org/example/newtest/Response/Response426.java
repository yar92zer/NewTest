package org.example.newtest.Response;

public class Response426 {
    public static boolean test426(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 46 && age <= 60
                && salary >= 41000 && salary <= 49000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 46 до 60
Salary: от 41000 руб до 49000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 2 года*/
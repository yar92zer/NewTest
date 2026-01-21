package org.example.newtest.Response;

public class Response752 {
    public static boolean test752(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 31 && age <= 43
                && salary >= 32000 && salary <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Александр"
Age: от 31 до 43
Salary: от 32000 руб до 34000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 4 года*/
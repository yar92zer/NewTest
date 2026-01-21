package org.example.newtest.Response;

public class Response986 {
    public static boolean test986(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 44 && age <= 45
                && salary >= 46000 && salary <= 49000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Екатерина"
Age: от 44 до 45
Salary: от 46000 руб до 49000 руб
Country: "Германия"
Gender: "Женский"
Experience: 10 лет*/
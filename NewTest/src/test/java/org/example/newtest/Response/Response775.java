package org.example.newtest.Response;

public class Response775 {
    public static boolean test775(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 31 && age <= 32
                && salary >= 35000 && salary <= 42000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12;
    }
}
/*Name: "Светлана"
Age: от 31 до 32
Salary: от 35000 руб до 42000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 12 лет*/
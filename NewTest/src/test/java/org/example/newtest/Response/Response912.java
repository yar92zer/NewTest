package org.example.newtest.Response;

public class Response912 {
    public static boolean test912(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 55 && age <= 57
                && salary >= 26000 && salary <= 30000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Светлана"
Age: от 55 до 57
Salary: от 26000 руб до 30000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 1 год*/
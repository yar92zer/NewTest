package org.example.newtest.Response;

public class Response968 {
    public static boolean test968(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 26 && age <= 33
                && salary >= 21000 && salary <= 24000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Светлана"
Age: от 26 до 33
Salary: от 21000 руб до 24000 руб
Country: "Германия"
Gender: "Женский"
Experience: 5 лет*/
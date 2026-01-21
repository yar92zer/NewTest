package org.example.newtest.Response;

public class Response949 {
    public static boolean test949(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 61 && age <= 62
                && salary >= 21000 && salary <= 27000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14;
    }
}
/*Name: "Светлана"
Age: от 61 до 62
Salary: от 21000 руб до 27000 руб
Country: "Польша"
Gender: "Женский"
Experience: 14 лет*/
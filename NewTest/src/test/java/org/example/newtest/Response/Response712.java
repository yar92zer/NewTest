package org.example.newtest.Response;

public class Response712 {
    public static boolean test712(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 30 && age <= 33
                && salary >= 23000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8;
    }
}
/*Name: "Оксана"
Age: от 30 до 33
Salary: от 23000 руб до 36000 руб
Country: "Польша"
Gender: "Женский"
Experience: 8 лет*/
package org.example.newtest.Response;

public class Response302 {
    public static boolean test302(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 46 && age <= 49
                && salary >= 34000 && salary <= 40000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 46 до 49
Salary: от 34000 руб до 40000 руб
Country: "Польша"
Gender: "Женский"
Experience: 14 лет*/
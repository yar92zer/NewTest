package org.example.newtest.Response;

public class Response805 {
    public static boolean test805(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлан")
                && age >= 23 && age <= 24
                && salary >= 33000 && salary <= 38000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Светлана"
Age: от 23 до 24
Salary: от 33000 руб до 38000 руб
Country: "Испания"
Gender: "Женский"
Experience: 2 года*/
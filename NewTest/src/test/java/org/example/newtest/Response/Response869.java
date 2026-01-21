package org.example.newtest.Response;

public class Response869 {
    public static boolean test869(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 26 && age <= 28
                && salary >= 20000 && salary <= 54000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Алина"
Age: от 26 до 28
Salary: от 20000 руб до 54000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 4 года*/
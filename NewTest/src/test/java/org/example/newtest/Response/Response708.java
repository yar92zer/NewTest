package org.example.newtest.Response;

public class Response708 {
    public static boolean test708(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 27 && age <= 28
                && salary >= 54000 && salary <= 60000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Оксана"
Age: от 27 до 28
Salary: от 54000 руб до 60000 руб
Country: "Германия"
Gender: "Женский"
Experience: 3 года*/
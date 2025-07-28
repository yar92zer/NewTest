package org.example.newtest.Response;

public class Response348 {
    public static boolean test348(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 18 && age <= 22
                && salary >= 21000 && salary <= 40000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 18 до 22
Salary: от 21000 руб до 40000 руб
Country: "Германия"
Gender: "Женский"
Experience: 4 года*/
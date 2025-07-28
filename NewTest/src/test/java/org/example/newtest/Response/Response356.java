package org.example.newtest.Response;

public class Response356 {
    public static boolean test356(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 26 && age <= 28
                && salary >= 51000 && salary <= 57000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 26 до 28
Salary: от 51000 руб до 57000 руб
Country: "Италия"
Gender: "Женский"
Experience: 4 года*/
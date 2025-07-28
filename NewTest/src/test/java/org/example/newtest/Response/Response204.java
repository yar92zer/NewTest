package org.example.newtest.Response;

public class Response204 {
    public static boolean test204(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Австрия")
                && age >= 20 && age <= 27
                && salary >= 26000 && salary <= 30000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 20 до 27
Salary: от 26000 руб до 30000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/
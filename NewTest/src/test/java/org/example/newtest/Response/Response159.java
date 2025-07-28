package org.example.newtest.Response;

public class Response159 {
    public static boolean test159(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 19 && age <= 35
                && salary >= 21000 && salary <= 58000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 19 до 35
Salary: от 21000 руб до 58000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 3 года*/
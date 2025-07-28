package org.example.newtest.Response;

public class Response126 {
    public static boolean test126(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 21 && age <= 46
                && salary >= 25000 && salary <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }

}
/*Name: "Андрей"
Age: от 21 до 46
Salary: от 25000 руб до 34000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 8 лет*/
package org.example.newtest.Response;

public class Response147 {
    public static boolean test147(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 36 && age <= 37
                && salary >= 25000 && salary <= 30000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 36 до 37
Salary: от 25000 руб до 30000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 4 года*/
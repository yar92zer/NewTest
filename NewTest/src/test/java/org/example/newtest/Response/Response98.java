package org.example.newtest.Response;

public class Response98 {
    public static boolean test98(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 32 && age <= 54
                && salary >= 20000 && salary <= 32000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 32 до 54
Salary: от 20000 руб до 32000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 9 лет*/
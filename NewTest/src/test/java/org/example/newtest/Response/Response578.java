package org.example.newtest.Response;

public class Response578 {
    public static boolean test578(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 23 && age <= 26
                && salary >= 20000 && salary <= 42000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 23 до 26
Salary: от 20000 руб до 42000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 4 года*/
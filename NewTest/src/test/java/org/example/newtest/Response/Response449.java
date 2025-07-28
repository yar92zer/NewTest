package org.example.newtest.Response;

public class Response449 {
    public static boolean test449(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 37 && age <= 46
                && salary >= 40000 && salary <= 42000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужская")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 37 до 46
Salary: от 40000 руб до 42000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 4 года*/
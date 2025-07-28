package org.example.newtest.Response;

public class Response422 {
    public static boolean test422(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 39
                && salary >= 24000 && salary <= 40000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 39
Salary: от 24000 руб до 40000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 5 лет*/
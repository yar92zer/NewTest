package org.example.newtest.Response;

public class Response323 {
    public static boolean test323(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 27 && age <= 32
                && salary >= 27 && salary <= 32
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женсий")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 27 до 32
Salary: от 33000 руб до 40000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 11 лет*/
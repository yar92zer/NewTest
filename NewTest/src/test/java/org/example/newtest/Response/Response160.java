package org.example.newtest.Response;

public class Response160 {
    public static boolean test160(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 46 && age <= 57
                && salary >= 31000 && salary <= 37000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 46 до 57
Salary: от 31000 руб до 37000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 13 лет*/
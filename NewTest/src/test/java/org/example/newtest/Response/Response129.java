package org.example.newtest.Response;

public class Response129 {
    public static boolean test129(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 41 && age <= 45
                && salary >= 26000 && salary <= 28000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 41 до 45
Salary: от 26000 руб до 28000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 8 лет*/
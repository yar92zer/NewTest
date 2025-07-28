package org.example.newtest.Response;

public class Response515 {
    public static boolean test515(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 29 && age <= 31
                && salary >= 59000 && salary <= 68000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 29 до 31
Salary: от 59000 руб до 68000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 4 года*/
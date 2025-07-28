package org.example.newtest.Response;

public class Response470 {
    public static boolean test470(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 48 && age <= 60
                && salary >= 47000 && salary <= 48000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }

}
/*Name: "Елена"
Age: от 48 до 60
Salary: от 47000 руб до 48000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 12 лет*/
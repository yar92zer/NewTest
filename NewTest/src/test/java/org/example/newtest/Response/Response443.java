package org.example.newtest.Response;

public class Response443 {
    public boolean test443(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 34 && age <= 36
                && salary >= 63000 && salary <= 67000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 34 до 36
Salary: от 63000 руб до 67000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 5 лет*/
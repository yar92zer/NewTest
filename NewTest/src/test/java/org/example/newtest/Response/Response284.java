package org.example.newtest.Response;

public class Response284 {
    public static boolean test284(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 21 && age <= 36
                && salary >= 21000 && salary <= 24000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 21 до 36
Salary: от 21000 руб до 24000 руб
Country: "Польша"
Gender: "Женский"
Experience: 7 лет*/
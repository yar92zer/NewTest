package org.example.newtest.Response;

public class Response69 {
    public static boolean test69(String name, int age, int salary, String country, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 41 && age <= 57
                && salary >= 35000 && salary <= 46000
                && country.equalsIgnoreCase("Польща")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 41 до 57
Salary: от 35000 руб до 46000 руб
Country: "Польша"
Gender: "Женский"
Experience: 12 лет*/
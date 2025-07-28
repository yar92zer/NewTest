package org.example.newtest.Response;

public class Response191 {
    public static boolean test191(String name, int age, int salary, String country, String gender, int experiene) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 18 && age <= 25
                && salary >= 35000 && salary <= 39000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experiene == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 18 до 25
Salary: от 35000 руб до 39000 руб
Country: "Польша"
Gender: "Женский"
Experience: 1 год*/
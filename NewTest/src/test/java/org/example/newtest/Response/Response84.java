package org.example.newtest.Response;

public class Response84 {
    public static boolean test84(String name, int age, int salary, String country, String gender, int experinence) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 20 && age <= 22
                && salary >= 33000 && salary <= 34000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experinence == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 20 до 22
Salary: от 33000 руб до 34000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 3 года*/
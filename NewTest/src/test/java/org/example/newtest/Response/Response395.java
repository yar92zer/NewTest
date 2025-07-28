package org.example.newtest.Response;

public class Response395 {
    public static boolean test395(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юля")
                && age >= 18 && age <= 44
                && salary >= 35000 && salary <= 36000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 18 до 44
Salary: от 35000 руб до 36000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 2 года*/
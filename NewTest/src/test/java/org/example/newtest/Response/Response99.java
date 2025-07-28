package org.example.newtest.Response;

public class Response99 {
    public static boolean test99(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юулия")
                && age >= 46 && age <= 56
                && salary>=23000 && salary<=23009
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 46 до 56
Salary: от 23000 руб до 23009 руб
Country: "Польша"
Gender: "Женский"
Experience: 5 лет*/
package org.example.newtest.Response;

public class Response856 {
    public static boolean test856(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Светлана")
                && age >= 32 && age <= 49
                && salary >= 20000 && salary <= 64000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Светлана"
Age: от 32 до 49
Salary: от 20000 руб до 64000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 13 лет*/
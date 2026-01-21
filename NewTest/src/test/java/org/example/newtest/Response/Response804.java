package org.example.newtest.Response;

public class Response804 {
    public static boolean test804(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 49 && age <= 55
                && salary >= 46000 && salary <= 58000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Андрей"
Age: от 49 до 55
Salary: от 46000 руб до 58000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 15 лет*/
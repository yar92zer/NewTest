package org.example.newtest.Response;

public class Response674 {
    public static boolean test674(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 46 && age <= 47
                && salary >= 30000 && salary <= 35000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Иван"
Age: от 46 до 47
Salary: от 30000 руб до 35000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 14 лет*/
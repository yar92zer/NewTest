package org.example.newtest.Response;

public class Response602 {
    public static boolean test602(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 21 && age <= 28
                && salary >= 31000 && salary <= 34000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*ffName: "Михаил"
Age: от 21 до 28
Salary: от 31000 руб до 34000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 3 года*/
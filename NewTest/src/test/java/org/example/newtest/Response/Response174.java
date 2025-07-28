package org.example.newtest.Response;

public class Response174 {
    public static boolean test174(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 34 && age <= 47
                && salary >= 40000 && salary <= 45000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 34 до 47
Salary: от 40000 руб до 45000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 3 года*/
package org.example.newtest.Response;

public class Response383 {
    public static boolean test383(String name, int age,int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age>=29 && age<=34
                && salary >= 33000 && salary <= 39000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужсокй")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 29 до 34
Salary: от 33000 руб до 39000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 12 лет*/
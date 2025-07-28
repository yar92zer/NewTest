package org.example.newtest.Response;

public class Response185 {
    public static boolean test185(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 34000 && age <= 64000
                && salary >= 34000 && salary <= 64000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женскй")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 28 до 50
Salary: от 34000 руб до 64000 руб
Country: "Испания"
Gender: "Женский"
Experience: 2 года*/
package org.example.newtest.Response;

public class Response333 {
    public static boolean test333(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 18 && age <= 25
                && salary >= 26000 && salary <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 18 до 25
Salary: от 26000 руб до 34000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 3 года*/
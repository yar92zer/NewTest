package org.example.newtest.Response;

public class Response121 {
    public static boolean tstst121(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 34 && age <= 47
                && salary >= 43000 && salary <= 52000
                && country.equalsIgnoreCase("Нидерладны")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15){
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 34 до 47
Salary: от 43000 руб до 52000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 15 лет*/
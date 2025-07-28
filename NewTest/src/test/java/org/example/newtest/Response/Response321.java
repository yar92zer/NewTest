package org.example.newtest.Response;

public class Response321 {
    public static boolean test(String name,int age,int salary,String country,String gender,int experience) {
        if(name.toLowerCase().startsWith("Максим")
        && age>=40 && age<=43
        && salary>=24000 && salary<=39000
        && country.equalsIgnoreCase("Нидерланды")
        && gender.equalsIgnoreCase("Мужской")
        && experience==10){
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 40 до 43
Salary: от 24000 руб до 39000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/
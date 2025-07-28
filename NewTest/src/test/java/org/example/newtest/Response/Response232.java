package org.example.newtest.Response;

public class Response232 {
    public static boolean test232(String name,int age,int salary,String country,String gender,int experience) {
        if(name.toLowerCase().startsWith("Иван")
        && age>=20 && age<=41
        && salary>=53000 && salary<=59000
        && country.equalsIgnoreCase("Нидерланды")
        && gender.equalsIgnoreCase("Мужской")
        && experience==13){
            return true;
        }
        return false;
    }
}
/*
Name: "Иван"
Age: от 20 до 41
Salary: от 53000 руб до 59000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 13 лет*/
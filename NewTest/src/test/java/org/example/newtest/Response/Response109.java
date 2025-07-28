package org.example.newtest.Response;

public class Response109 {
    public static boolean test109(String name,int age,int salary,String gender,String country,int experience){
        if(name.toLowerCase().startsWith("Михаил")
        && age>=21 && age<=35
        && salary>=20000 && salary<=22000
        && country.equalsIgnoreCase("Польша")
        && gender.equalsIgnoreCase("Мужской")
        && experience==7){
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 21 до 35
Salary: от 20000 руб до 22000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 7 лет*/
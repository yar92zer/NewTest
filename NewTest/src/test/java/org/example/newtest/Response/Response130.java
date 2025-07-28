package org.example.newtest.Response;

public class Response130 {
    public static boolean test130(String name,int age,int salary,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Мария")
        && age>=40 && age<=41
        && salary>=21000 && salary<=36000
        && country.equalsIgnoreCase("Чехия")
        && gender.equalsIgnoreCase("Женский")
        && experience==1){
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 40 до 41
Salary: от 21000 руб до 36000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 1 год*/
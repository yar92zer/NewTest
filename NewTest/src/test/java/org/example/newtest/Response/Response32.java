package org.example.newtest.Response;

public class Response32 {
    public static boolean test32(String name, int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Андрей")
        && age>= 22 && age<=39
        && zp >=21000 && zp<=29000
        && country.equalsIgnoreCase("Испания")
        && gender.equalsIgnoreCase("Мужской")
        && experience==3){
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 22 до 39
Zp: от 21000 руб до 29000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 3 года*/
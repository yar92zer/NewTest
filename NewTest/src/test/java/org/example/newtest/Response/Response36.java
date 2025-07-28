package org.example.newtest.Response;

public class Response36 {
    public static boolean test36(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Ольга")
        && age>=22 && age<=60
        && zp>=37000 && zp<=40000
        && country.equalsIgnoreCase("Нидерланды")
        && gender.equalsIgnoreCase("Женский")
        && experience==12){
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 22 до 60
Zp: от 37000 руб до 40000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 12 лет*/
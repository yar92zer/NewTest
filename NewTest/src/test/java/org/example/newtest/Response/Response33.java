package org.example.newtest.Response;

public class Response33 {
    public static boolean test33(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Александр")
        && age>=21&& age<=30
        && zp>=21000 && zp<=31000
        && country.equalsIgnoreCase("Чехия")
        &&gender.equalsIgnoreCase("Мужской")
        && experience==1){
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 21 до 30
Zp: от 21000 руб до 31000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 1 год*/
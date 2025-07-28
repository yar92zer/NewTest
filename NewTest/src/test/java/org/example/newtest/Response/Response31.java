package org.example.newtest.Response;

public class Response31 {
    public static boolean test31(String name,int age,int zp,String country,String gender,int experience){
        if(name.toLowerCase().startsWith("Юлия")
        && age >=23&&  age <=29
        &&zp >=29000 && zp<=38000
        &&country.equalsIgnoreCase("Бельгия")
        && gender.equalsIgnoreCase("Женский")
        && experience==9){
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 23 до 29
Zp: от 29000 руб до 38000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 9 лет*/